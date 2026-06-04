package Deitel.ChapterIII.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoiceTest1 = new Invoice("987456", "I love java man", 5, 97.99);
        Invoice invoiceTeste2 = new Invoice("123654", "Refactoring my code", -8, 27.49);
        Invoice invoiceTeste3 = new Invoice("987456", "This is a brief description", 11, -30);


        System.out.println(invoiceTest1.getInvoiceAmount());
        System.out.println(invoiceTeste2.getInvoiceAmount());
        System.out.println(invoiceTeste3.getInvoiceAmount());



    }
}
