public class RetailLoan extends  Loan{

    public RetailLoan(int id, double amount) {
        super(id, amount);


    }

    public double commission(){
        return 5;
    };
}
