//compile-time
public class display_alaphabets(AtoZ)_using_loop{
    public static void main(String[] args){
        char c='A';
        System.out.println("Alphabet(A to Z): ");
        for(c='A';c<='Z';c++){
            System.out.println(c);
        }
    }
}
//run-time
/*import java.util.Scanner;
public class display_alaphabets(AtoZ)_using_loop{
    public static void main(String[] args){
        System.out.print("Enter Alphabet(a to z) to start: ");
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        while(c<='z'){
            System.out.println(c);
            c++;
        }
    }
}*/
