package Deitel.ChapterIII.Invoice;

public class Invoice {
    private String number;
    private String description;
    private int amount;
    private double price;

    public Invoice(String number, String description, int amount, double price) {
        this.number = number;
        this.description = description;

        if (amount < 0) {
            this.amount = 0;
        } else if (price < 0){
            this.price = 0;
        } else {
            this.amount = amount;
            this.price = price;
        }

    }

    public double getInvoiceAmount() {

        return price * amount;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



