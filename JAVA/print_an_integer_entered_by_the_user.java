import java.util.Scanner;
public class print_an_integer_entered_by_the_user{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        System.out.println("You entered number is: "+number);
    
    }
}
