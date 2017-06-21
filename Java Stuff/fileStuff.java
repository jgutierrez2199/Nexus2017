import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class fileStuff{
  public static void main(String [] args) throws IOException{
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter the file name");
    String fileName = scnr.nextLine();

    FileReader fr = new FileReader(fileName);
    BufferedReader br = new BufferedReader(fr);

    String [] internNames = new String [Integer.parseInt(br.readLine())];//the first line of the text file

    getNames(internNames, br);

    printArray(internNames);

    printClassToFile(internNames);
  }

  //Gets names from file
  public static void getNames(String [] A, BufferedReader br) throws IOException{
    int numNames = 0;
    String line = "";

    while((line = br.readLine()) != null){
      if(numNames == A.length){//This is if the class is full
        System.out.println("Class is Full!");
        break;
      }
      A[numNames] = line;
      numNames ++;
    }
  }

  public static void printArray(String [] A){
    for(int i = 0; i < A.length;i++){
      System.out.println(i + ". " + A[i]);
    }
  }

  public static void printClassToFile (String [] A) throws IOException{
    File file = new File("internsRoster.txt");
    PrintWriter pw = new PrintWriter(file);
    pw.println("Nexus Intern Roster 2017");
    for(int i = 0; i < A.length;i++){
      pw.println(i + ". " + A[i]);
    }
    pw.close();
  }
}
