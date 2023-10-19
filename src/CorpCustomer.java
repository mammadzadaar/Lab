class CorpCustomer extends Customer implements  DiscountService{
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
    public void discountForLOan() {
        CorpLoan corp=new CorpLoan();

    }


}
