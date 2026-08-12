import java.util.*;
public class Arrays_example{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to input in array");
int size=sc.nextInt();
int number[]=new int[size];
System.out.println("Enter the elements");

for(int i=0;i<size;i++){
number[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
System.out.println("output is:"+number[i]);
}

}
}