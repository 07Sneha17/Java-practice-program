import java.util.*;
public class LCM{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
for(int i=1;;i++){
if(i%a==0 && i%b==0){
System.out.println("LCM= "+i);
break;
}
}
}}