import java.util.Scanner;

public class mainClass
{
    public static void main(String[] args)
    {
     /*   Client x;
        x = new Client();
        String w;
        Scanner input = new Scanner(System.in);
        w = input.next();
        x.setNationalId(w);
        System.out.println(x.toString());*/

     /*
     Account w = new SpecialAccount();
     Client x = new CommericalClient(w);
     x.setNationalId("12345678");
     System.out.println(x.getNationalId());

     */
     SpecialAccount c1=new SpecialAccount();
     c1.set_balance("2500");
     c1.set_acount_number();
        System.out.println( c1.get_balance());
        System.out.println( c1.get_acount_number());

        SpecialAccount c2=new SpecialAccount();
        c2.set_balance("200");
        c2.set_acount_number();

        c2.withdraw("1201");
        System.out.println(c2.get_balance());
        System.out.println(c2.get_acount_number());





    }
}
