
public class OrderDetail {

    @SuppressWarnings("FieldMayBeFinal")
    private Item item;
    @SuppressWarnings("FieldMayBeFinal")
    private int quantity;

    public OrderDetail(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{item=" + item + ", quantity=" + quantity + ", total=" + calculateTotal() + "}";
    }
}