/* This
 is
 a comment
 */


import java.util.Scanner;

public class arrays{
  public static void main(String [] args){
    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter the number of spots you have (In number form)");
    int numSpots = scnr.nextInt();

    String [] internNames = new String [numSpots];

    getNames(internNames);

    printArray(internNames);


  }

  public static void getNames(String [] A){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the intern names. When done, enter \"exit\". ");
    boolean exit = false;
    int numNames = 0;
    String current = "";

    while(!exit){
      if(numNames == A.length){//This is if the class is full
        System.out.println("Class is Full!");
        break;
      }
      current = scan.nextLine();
      current = current.toLowerCase();
      if(current.equals("exit")){
        exit = true;
      }
      else{
        A[numNames] = current;
        numNames ++;
      }

    }
  }

  public static void printArray(String [] A){
    for(int i = 0; i < A.length;i++){
      System.out.println(i + ". " + A[i]);
    }
  }
}
