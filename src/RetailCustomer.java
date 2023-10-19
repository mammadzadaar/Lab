public class RetailCustomer extends Customer{
    public RetailCustomer(int id, String name) {
        super(id, name);
    }

    public RetailCustomer(int id, String name, Loan loan) {
        super(id, name, loan);
    }

    public RetailCustomer(int id) {
        super(id);
    }

    public RetailCustomer() {
    }

}
