import Shop.InMemoryInventoryRepository;
import Shop.InventoryInteractor;
import entities.Item;

public class TexttestFixture {
    public static void main(String[] args) {
        InventoryInteractor inventoryInteractory = new InventoryInteractor(new InMemoryInventoryRepository());
        for (Item item : inventoryInteractory.getInvetory()) {
            System.out.println(item.toString());
        }
    }
}
