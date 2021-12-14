package Shop;
import entities.Item;

import java.util.List;

public class Shop {
    public String name;
    public List<Item> items;
    public Integer golds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getGolds() {
        return golds;
    }

    public void setGolds(Integer golds) {
        this.golds = golds;
    }

    protected void sellItem(Item item){
        for (Item shopItem: this.items) {
            if(shopItem == item) {
                this.golds += shopItem.value;
                this.items.remove(shopItem);
            }
        }
    }


}
