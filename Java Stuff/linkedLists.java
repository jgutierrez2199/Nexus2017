import java.util.Scanner;

public class linkedLists{
  public static void main(String [] args){
    iNode names = getNames();
    printLL(names);
  }

  public static iNode getNames(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the intern names. When done, enter \"exit\". ");
    boolean exit = false;
    String current = "";
    current = scan.nextLine();
    iNode interns = new iNode(current, null);

    while(!exit){
      current = scan.nextLine();
      current = current.toLowerCase();
      //exit Exit EXIT
      if(current.equals("exit")){
        exit = true;
      }
      else{
        //For debugging purposes
        //printLL(interns);
        //Add the name to the linked list
        interns = new iNode(current, interns);
      }
    }
    return interns;
  }

  public static void printLL(iNode A){
    System.out.println("\n\n");
    iNode temp = A;
    while(temp != null){
      temp.printNode();
      temp = temp.getNext();
    }
  }

}
