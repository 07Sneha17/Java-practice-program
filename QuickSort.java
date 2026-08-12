import java.util.*;
public class QuickSort{

public static int partition(int arr[],int low,int high){
int pivot=arr[high];
int i=low-1;
for(int j=low;j<high;j++){
if(arr[j]<pivot){
i++;
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}//endIf
}//endFor
i++;
int temp=arr[i];
arr[i]=pivot;
arr[high]=temp;
return i;

}//end of function

public static void quick(int arr[],int low,int high){
if(low<high){
int pidx=partition(arr,low,high);
quick(arr,low,pidx-1);
quick(arr,pidx+1,high);
}//endIf
}//end QuickFunc

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("Enter the Elements");
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
quick(arr,0,size-1);
System.out.println("Sorted elements are:");
for(int i=0;i<size;i++){
System.out.println(arr[i]+" ");
}
System.out.println();
}//end of main
}

