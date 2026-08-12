import java.util.*;
public class Recursion1{
public static void printSum(int i,int n,int s){
if(i==n){
s+=i;
System.out.println(s);
return;
}
s+=i;
printSum(i+1,n,s);
}

public static void main(String[] args){
printSum(1,5,0);
}
}