// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RetailLoan retailLoan=new RetailLoan(210,2000);
        RetailCustomer retailCustomer=new RetailCustomer(1,"Arifa",retailLoan);

        CorpLoan corpLoan=new CorpLoan(310,5000);
        CorpCustomer corpCustomer=new CorpCustomer(2,"Hasan",corpLoan);

        System.out.println("New commission amount for RETAIL customer is --->"+retailCustomer.getCommissionAmount());
        System.out.println("New commission amount for CORPORATE customer is --->"+corpCustomer.getCommissionAmount());

              }






}