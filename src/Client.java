import java.util.Scanner;

public class Client
{
    private String clietName;
    private String nationalId;
    private String address;
    private String phoneNumber;
    private Account customerAccount;

    public Client(Account initialAccount)
    {
        clietName = "NO Name";
        nationalId = "NO National Id";
        address = "NO Address";
        phoneNumber = "NO Phone Number";
        customerAccount = initialAccount;
    }
    public void setName(String valOfName)
    {
        clietName = valOfName;
    }
    public void setNationalId(String valOfNationalId)
    {
        while(true)
        {
            if(valOfNationalId.length()!=8)
            {
                System.out.print("Error Format: National Id Must Be 8 Digit. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfNationalId = input.next();
                continue;
            }
            try
            {
                int checkNumeric = Integer.parseInt(valOfNationalId);
            }
            catch (NumberFormatException object)
            {
                System.out.print("Error Format: National Id Must Be Numeric and Integer. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfNationalId = input.next();
                continue;
            }
            break;
        }
        nationalId = valOfNationalId;
    }
    public void setAddress(String valOfAddress)
    {
        address = valOfAddress;
    }
    public void setPhoneNumber(String valOfPhoneNum)
    {
        while (true)
        {
            if(valOfPhoneNum.length()!=8)
            {
                System.out.print("Error Format: Phone Number Must Be 8 Digit. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfPhoneNum = input.next();
                continue;
            }
            try
            {
                int checkNumeric = Integer.parseInt(valOfPhoneNum);
            }
            catch (NumberFormatException object)
            {
                System.out.print("Error Format: Phone Number Must Be Numeric and Integer. \nPlease Enter Again:__");
                Scanner input = new Scanner(System.in);
                valOfPhoneNum = input.next();
                continue;
            }
            break;
        }
        phoneNumber = valOfPhoneNum;
    }
    public void  setCustomerAccount(Account initialAccount)
    {
        customerAccount = initialAccount;
    }

    public String getName()
    {
        return clietName;
    }
    public String getNationalId()
    {
        return nationalId;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public Account getCustomerAccount()
    {
        return customerAccount;
    }
    public String toString()
    {
        return "Client Name:__" + clietName + "\n" + "National Id:__" + nationalId + "\n"
                + "Address:__"  + address + "\n" + "Phone Number:__" + phoneNumber;
    }
}
