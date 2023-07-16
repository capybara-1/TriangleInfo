import java.util.*;
class Main {
    public static void main(String[] args) {
        int loop = 1;
        while (loop == 1){
            Scanner sc = new Scanner(System.in);
            double a;
            double b;
            double c;
            double tru = 1;
            while (tru == 1){
                System.out.println("Please enter 3 numbers for A,B,C Values (press 0,0,0 to terminate)");
                System.out.println("A value: ");
                a = sc.nextDouble();
                System.out.println("B value: ");
                b = sc.nextDouble();
                System.out.println("C value: ");
                c = sc.nextDouble();
                if ( a > 0 && b > 0 && c > 0){
                    tru = 2;
                } else if ( a < 0 || b < 0 || c < 0){
                    System.out.println("Please enter a positive number");
                } else if ( a == 0 && b == 0 && c == 0){
                    System.out.println("Thank you. Goodbye :)");
                    tru = 2;
                    loop = 0;

                }
                printCheckSense(a,b,c);
            }
        }

    }
    public static void printCheckSense(double a, double b,double c)  {
        if ( a < b + c && b < a + c && c < a + b){
            System.out.print("Triangle:");
            printCheckSide(a,b,c);
            System.out.print("Triangle angle: ");
            printCheckAngle(a,b,c);
            System.out.println("Angle amount:");
            printAngleamount(a,b,c);
        } else if ( a == 0 && b == 0 && c == 0){
            System.out.println("System Terminated");
        } else
            System.out.println("Triangle Cannot Be Formed");
    }




    public static void printCheckSide(double a, double b, double c)  {
        if ( a == b && b ==c && a == c){
            System.out.println(" Equilateral");
        } else if ( a == b || a == c || b == c){
            System.out.println(" Isocles");
        } else if (a != b || a != c || b != c) {
            System.out.println(" Scalene");
        } else if ( a == 0 && b == 0 && c == 0){
            System.out.println("");
        }
    }
    public static void printCheckAngle(double a, double b, double c){
        a = ( a * a);
        b = ( b * b);
        c = ( c * c);
        if ( a + b == c || a + c == b || c + b == a){
            System.out.println("Right Angle Triangle");
        } else if ( a + b > c && b + c > a && c + a > b){
            System.out.println("Acute Triangle");
        } else {
            System.out.println("Obtuse Triangle");
        }
    }
    public static void printAngleamount(double a, double b,double c){
        double angleA = Math.round(Math.toDegrees(Math.acos((double) (( b * b) + ( c * c) - ( a * a)) / (2 * b * c))));
        System.out.println("Angle A is " + angleA + "°");
        double angleB = Math.round(Math.toDegrees(Math.acos((double) (( c * c) + ( a * a) - (b * b)) / (2 * c * a))));
        System.out.println("Angle B is " + angleB + "°");
        double angleC = 180 - (angleA + angleB);
        System.out.println("Angle C is " + angleC + "°");
    }

}