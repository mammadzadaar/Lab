public   class Customer {
    int id;
    String  name;
    Loan loan;


    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, Loan loan){
    this.id=id;
    this.name=name;
    this.loan=loan;
}

public  Customer( int id)
{
    this.id=id;
}

public Customer()
{}



}
