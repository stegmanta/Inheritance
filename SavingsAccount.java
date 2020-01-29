public class SavingsAccount extends Account{
    private double interest;

    //constructors
    public SavingsAccount(int a){
        super(a);
        this.interest = interest;
    }

    //functions
    public double addInterest(double interest){
        getBalance();
        return getBalance()+interest;
    }

    //getter

    public double getInterest(double interest){
        return interest;
    }


    

}