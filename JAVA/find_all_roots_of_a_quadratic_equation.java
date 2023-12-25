//compile-time
public class find_all_roots_of_a_quadratic_equation{
    public static void main(String[] args){
        double a=2.3,b=4,c=5.6;
        double root1,root2;
        double determinant=b*b-4*a*c;
        if (determinant>0){
            root1=(-b-Math.sqrt(determinant)/(2*a));
            root2=(-b+Math.sqrt(determinant)/(2*a));
            System.out.format("root1=%.2f and root2=%.2f",root1,root2);
        }
        else if (determinant==0){
            root1=root2=-b/(2*a);
            System.out.format("root1=root2=%.2f",root1);
        }
        else{
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("root1=%.2f+%.2fi",real,imaginary);
            System.out.format("\nroot2=%.2f-%.2fi",real,imaginary);
        }
    }
}
//run-time
/*import java.util.Scanner;
public class find_all_roots_of_a_quadratic_equation{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=input.nextDouble();
        System.out.print("Enter b: ");
        double b=input.nextDouble();
        System.out.print("Enter c: ");
        double c=input.nextDouble();
        double root1,root2;
        double determinant=b*b-4*a*c;
        if (determinant>0){
            root1=(-b+Math.sqrt(determinant)/(2*a));
            root2=(-b-Math.sqrt(determinant)/(2*a));
            System.out.format("root1=%.2f and root2=%.2f",root1,root2);
        }
        else if (determinant==0){
            root1=root2=-b/(2*a);
            System.out.format("root1=root2=%.2f",root1);
        }
        else{
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant)/(2*a);
            System.out.format("root1=%.2f+%.2fi",real,imaginary);
            System.out.format("\nroot2=%.2f-%.2fi",real,imaginary);
        }
    }
}*/
