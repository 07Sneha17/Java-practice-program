import java.util.*;
public class Pattern4{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int n=sc.nextInt();
for(int i=n;i<=1;i--){
for(int j=4;j<=i;j--){
System.out.print("*");}
System.out.print("\n");}
}
}