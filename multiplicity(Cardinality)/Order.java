
import java.util.Date;

public class Order {

    @SuppressWarnings("FieldMayBeFinal")
    private Item item;
    @SuppressWarnings("FieldMayBeFinal")
    private Date orderDate;
    @SuppressWarnings("FieldMayBeFinal")
    private String status;

    public Order(Item item, Date orderDate, String status) {
        this.item = item;
        this.orderDate = orderDate;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item.toString() + "\nDate: " + orderDate + "\nStatus: " + status;
    }
}
