import java.util.*;
public class StrBuild{
public static void main(String[] args){
//declaration of String Builder class:
//StringBuilder sb=new StringBuilder("Tony");
//System.out.println(sb);

//charAt():
//System.out.println(sb.charAt(0));

//setcharAt() index:replace the character at index given
//sb.setCharAt(0,'p');
//System.out.println(sb);

//insert():
//00sb.insert(0,'S');
//System.out.println(sb);

//delete():
//sb.delete(0,1);
//System.out.println(sb);

//append():
//StringBuilder sb=new StringBuilder("h");
//sb.append("e");
//sb.append("l");
//sb.append("l");
//sb.append("o");

//reverse of a string:
StringBuilder sb=new StringBuilder("umbrella");
for(int i=0;i<sb.length()/2;i++){
int front=i;
int back=sb.length()-1-i;
char frontchar=sb.charAt(front);
char backchar=sb.charAt(back);
sb.setCharAt(front,backchar);
sb.setCharAt(back,frontchar);

}
System.out.println(sb);

}
}