import java.util.Scanner;

public class CommericalClient extends Client
{
    private String commercialId;

    public CommericalClient(Account initialAccount)
    {
        super(initialAccount);
        setNationalId("00000000");
        commercialId = "No Commercial Id";
    }
    public void setCommercialId(String valOfCommercialId)
    {
        while (true)
        {
            if(valOfCommercialId.length()!=8)
            {
                System.out.print("Error Format: Commercial Id Must Be 8 Digit. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfCommercialId = input.next();
                continue;
            }
            try
            {
                int checkNumeric = Integer.parseInt(valOfCommercialId);
            }
            catch (NumberFormatException object)
            {
                System.out.print("Error Format: Commercial Id Must Be Numeric and Integer. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfCommercialId = input.next();
                continue;
            }
            break;
        }
        commercialId = valOfCommercialId;
    }
    public String getCommercialId()
    {
        return commercialId;
    }
    @Override
    public String toString() {
        return "Client Name:__" + getName() + "\n" + "Commercial Id:__" + getNationalId() + "\n"
                + "Address:__"  + getAddress() + "\n" + "Phone Number:__" + getPhoneNumber() ;
    }
}
