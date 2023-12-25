//compile-time
public class check_whether_a_number_is_positive_or_negative{
    public static void main(String[] args){
        double num=-12.3;
        if(num<0.0){
            System.out.println(num+" is negative");
        }
        else if(num>0.0){
            System.out.println(num+" is positive");
        }
        else{
            System.out.println(num+" is zero");
        }
    }
}
//run-time
/*import java.util.Scanner;
public class check_whether_a_number_is_positive_or_negative{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner input=new Scanner(System.in);
        double num=input.nextDouble();
        if(num>0){
            System.out.println(num+" is positive");
        }
        else if(num<0){
            System.out.println(num+" is negative");
        }
        else{
            System.out.println(num+" is zero");
        }
    }
}*/

