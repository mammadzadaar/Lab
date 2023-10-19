
public abstract class Loan {
    int id;
    double amount;

public double commission(){
    return 0;
};

    public Loan(int id,double amount)
    {
        this.id=id;
        this.amount=amount;
    }
//
//    public Loan(int id, double amount) {
//    }
//
//    public   static  double CorpLoan( ){
//
//       return  1.2;



    public String toString() {
        return "{Id= " + id + ", Amount= " + amount+"}";
    }

}
