//compile-time
public class find_lcm_of_two_numbers{
    public static void main(String[] args){
        int n1=72,n2=120,lcm;
        lcm=n1>n2?n1:n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("LCM of "+n1+" and "+n2+" is: "+lcm);
                break;
            }
            lcm++;
        }
    }
}
//run-time using gcd method
/*import java.util.Scanner;
public class find_lcm_of_two_numbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=s.nextInt();
        System.out.print("Enter second number: ");
        int n2=s.nextInt();
        int gcd=1,i,lcm;
        for(i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
            gcd=i;
            }
        }
        lcm=(n1*n2)/gcd;
        System.out.println("LCM of "+n1+" and "+n2+" is: "+lcm);
    }
}*/
