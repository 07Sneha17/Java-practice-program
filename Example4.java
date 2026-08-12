import java.util.*;
public class Example4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int n1=sc.nextInt();
System.out.println("enter the second number");
int n2=sc.nextInt();
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplicaton");
System.out.println("4.division");
System.out.println("5.modulus");
System.out.println("Enter your choice");
int var=sc.nextInt();
switch(var){
case 1:System.out.println("result:"+(n1+n2));
break;
case 2:System.out.println("result:"+(n1-n2));
break;
case 3:System.out.println("result:"+(n1*n2));
break;
case 4:System.out.println("result:"+(n1/n2));
break;
case 5:System.out.println("result:"+(n1%n2));
break;
default:System.out.println("invalid statement");
}
}}