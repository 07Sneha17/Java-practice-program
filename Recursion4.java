import java.util.*;
public class Recursion4{

public static void printRev(String str,int idx){
if(idx==0){
System.out.println(str.charAt(idx));
return;}
System.out.print(str.charAt(idx));
printRev(str,idx-1);
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to be reversed");
String str=sc.next();
printRev(str,str.length()-1);
}
}