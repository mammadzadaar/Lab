public class CorpLoan extends Loan{

    public CorpLoan(int id, double amount) {
        super(id, amount);
    }
    public double commission(){
        return 1.2;
    };
}
