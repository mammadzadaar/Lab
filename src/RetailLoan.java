public class RetailLoan extends  Loan{

    public RetailLoan(int id, double amount) {
        super(id, amount);
    }

    public  RetailLoan(){

    }


    @Override
    double getCommission(){
        return 5;
    };
}
