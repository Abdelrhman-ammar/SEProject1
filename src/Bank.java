import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private String bankAddress;
    private ArrayList<Account> bankAccounts;
    private ArrayList<Client> bankClients;
    public Bank()
    {
        bankName = "NO Bank Name";
        bankAddress = "No Bank Address";
        bankAccounts = new ArrayList<Account>();
        bankClients = new ArrayList<Client>();
    }
    public void setBankName(String valOfBankName)
    {
        bankName = valOfBankName;
    }
    public void setBankAddress(String valOfBankAddress)
    {
        bankAddress = valOfBankAddress;
    }
    public String getBankName() {
        return bankName;
    }
    public String getBankAddress()
    {
        return bankAddress;
    }
    public void addNewClient()
    {
        Scanner input = new Scanner(System.in);
        String choiceAccount;
        String choiceClient;


        System.out.println("Enter '1' If You Want Create 'Normal Client' or '2' If 'Commercial Client':");
        choiceClient = input.next();
        while (choiceClient=="1"||choiceClient=="2")
        {
            System.out.println("Error: Invalid Input.");
            System.out.println("Enter '1' If You Want Create 'Normal Client' or '2' If 'Commercial Client':");
            choiceClient = input.next();
        }

        System.out.println("Enter '1' If You Want Create 'Normal Account' or '2' If 'Special Account':");
        choiceAccount = input.next();
        while (choiceAccount=="1"||choiceAccount=="2")
        {
            System.out.println("Error: Invalid Input.");
            System.out.println("Enter '1' If You Want Create 'Normal Account' or '2' If 'Special Account':");
            choiceAccount = input.next();
        }


        Account newAccount;
        Client newClient;
        if(choiceAccount=="1")
        {
            newAccount = new Account();
            if(choiceClient=="1")
            {
                newClient = new Client(newAccount);
            }
            else
            {
                newClient = new CommericalClient(newAccount);
            }
        }
        else
        {
            newAccount = new SpecialAccount();
            if(choiceClient=="1")
            {
                newClient = new Client(newAccount);
            }
            else
            {
                newClient = new CommericalClient(newAccount);
            }
        }

        String valFromUser;

        System.out.print("Enter The Name:__");
        valFromUser = input.next();
        newClient.setName(valFromUser);

        System.out.print("Enter The Address:__");
        valFromUser = input.next();
        newClient.setAddress(valFromUser);

        System.out.print("Enter The Phone Number:__");
        valFromUser = input.next();
        newClient.setPhoneNumber(valFromUser);

        if(choiceClient=="1")
        {
            System.out.print("Enter The National Id:__");
            valFromUser = input.next();
            newClient.setNationalId(valFromUser);
        }
        else
        {
            System.out.print("Enter The Commercial Id:__");
            valFromUser = input.next();
            ((CommericalClient) newClient).setCommercialId(valFromUser);
        }

        System.out.print("Enter The Balance:__");
        valFromUser = input.next();
        newAccount.set_balance(valFromUser);

        System.out.print("Enter The Account Number:__");
        valFromUser = input.next();
        newAccount.set_acount_number();

        bankAccounts.add(newAccount);
        bankClients.add(newClient);
    }
    public void display()
    {
        for (int counter = 0; counter < bankClients.size(); counter++)
        {
            System.out.println("Customer Number (" + counter+1 + "):");
            System.out.println(bankClients.get(counter).toString());
            System.out.println(bankAccounts.get(counter).toString());
            System.out.println("\n\n");
        }
    }
}
