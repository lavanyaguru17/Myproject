//compile-time
public class check_whether_a_number_is_even_or_odd{
    public static void main(String[] args){
        int num=48;
        if(num%2==0){
            System.out.print(num+" is even");
        }
        else{
            System.out.print(num+" is odd");
        }
    }
}
//run-time without using if-else
/*import java.util.Scanner;
public class check_whether_a_number_is_even_or_odd{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        String result=(num%2==0)?"even":"odd";
            System.out.print(num+" is "+result);
        }
}*/


