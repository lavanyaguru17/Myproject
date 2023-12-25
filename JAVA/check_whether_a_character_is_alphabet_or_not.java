//compile-time
public class check_whether_a_character_is_alphabet_or_not{
    public static void main(String[] args){
        char ch='+';
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            System.out.println(ch+" is alphabet");
        else
            System.out.println(ch+" is not alphabet");
    }
}
//run-time without using if-else
/*import java.util.Scanner;
public class check_whether_a_character_is_alphabet_or_not{
    public static void main(String[] args){
        System.out.print("Enter character: ");
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        String result=((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))?ch+" is alphabet":ch+" is not alphabet";
        System.out.println(result);
    }
}*/
//run-time using isAlphabetic()method
/*import java.util.Scanner;
public class check_whether_a_character_is_alphabet_or_not{
    public static void main(String[] args){
        System.out.print("Enter character: ");
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println(ch+" is alphabet");
        }
        else{
            System.out.println(ch+" is not alphabet");
        }
    }      
}*/

