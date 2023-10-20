public class CorpLoan extends Loan{

    public CorpLoan(int id, double amount) {
        super(id, amount);
    }
    @Override
    double getCommission(){
        return 1.2;
    }


}
