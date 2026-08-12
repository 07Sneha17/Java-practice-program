import java.util.*;
public class Functions{

public static int calculateSum(int a,int b){
int s=a+b;
return s;
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int sum=calculateSum(a,b);
System.out.println("Sum of A and B:"+sum);
}
}