#################################################################
#####                                                       #####
#####                    Joseph Gutierrez                   #####
#####               Last Modified: June 27, 2017            #####
#####                                                       #####
#####   This is a program that allows the user to download  #####
#####   any song by ripping the audio from You Tube using   #####
#####   a site called "Mp3juices". It can handle a single   #####
#####   song name or a the name of a .txt file in order to  #####
#####   know which songs to download. This input can either #####
#####   provided by command line arguments or in the actual #####
#####   program as input.                                   #####
#####                                                       #####
#####   Note: This program only gets the most relevant      #####
#####   download according to "Mp3Juices" (Top search hit)  #####
#####   added functionality will later be added in order to #####
#####   "clean up" the tracks and possibly even choose the  #####
#####   best quality audio track.                           #####
#####                                                       #####
#################################################################

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time
import sys
import threading

def ifFile (str):
    if ".txt" in str:
        return True
    else:
        return False

def downloadSong(title):
    #Setup webdriver
    browser = webdriver.Firefox()
    completed = False
    while completed != True:
        try:
            #Open site home page
            browser.get('http://www.mp3juices.cc/')
            search = browser.find_element_by_id('query')
            search.send_keys(title + Keys.ENTER)
            #Go to first download link
            browser.implicitly_wait(10)
            downloadButton = browser.find_elements_by_link_text('Download')
            downloadButton[0].click()
            #wait for download link and download song
            element= WebDriverWait(browser, 60).until(
                EC.element_to_be_clickable((By.CLASS_NAME, "url")))
            getSong = browser.find_element_by_class_name('url')
            getSong.click()
            time.sleep(2)
        except TimeoutException:
            print("Having some trouble, I will try again")
        else:
            completed = True

def getSongsFromFile(songs, startIndex, endIndex):
    # setup an Error File
    errorFile = open('SongsNotDownloaded.txt','w')
    #Setup webdriver
    browser = webdriver.Firefox()

    #for each line in the list within the index
    for i in range(startIndex, endIndex):
        title = songs[i]

        completed = False
        while completed != True:
            try:
                #Open site home page
                browser.get('http://www.mp3juices.cc/')
                search = browser.find_element_by_id('query')
                search.send_keys(title + Keys.ENTER)
                #Go to first download link
                browser.implicitly_wait(10)
                downloadButton = browser.find_elements_by_link_text('Download')
                downloadButton[0].click()
                #wait for download link and download song
                element= WebDriverWait(browser, 60).until(
                    EC.element_to_be_clickable((By.CLASS_NAME, "url")))
                getSong = browser.find_element_by_class_name('url')
                getSong.click()
                time.sleep(2)
                print("Song %i complete: %s" % (int(i) + 1, title) )
            except Exception:
                errorFile.write(title + "\n")
            else:
                completed = True

def songsFromFileRunner(fileName):
    #Transfer the file to a list
    songs = []
    file = open(fileName, 'r')
    for line in file:
        songs.append(line)

    print(len(songs))
    # Create and start the Thread objects.
    downloadThreads = []             # a list of all the Thread objects
    for i in range(0, len(songs), 100):    # loops bundles songs into groups of 100
        if (i + 99) < len(songs):
            downloadThread = threading.Thread(target=getSongsFromFile, args=(songs, i, (i + 99)))
        else:
            downloadThread = threading.Thread(target=getSongsFromFile, args=(songs, i, (i + (len(songs) - i))))
        downloadThreads.append(downloadThread)
        downloadThread.start()

    # Wait for all threads to end.
    for downloadThread in downloadThreads:
        downloadThread.join()
    print('Done downloading.')

if len(sys.argv) > 1:
    # Get song from command line.
    str = ' '.join(sys.argv[1:])
    isFile = ifFile(str)
    if isFile:
        songsFromFileRunner(str)
    else:
        downloadSong(str)


else:
    print("Please Enter a .txt file name with extension or a song title\n")
    print("(If no extension is present, I will interpret it as a song title)")
    str = input()
    isFile = ifFile(str)
    if isFile:
        songsFromFileRunner(str)
    else:
        downloadSong(str)

print("Changing Metadata...")
