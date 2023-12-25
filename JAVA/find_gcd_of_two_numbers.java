//compile-time
public class find_gcd_of_two_numbers{
    public static void main(String[] args){
        int n1=45,n2=153,gcd=1,i=1;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD is: "+gcd);
    }
}
//run-time
/*import java.util.Scanner;
public class find_gcd_of_two_numbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=s.nextInt();
        System.out.print("Enter second number: ");
        int n2=s.nextInt();
        n1=n1>0?n1:-n1;
        n2=n2>0?n2:-n2;
        int gcd=1;
        for(;n1!=n2;){
            if(n1>n2){
                n1=n1-n2;
            }
            if(n2>n1){
                n2=n2-n1;
            }
        }
        gcd=n1;
        System.out.println("GCD is: "+gcd);
    }
}*/
