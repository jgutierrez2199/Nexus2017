import java.util.Scanner;

public class kinematics{
    public static void main (String[]args){
/***************************** User input ********************************/     
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("What is your time variable? If not given type 0");
        double t= scnr.nextDouble();
        
        System.out.println("What is your initial velocity? If not given type 0");
        double vinitial= scnr.nextDouble();
        
        System.out.println("What is your final velocity? If not given type 0");
        double vfinal= scnr.nextDouble();
        
        System.out.println("What is your displacement? If not given type 0");
        double x= scnr.nextDouble();
        
        System.out.println("What is your acceleration? If not given type 0");
        double a= scnr.nextDouble();
 /************************ Hard coded equations ***************************/       
        if(t !=0){
         if(vinitial !=0){
          if(a !=0){
            if(x== 0){
            //Solve for displacement
            x= (vinitial*t)+((0.5)*a*(Math.pow(t,2.0)));
            System.out.println("Your displacement is: " + x + "m");
            }
           }
          }
        }
/***************************************************************************/
        if(t !=0){
          if(a !=0){
            if(x== 0){
            //Solve for displacement when vinitial is zero
            x=(0.5)*a*(Math.pow(t,2.0));
            System.out.println("Your displacement is: " + x + "m");
            }
          }
        }
/****************************************************************************/
        
        else{
            System.out.println("Not enough Variables to solve for anything.");
        }
        
    }
}