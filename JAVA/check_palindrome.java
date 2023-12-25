//compile-time check palindrome in string
public class check_palindrome{
    public static void main(String[] args){
        String str="while",reversedStr="";
        int strLength=str.length();
        for(int i=strLength-1;i>=0;i--){
            reversedStr=reversedStr+str.charAt(i);
        }
        if(str.toLowerCase().equals(reversedStr.toLowerCase())){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
    }
}
//run-time check palindrome in number
/*import java.util.Scanner;
public class check_palindrome{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int reversednum=0,digit;
        int originalnum=num;
        while(num!=0){
            digit=num%10;
            reversednum=reversednum*10+digit;
            num/=10;
        }
        if(originalnum==reversednum){
            System.out.println(originalnum+" is a palindrome.");
        }
        else{
            System.out.println(originalnum+" is not a palindrome.");
        }
    }
}*/
