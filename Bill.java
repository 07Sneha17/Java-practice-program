import java.util.*;
public class Bill{
      public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        int bill;
        if(unit<=100){
            bill=100*2;
        }
        else if(unit<=200){
           bill = 100 * 2 + (unit - 100) * 3;
        }
        else if(unit<=400){
            bill=100*2+100*3+(unit-200)*5;
        }
         else{
           bill = 100 * 2 + 100 * 3 + 200 * 5 + (unit- 400) * 7;
         }
        System.out.println(bill);
      }
}