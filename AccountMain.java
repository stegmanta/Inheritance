public class AccountMain{

    public static void main(String []args){

        Account bob = new Account(2321);
        SavingsAccount bobsSavings = new SavingsAccount(2321);

        System.out.println(bobsSavings.addInterest(4));
        System.out.println(bob.getAccountNumber());
        System.out.println(bob.getBalance());
        
    }
}