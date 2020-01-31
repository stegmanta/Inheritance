public class CurrentAccount extends Account{

    private double checkingBalance;
    private double overdraftLimit;
    private boolean overdraftLimitReached;
    private String yourLimitWasReached = "You can not withdraw $ from your account as your overdraft was reached";



    //constructors
    public CurrentAccount(int a, double overdraftLimit){
        super(a);
        this.overdraftLimit = overdraftLimit;
        this.overdraftLimitReached = overdraftLimitReached;
    }

    //functions
    public double whenOverdraftLimitReached(double checkingBalance){
        if(withdraw() > getBalance()+overdraftLimit){
            return this.checkingBalance = getBalance();
        }
    }

    //getters
    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public boolean isOverDraftLimitReached(){
        return overdraftLimitReached;
    } 




    
}