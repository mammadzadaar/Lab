
public abstract class Loan {
    int id;
    double amount;

    public Loan() {

    }

    abstract double getCommission();

    public Loan(int id,double amount)
    {
        this.id=id;
        this.amount=amount;
    }




    public String toString() {
        return "{Id= " + id + ", Amount= " + amount+"}";
    }

}
