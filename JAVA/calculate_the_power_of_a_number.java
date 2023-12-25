//compile-time using Math.pow() function
public class calculate_the_power_of_a_number{
    public static void main(String[] args){
        int base=3,exponent=-4;
        Double result;
        result=Math.pow(base,exponent);
        System.out.print("Answer is: "+result);

    }
}
//run-time without using Math.pow() function
/*import java.util.Scanner;
public class calculate_the_power_of_a_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter base: ");
        int base=s.nextInt();
        System.out.print("Enter exponent: ");
        int exponent=s.nextInt();
        int result=1;
        while(exponent!=0){
            result=result*base;
            exponent--;
        }
        System.out.print("Answer is: "+result);
    }
}*/
