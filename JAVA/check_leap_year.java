//compile-time
public class check_leap_year{
    public static void main(String[] args){
        int year=2012;
        boolean leap=false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0)
                leap=true;
                else
                leap=false;
            }
            else
            leap=true;
        }
        else
        leap=false;
        if(leap)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
//run-time
/*import java.util.Scanner;
public class check_leap_year{
    public static void main(String[] args){
        System.out.print("Enter year: ");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        boolean leap=false;
        if (year%4==0){
            if (year%100==0){
                if (year%400==0)
                leap=true;
                else
                leap=false;
            }
            else
            leap=true;
        }
        else
        leap=false;
        if(leap)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");      
    }
}*/
