//compile-time
public class find_factorial_of_a_number{
    public static void main(String[] args){
        int num=10,factorial=1;
        for(int i=1;i<=num;++i){
            factorial*=i;
        }
        System.out.printf("Factorial of %d is %d",num,factorial);
    }
}
//run-time
/*import java.util.Scanner;
public class find_factorial_of_a_number{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int factorial=1,i=1;
        while(i<=num){
            factorial*=i;
            ++i;
        }
        System.out.printf("Factorial of %d is %d",num,factorial);
    }
}*/
//using BigInteger
/*import java.math.BigInteger;
public class find_factorial_of_a_number{
    public static void main(String[] args){
        BigInteger factorial=BigInteger.ONE;
        int num=20;
        for(int i=1;i<=num;++i){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d is %d",num,factorial);
    }
}*/
