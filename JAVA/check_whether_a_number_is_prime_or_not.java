//compile-time
public class check_whether_a_number_is_prime_or_not{
    public static void main(String[] args){
        int num=28;
        boolean flag=false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(num+" is a prime");
        }
        else{
            System.out.println(num+" is not a prime");
        }
    }
}
//run-time
/*import java.util.Scanner;
public class check_whether_a_number_is_prime_or_not{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int i=2;
        boolean flag=false;
        while(i<=num/2){
            if(num%i==0){
                flag=true;
                break;
            }
            i++;
        }
        if(!flag){
            System.out.println(num+" is a prime");
        }
        else{
            System.out.println(num+" is not a prime");
        }
    }
}*/

