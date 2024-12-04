
public class Check extends Payment {

    @SuppressWarnings("FieldMayBeFinal")
    private String bankId;

    public Check(double amount, String bankId) {
        super(amount);
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "BankID: " + bankId;
    }
}
