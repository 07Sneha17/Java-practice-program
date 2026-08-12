import java.util.*;
public class Array_mat1{

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the rows");
int r=sc.nextInt();
System.out.println("enter the columns");
int c=sc.nextInt();
int [][] arr=new int[r][c];
System.out.println("enter the elements of rows and columns");
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      arr[i][j]=sc.nextInt();
    }
}
System.out.println("enter the number to be find");
int x=sc.nextInt();
 for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
if(arr[i][j]==x){
System.out.println("nuber found at location:("+i+","+j+")");
          }
}
}

}
}