public class CorpLoan extends Loan{

    public CorpLoan(int id, double amount) {
        super(id, amount);
    }
    double getCommission(){
        return 1.2;
    };

}
