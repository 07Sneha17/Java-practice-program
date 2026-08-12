import java.util.*;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int s=0;
        while (n != 0) {
            int digit=n%10;
            s=s+digit;
            n=n/10;
        }
        System.out.println(s);
    }
}