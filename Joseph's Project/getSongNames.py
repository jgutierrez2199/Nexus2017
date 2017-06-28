from selenium import webdriver

#Setup the browser
browser = webdriver.Firefox()


#Open URL file
file = open("songURLs.txt", 'r')
#Setup output file
titleFile = open("songTitles.txt", 'w')

#Go line by line open site and retrive info, save in Array
numLines = sum(1 for line in open('songURLs.txt'))

i = 0
for i in range(numLines):
    browser.get(file.readline())
    elem = browser.find_element_by_tag_name('title')
    title = elem.text
    #Cut off "Spotify... - "
    title = title[21:]
    print("%i of %i complete! %s" % (int(i) + 1, numLines, title) )
    titleFile.write(title + "\n")
    i += 1
