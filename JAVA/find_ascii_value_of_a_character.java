//compile-time
public class find_ascii_value_of_a_character{
    public static void main(String args[]){
        char ch='a';
        int ascii=ch;
        float castascii=(float)ch;
        System.out.println("Ascii value of "+ch+" is  "+ascii);
        System.out.println("Ascii value of "+ch+" is "+castascii);
    }
}
//run-time
/*import java.util.Scanner;
public class find_ascii_value_of_a_character{
    public static void main(String[] args){
        System.out.print("Enter a character: ");
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        int ascii=ch;
        float castascii=(float)ch;
        System.out.println("ASCII value of "+ch+" is "+ascii);
        System.out.println("ASCII value of "+ch+" is "+castascii);
    }
}*/
