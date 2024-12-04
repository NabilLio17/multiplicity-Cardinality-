
public class Item {

    @SuppressWarnings("FieldMayBeFinal")
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item: " + name;
    }

    @SuppressWarnings("unused")
    int GetPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int getPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
