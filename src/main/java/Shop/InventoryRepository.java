package Shop;

import entities.item.Item;
import java.util.List;
public interface InventoryRepository {
    List<Item> getInventory();
    void saveInventory(List<Item> items);
}
