import java.util.*;
public class Recursion2{
public static int calc_fact(int n){
if(n==1 || n==0 ){
return 1;
}
return n * calc_fact(n - 1);
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to be calculated for factorial");
int z=sc.nextInt();
System.out.println("Factorial of "+z+ " is "+calc_fact(z));

}
}