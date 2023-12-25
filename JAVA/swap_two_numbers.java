//compile-time
public class swap_two_numbers{
    public static void main(String[] args){
        int firstno=2;
        int secondno=9;
        System.out.println("----Before swap----");
        System.out.println("First number: "+firstno);
        System.out.println("Second number: "+secondno);
        int temp=firstno;
        firstno=secondno;
        secondno=temp;
        System.out.println("----After swap----");
        System.out.println("First number: "+firstno);
        System.out.println("Second number: "+secondno);
    }
}
//without using third variable
/*public class swap_two_numbers{
    public static void main(String[] args){
        int firstno=90;
        int secondno=50;
        System.out.println("----Before swap----");
        System.out.println("First number: "+firstno);
        System.out.println("Second number: "+secondno);
        firstno=firstno-secondno;
        secondno=firstno+secondno;
        firstno=secondno-firstno;
        System.out.println("----After swap----");
        System.out.println("First number: "+firstno);
        System.out.println("Second number: "+secondno);
    }
}*/
//run-time
/*import java.util.Scanner;
public class swap_two_numbers{
    public static void main(String[] args){
        System.out.print("Enter first number: ");
        Scanner firstno=new Scanner(System.in);
        int fn=firstno.nextInt();
        System.out.print("Enter second number: ");
        Scanner secondno=new Scanner(System.in);
        int sn=secondno.nextInt();
        System.out.println("----Before Swap----");
        System.out.println("First number: "+fn);
        System.out.println("Second number: "+sn);
        int tn=fn;
        fn=sn;
        sn=tn;
        System.out.println("----After Swap----");
        System.out.println("First number: "+fn);
        System.out.println("Second number: "+sn);
    }
}*/
