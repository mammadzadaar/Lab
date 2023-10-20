// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Customer customer=new Customer(10,"Arifa",new Loan(1,1000));
      //  Loan loan=new Loan(10,1000);
      //  System.out.println(loan.toString());
       // System.out.println(customer);
        RetailCustomer retailCustomer=new RetailCustomer(1,"Arifa", new Loan(100, 5000) {
            @Override
            double getCommission() {
                return 0;
            }
        });

        CorpCustomer corpCustomer=new CorpCustomer(2, "Hasan", new Loan(200,10000) {
            @Override
            double getCommission() {
                return 0;
            }
        });

        System.out.println("New commission is --->"+retailCustomer.getCommissionAmount());

        System.out.println();
              }






}