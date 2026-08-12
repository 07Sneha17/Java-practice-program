import java.util.*;
public class Arrays_example2{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to input in array");
int size=sc.nextInt();
int number[]=new int[size];
System.out.println("Enter the elements");

for(int i=0;i<size;i++){
number[i]=sc.nextInt();
}
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(int i=0;i<number.length;i++){
if(number[i]<min){
min=number[i];}
if(number[i]>max){
max=number[i];}
}
System.out.println("Largest number:"+max);
System.out.println("Smallest number:"+min);
}
}