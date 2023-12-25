//compile-time
public class reverse_a_number{
    public static void main(String[] args){
        int num=5678,reverse=0,digit;
        System.out.println("Original value: "+num);
        while(num!=0){
            digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        System.out.println("Reversed value: "+reverse);
    }
}
//run-time
/*import java.util.Scanner;
public class reverse_a_number{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int reverse=0,digit;
        for(;num!=0;){
            digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        System.out.println("Reversed value: "+reverse);
    }
}*/
