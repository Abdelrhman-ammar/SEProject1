import java.util.Random;

public class Account
{
    private double balance;
    private int acount_number;
    private static int for_rand=0;
    public Account()
    {
        balance=0;
        acount_number=0;
    }
    public Account(String balance,int acount_number)
    {
        double val = Double.parseDouble(balance);
        this.balance=val;

        this.acount_number=acount_number;
    }
    public void set_balance(String balance)
    {
        double val = Double.parseDouble(balance);
        this.balance=val;
    }
    public void set_acount_number()
    {
        int random_num = (int) (Math.random() * ((for_rand+5) - (for_rand) + 1) + (for_rand));
        this.acount_number=random_num;
        for_rand+=5;
    }
    public double get_balance()
    {
         return balance;
    }
    public int get_acount_number()
    {
        return  acount_number;
    }

    public  String toString(){
        String back;
        back="yor balance = "+balance+"\n"+"your acount number is : "+acount_number;
        return back;
    }
    public void withdraw(String amount)
    {
        double val = Double.parseDouble(amount);;
        if(balance<=0)
        {
            System.out.println("sorry you can not Withdraw any more \n");

        }
        else
        {
            balance=balance-val;
        }
    }
    public void deposit (double amount)
    {
        balance=balance+amount;
    }

}
