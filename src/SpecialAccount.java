
public class SpecialAccount extends  Account
{
    public void withdraw(String amount)
    {

        double val = Double.parseDouble(amount);;
        if(get_balance()-val<-1000)
        {
            System.out.println("sorry you can not Withdraw any more \n");
        }
        else
        {
            String s=""+(get_balance()-val);
            set_balance(s);
        }
    }
}
