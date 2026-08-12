import java.util.*;
public class Functions1{

public static void factorial(int a){

int f=1;
for(int i=a;i>=1;i--){
f=f*i;}
System.out.println(f);
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
factorial(a);
}
}