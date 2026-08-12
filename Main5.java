import java.util.*;
public class Main5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int org=n;
        int c=0;
        int s=0;
         int temp=n;
        while (temp!=0) {
             int digit = temp % 10;
             s=s+(int)Math.pow(digit,c);
            temp=temp/10;
             c++;
        }
          if (s==temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }
}