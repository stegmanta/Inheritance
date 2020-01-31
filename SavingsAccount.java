public class SavingsAccount extends Account{
    private double interest;

    //constructors
    public SavingsAccount(int a, double interest){
        super(a);
        this.interest = interest;
        getBalance();
    }

    //functions
    public double addInterest(){
        getBalance();
        return getBalance()+interest;
    }

    //getters

    public double getInterest(double interest){
        return interest;
    }


    

}