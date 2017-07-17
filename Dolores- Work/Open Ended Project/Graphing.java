import java.util.Scanner;

public class Graphing{
    Scanner scnr = new Scanner(System.in);{
    //Use a switch statement to determine what type of function they want to graph.
    System.out.println("Which type of function would you like to graph?");
    System.out.println("a) Polynomial");
    System.out.println("b) Trigonometric");
    System.out.println("c) Logarithmic");
    System.out.println("d) Rational");
    System.out.println("e) Exponential");

    switch (scnr.nextLine().charAt(0)){
        case 'a': case 'A':
            polynomial();
            break;
        case 'b': case 'B':
            trigonometric();
            break;
        case 'c': case 'C':
            logarithmic();
            break;
        case 'd': case'D':
             rational();
            break;
        case 'e': case 'E':
             exponential();
            break;
        default:
            System.out.println("That is not a valid option!");
            break;
    }
  }

    public static void polynomial(){
      System.out.println("What is the degree of the Polynomial?");
      Scanner scnr = new Scanner(System.in);
      int degree = scnr.nextInt();
      double [] coeff = new double [degree + 1];

      for(int i = 0; i < coeff.length; i++){
        System.out.println("Please enter the coeffecient for the " + i + " degree term.");
        coeff[i] = scnr.nextDouble();
      }
    }
    public static void rational(){
      System.out.println("What is the degree of the Rational?");
      Scanner scnr = new Scanner(System.in);
      int degree = scnr.nextInt();
      double [] coeff = new double [degree + 1];

      for(int i = 0; i < coeff.length; i++){
        System.out.println("Please enter the coeffecient for the " + i + " degree term.");
        coeff[i] = scnr.nextDouble();
      }
        
    }
    //Use a switch statement to determine which specific function
    public static void trigonometric(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("What specific function would you like to graph?");
        System.out.println("a) Sin(x)");
        System.out.println("b) Cos(x)");
        System.out.println("c) Tan(x)");

        double a = 1.0;
        double b = 1.0;

        switch(scnr.nextLine().charAt(0)){
          case 'a': case 'A':
            System.out.println("What are the coeff. for a and b in the form");
            System.out.println("\'a Sin(b x)\'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            //graphSin(a,b);
            break;
          case 'b': case 'B':
            System.out.println("What are the coeff. for a and b in the form");
            System.out.println("\'a Cos(b x)\'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            //graphCos(a,b);
            break;
          case 'c': case 'C':
            System.out.println("What are the coeff. for a and b in the form");
            System.out.println("\'a Tan(b x)\'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            //graphTan(a,b);
            break;
          }
    }
        public static void logarithmic(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("What specific function would you like to graph?");
        System.out.println("a) log(x)");
        System.out.println("b) ln(x)");

        double a = 1.0;
        double b = 1.0;
        double c = 1.0;

        switch(scnr.nextLine().charAt(0)){
          case 'a': case 'A':
            System.out.println("What are the coeff. for a and x in the form");
            System.out.println("\'a log(b x)\'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            //graphlog(a,b);
            break;
          case 'x': case 'X':
            System.out.println("What are the coeff. for a and x in the form");
            System.out.println("\'a ln(b x)\'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            //graphln(a,b);
    }
        public static void rational(){
        Scanner scnr = new Scanner(System.in);
            
        double a = 1.0;
        double b = 1.0;

            System.out.println("What are the coeff. for a and b in the form");
            System.out.println("\'a/bx^c \'");
            System.out.println("Please enter a value for a");
            a = scnr.nextDouble();
            System.out.println("Please enter a value for b");
            b = scnr.nextDouble();
            System.out.println("Please enter a value for c");
            c = scnr.nextDouble();
            //graphlog(a,b);
            break;
            
        public static void exponential(){
        System.out.println("What specific function would you like to graph?");
        System.out.println("a)n^x");
        System.out.println("b)e^x");
            
        switch(scnr.nextLine()charAt(0)){
            case 'a': case 'A':
                System.out.println("What are the parameters a , b and n");
                System.out.println("of the form an^(bx)");
                System.out.println("Please enter a value for a");
                a=scnr.nextDouble();
                System.out.println("Please enter a value for b");
                b=scnr.nextDouble();
                System.out.println("Please enter a value for n");
                n=scnr.nextDouble();
            case 'b': case 'B':
                System.out.println("What are the paramters a , b and e");
                System.out.println("of the form ae^(bx)");
                System.out,println("Please enter a value for a");
                a=scnr.nextDouble();
                System.out.println("Please enter a value for b");
                b=scnr.nextDouble();
                System.out.println("Please enter a value for e");
                e=scnr.nextDouble();
        }
      }
    //Take in the parameters needed

    //Generate Points

    //Plot it
    }
}