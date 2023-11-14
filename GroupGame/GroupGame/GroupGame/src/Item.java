public class Item {
    private String itemName;
    private String itemDescription;

    //Constructor
    public Item(String name, String description) {
        itemName = name;
        itemDescription = description;
    }

    //Get Item Name
    public String getItemName() {
        return itemName;
    }

    //Gets Item description
    public String getItemDescription() {
        return itemDescription;
    }

    //Sets the Items Name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //Sets the Item Description
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}