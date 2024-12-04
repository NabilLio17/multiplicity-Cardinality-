
public class Credit extends Payment {

    @SuppressWarnings("FieldMayBeFinal")
    private String expirationDate;

    public Credit(double amount, String expirationDate) {
        super(amount);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Credit: expDate " + expirationDate;
    }
}
