//generate multiplication table 
//compile-time
public class generate_multiplication_table{
    public static void main(String[] args){
        int num=5,i=1;
        while(i<=num){
            System.out.printf("%d*%d=%d\n",num,i,num*i);
            i++;
        }
    }
}
//run-time
/*import java.util.Scanner;
public class generate_multiplication_table{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<=num;i++){
            System.out.printf("%d*%d=%d\n",num,i,num*i);
        }
    }
}*/
