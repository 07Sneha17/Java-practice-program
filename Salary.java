import java.util.*;
public class Salary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float bs=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float other=sc.nextFloat();
        float ts=bs+hra+da+other;
        System.out.println(ts);
    }
}
