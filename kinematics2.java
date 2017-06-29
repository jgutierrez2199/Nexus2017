import java.util.Scanner;
import java.lang.NumberFormatException;

public class kinematics2{
    public static void main (String[]args){
        //Get input from user
        parameters[] var = new parameters [5];
/* 0 -> distance, 1 -> time, 2 -> initial velocity, 3 -> final velocity, 4 -> acceleration */
        System.out.println("If the variable is Unknown type U. Only enter 3 variables");
        
        for( int i = 0; i < 5; i ++){
            switch(i){
                case 0:
                    System.out.println("Please enter a distance: ");
                    var[i] = getVar();
                    break;
                case 1:
                    System.out.println("Please enter a time: ");
                    var[i] = getVar();
                    break;
                case 2:
                    System.out.println("Please enter an initial velocity: ");
                    var[i] = getVar();
                    break;
                case 3:
                    System.out.println("Please enter a final velocity: ");
                    var[i] = getVar();
                    break;
                case 4:
                    System.out.println("Please enter an acceleration: ");
                    var[i] = getVar();
                    break;
                }
            var[i] = getVar();
        }
        //Figure out which method to use
        if(!var[1].unknown && !var[2].unknown && !var[4].unknown){
            m1(var[1], var[2], var[4]);
        }
        else if(!var[1].unknown && !var[3].unknown && !var[4].unknown){
            m2(var[1], var[3], var[4]);
        }
        else if(!var[1].unknown && !var[2].unknown && !var[3].unknown){
            m3(var[1], var[2], var[3]);
        }
        else if(!var[0].unknown && !var[2].unknown && !var[3].unknown){
            m4(var[0], var[2], var[3]);
        }
        else if(!var[0].unknown && !var[3].unknown && !var[4].unknown){
            m5(var[0], var[3], var[4]);
        }
        else if(!var[0].unknown && !var[2].unknown && !var[4].unknown){
            m6(var[0], var[2], var[4]);
        }
        else if(!var[2].unknown && !var[3].unknown && !var[4].unknown){
            m7(var[2], var[3], var[4]);
        }
        else{//Not enough info.
           
        }
    }
    //Write method that gets input from user
    public static parameters getVar(){
        Scanner scnr = new Scanner(System.in);
        String in = scnr.nextLine();
        parameters p = new parameters();
        
        boolean numAccepted = false;
        
        while(!numAccepted){
            try{
                if(Character.isLetter(in.charAt(0))){
                    p.unknown = true;
                    p.value = Double.MIN_VALUE;
                } else{
                    p.unknown = false;
                    p.value = Double.parseDouble(in);
                }
            }
            catch(NumberFormatException n){
                System.out.println("Please check variable and try again.");
                continue;
            }
            numAccepted = true;
        }
    }
    
    //Write method that actually solves
    public static void m1 (parameters t, parameters vo, parameters a){
        double vf = ((vo) + (a*t));
        double d = (((Math.pow(vf,2.0)) - (Math.pow(vo,2.0))) / (2*d));
        
        System.out.println("Final Velocity= " + vf + " m/s");
        System.out.println("Distance= " + d + " m");
    }
/***********************************************************************/    
    public static void m2 (parameters t, parameters vf, parameters a){
        double vo = ((-vf) + (a*t));
        double d = (((Math.pow(vf,2.0)) - (Math.pow(vo,2.0))) / (2*d));
        
        System.out.println("Initial Velocity= " + vo + " m/s");
        System.out.println("Distance= " + d + " m");
    }
/***********************************************************************/    
    public static void m3 (parameters t, parameters vo, parameters vf){
        double a = ((vf - vo) / (t));
        double d = (((Math.pow(vf,2.0)) - (Math.pow(vo,2.0))) / (2*d));
        
        System.out.println("Acceleration= " + a + " m/(s^2)");
        System.out.println("Distance= " + d + " m");
    }
/***********************************************************************/    
    public static void m4 (parameters d, parameters vo, parameters vf){
        double a = (((Math.pow(vf,2.0)) - (Math.pow(vo,2.0))) / (2*d));
        double t = ((vf - vo) / a);
        
        System.out.println("Acceleration= " + a + " m/(s^2)");
        System.out.println("Time= " + t + " s");
    }
/***********************************************************************/    
    public static void m5 (parameters d, parameters vf, parameters a){
        double vo = (Math.sqrt((Math.pow(vf,2.0)) - (2*a*d)));
        double t = ((vf - vo) / a);
        
        System.out.println("Initial Velocity= " + vo + " m/s");
        System.out.println("Time= " + t + " s");
    }
/***********************************************************************/    
    public static void m6 (parameters d, parameters vo, parameters a){
        double vf = (Math.sqrt((Math.pow(vo,2.0)) + (2*a*d)));
        double t = ((vf - vo) / a);
        
        System.out.println("Final Velocity= " + vf + " m/s");
        System.out.println("Time= " + t + " s");
    }
/***********************************************************************/    
    public static void m7 (parameters vo, parameters vf, parameters a){
        double t = ((vf - vo) / a);
        double d = (((Math.pow(vf,2.0)) - (Math.pow(vo,2.0))) / (2*d));
        
        System.out.println("Time= " + t + " s");
        System.out.println("Distance= " + d + " m");
    }
    
}