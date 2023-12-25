//compile-time
public class display_fibonacci_series{
    public static void main(String[] args){
        int num=10,firstno=0,secondno=1,nextno;
        for(int i=1;i<=num;i++){
            System.out.println("Fibonacci series upto "+num+" is: "+firstno);
            nextno=firstno+secondno;
            firstno=secondno;
            secondno=nextno;
        }
    }
}*/
//run-time
/*import java.util.Scanner;
public class display_fibonacci_series{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int firstno=0,secondno=1,nextno,i=1;
        while(i<=num){
            System.out.println("Fibonacci series upto "+num+" is: "+firstno);
            nextno=firstno+secondno;
            firstno=secondno;
            secondno=nextno;
            i++;
        }
    }
}*/
//run-time upto a given number
/*import java.util.Scanner;
public class display_fibonacci_series{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int firstno=0,secondno=1,nextno,i=1;
        System.out.println("Fibonacci series upto "+num+" is: ");
        while(firstno<=num){
            System.out.println(firstno);
            nextno=firstno+secondno;
            firstno=secondno;
            secondno=nextno;
            i++;
        }
    }
}*/
