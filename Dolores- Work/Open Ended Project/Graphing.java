import java.util.Scanner;

public class Graphing{
    Scanner scnr = new Scanner(System.in)
    //Use a switch statement to determine what type of function they want to graph.
    System.out.println("Which type of function would you like to graph\?");
    System.out.println("a) Polynomial");
    System.out.println("b) Trigonometric");
    System.out.println("c) Logarithmic");
    System.out.println("d) Rational");
    System.out.println("e) Exponential");
    
    switch scnr.nextChar(){
        'a' ,  'A' :
            polynomial();
            break;
        'b' ,  'B' :
            trigonometric();
            break;
        'c' ,  'C' :
            logarithmic();
            break;
        'd' ,  'D' :
            rational();
            break;
        'e' ,  'E' :
            exponential();
            break;
        default:
            System.out.println("That is not a valid option!");
            break;
    }
    
    //Use a switch statement to determine which specific function
    public static void trigonometric(){
        Scanner scnr = new Scanner(System.in)
            
        System.out.println("What specific function would you like to graph?");
        System.out.println("a) Sin(x)");
        System.out.println("b) Cos(x)");
        System.out.println("c) Tan(x)");
        
        'a' , 'A' ;
        S.O.P("What's the coeff:?");
        S.O.P.(Sin(bx))
            S.O.P("please enter a value for a")
        'b' , 'B' ;
        S.O.P("What's the coeff")
        S.O.P.(Sin(bx))
            S.O.P("please enter a value for b")
        'c' , 'C' ;
        S.O.P("What's the coeff")
        S.O.P.(Sin(bx))
            S.O.P("please enter a value for c")
        'd' , 'D' ;
        S.O.P("What's the coeff")
        S.O.P.(Sin(bx))
            S.O.P("please enter a value for d")
        'e' , 'E' ;
        S.O.P("What's the coeff")
        S.O.P.(Sin(bx))
            S.O.P("please enter a value for e")
        Scnr.nextDouble;
    }
    //Take in the parameters needed
    public static double get Input()
    line = Scnr.nextline();
        if (line.charAt(0)isLetter()){
            return double.MIN-VALUE;
        }
    else{
        double num = Double.parseDouble(line);
            return num;
    }
    in Main:
    if(getInput() = = Double.MIN-VALUE);
        //its a unknown
    else{
        
    }
    //Generate Points
    import java.lans.NumberFormatException
        boolean numAccepted = false
        While(!numAccepted){
        try{
            Double.parseDouble()
        }
        Catch(NumberFormatException n){
            S.O.P("Please check and Try Again");
            Continue;
        }
        numAccepted = true;
    }
    //Plot it
}