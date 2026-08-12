import java.util.*;
public class Arrays_example3{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to input in array");
int size=sc.nextInt();
int number[]=new int[size];
System.out.println("Enter the elements");

for(int i=0;i<size;i++){
number[i]=sc.nextInt();
}
Boolean isAscending=true;
for(int i=0;i<number.length-1;i++){
if(number[i]>number[i+1]){
     isAscending=false;}
}
if(isAscending){
System.out.println("Array is in ascending order");
}
else{
System.out.println("Array is not in ascending order");
}

}
}