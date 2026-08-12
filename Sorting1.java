import java.util.*;
public class Sorting1{
public static void selection_sort(int arr[]){
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
}


public static void main(String [] args){
int arr[]={9,7,0,11,29};
for(int i=0;i<arr.length-1;i++){
int s=i;
for(int j=i+1;j<arr.length;j++){
if(arr[s]>arr[j]){
s=j;}
}
int temp=arr[s];
arr[s]=arr[i];
arr[i]=temp;
}
selection_sort(arr);

}
}