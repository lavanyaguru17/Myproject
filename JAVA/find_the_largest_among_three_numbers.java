//compile-time
public class find_the_largest_among_three_numbers{
    public static void main(String[] args){
        double n1=-7.9,n2=9,n3=9.8;
        if(n1>=n2 && n1>=n3)
        System.out.println(n1+" si largest number");
        else if(n2>=n1 && n2>=n3)
        System.out.println(n2+" is largest number");
        else
        System.out.println(n3+" is largest number");
    }
}
//run-time using nested if...else
/*import java.util.Scanner;
public class find_the_largest_among_three_numbers{
    public static void main(String[] args){
        double fno,sno,tno;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        fno=input.nextDouble();
        System.out.print("Enter second number: ");
        sno=input.nextDouble();
        System.out.print("Enter third number: ");
        tno=input.nextDouble();
        if(fno>=sno){
            if(fno>=tno){
                System.out.println(fno+" is largest");
            }
            else{
                System.out.println(tno+" is largest");
            }
        }
        else{
            if(sno>=tno){
                System.out.println(sno+" is largest");
            }
            else{
                System.out.println(tno+" is largest");
            }
        }  
    }
}*/
