
public  class Loan {
    int id;
    double amount;

    public Loan() {


    }

     double getCommission( ){
         return 0;
     };

    public Loan(int id,double amount)
    {
        this.id=id;
        this.amount=amount;
    }




    public String toString() {
        return "{Id= " + id + ", Amount= " + amount+"}";
    }

}
