//compile-time using for loop
public class calculate_the_sum_of_natural_numbers{
    public static void main(String[] args){
        int sum=0,num=50;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
         System.out.print("Sum is: "+sum);
    }
}
//run-time using while loop
/*import java.util.Scanner;
public class calculate_the_sum_of_natural_numbers{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0,i=1;
        while(i<=num){
            sum+=i;
            i++;
        }
        System.out.println("Sum is: "+sum);
    }
}*/
