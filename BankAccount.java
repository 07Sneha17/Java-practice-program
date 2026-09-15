import java.util.*;
public class BankAccount {
    Scanner sc=new Scanner(System.in);
    double b=sc.nextDouble();
    double dep_amt=sc.nextDouble();  
    double with_amt=sc.nextDouble();
    Bank acc=new Bank(b);
    
}
public class Bank{
    double b;
    Bank(double b){
        this.b=b;
    }
    void deposit(double amt){
        b=b+amt;
    }
    boolean withdrawl(double amt){
        if(amt>b){
            return false;
        }
        b=b-amt;
        return true;
    }
    double check_bal(){
        return b;
    }
}