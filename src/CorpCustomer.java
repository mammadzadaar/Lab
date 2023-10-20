public  class CorpCustomer extends Customer implements  DiscountService{
CorpLoan corpLoan;
public CorpCustomer(int id, String name) {
        super(id, name);
    }

    public CorpCustomer(int id, String name, CorpLoan corpLoan) {
        super(id, name);
        this.corpLoan=corpLoan;
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


    public double getCommissionAmount(){
    return  (corpLoan.amount*discountForLOan())/100;

    }

}
