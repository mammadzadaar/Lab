class CorpCustomer extends Customer implements  DiscountService{
CorpLoan corpLoan;
public CorpCustomer(int id, String name) {
        super(id, name);
    }

    public CorpCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }


    public CorpCustomer(int id) {
        super(id);
    }

    public CorpCustomer() {
    }


    @Override
    public double discountForLOan() {
        return  corpLoan.getCommission()-corpLoan.getCommission()*0.005;
    }

    @Override
    public double discountForPayment() {
        return 0;
    }

    public double getCommissionAmount(){
    return  (corpLoan.amount*discountForLOan())/100;

    }

}
