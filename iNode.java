public class iNode{
  //variables
  String name;
  String favColor = "black";
  iNode next;

  //constructors
  public iNode (){

  }

  public iNode(String s, iNode n){
    name = s;
    next = n;
  }

  public iNode(String s, String c, iNode n){
    name = s;
    next = n;
    favColor = c;
  }

  //setters
  public void setName(String s){
    name = s;
  }

  public void setNext(iNode n){
    next = n;
  }

  public void setColor(String c){
    favColor = c;
  }

  //getters
  public String getName(){
    return name;
  }

  public iNode getNext(){
    return next;
  }

  public String getColor(){
    return favColor;
  }
  //any extra methods
  public void printNode(){
    System.out.println("The intern's name is " + name + " and their favorite color is " + favColor);
  }
}
