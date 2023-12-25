//compile-time
public class count_number_of_digits_in_an_integer{
    public static void main(String[] arg){
      int count=0,num=123987;
      for(;num!=0;count++){
        num/=10;
      }
      System.out.println("Number of digits: "+count);
    }
}
//run-time
/*import java.util.Scanner;
public class count_number_of_digits_in_an_integer{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
         System.out.println("Number of digits: "+count);
    }
}*/
