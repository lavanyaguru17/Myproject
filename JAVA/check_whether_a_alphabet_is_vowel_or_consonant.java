//compile-time
public class check_whether_a_alphabet_is_vowel_or_consonant{
    public static void main(String[] args){
        char ch='I';
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is Vowel");
        }
        else{
            System.out.println(ch+" is Consonant");
        }
     }
}
//run-time using switch 
/*import java.util.Scanner;
public class check_whether_a_alphabet_is_vowel_or_consonant{
    public static void main(String[] args){
        System.out.print("Enter letter: ");
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch+" is vowel");
                break;
            default:
                System.out.println(ch+" is consonant");
        }
    }
}*/
