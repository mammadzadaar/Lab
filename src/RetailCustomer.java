public class RetailCustomer extends Customer implements  DiscountService{
    RetailLoan retailLoan;
    public RetailCustomer(int id, String name) {
        super(id, name);
    }



    public RetailCustomer(int id, String name,RetailLoan retailLoan) {
        super(id, name);
        this.retailLoan=retailLoan;
    }

    public RetailCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    public RetailCustomer(int id) {
        super(id);
    }

    public RetailCustomer() {
    }

    @Override
    public double discountForLOan() {
        return retailLoan.getCommission()-retailLoan.getCommission()*0.02;
    }



    public double getCommissionAmount()
    {
        return (retailLoan.amount*discountForLOan())/100;
    }

}
