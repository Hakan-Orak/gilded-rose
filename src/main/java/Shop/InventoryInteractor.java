package Shop;

import entities.Item;

import java.util.List;

public class InventoryInteractor {
    private InventoryRepository repository;

    public InventoryInteractor(InventoryRepository repository) {
        this.repository = repository;
    }

    public List<Item> getInvetory() {
       return this.repository.getInventory();
    }

    public void updateQuality(){
        List<Item> items = this.repository.getInventory();
        for (Item item: items) {
            item.update();
        }
        this.repository.saveInventory(items);
    }
}
