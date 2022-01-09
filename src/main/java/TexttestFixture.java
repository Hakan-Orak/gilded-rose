import Shop.InMemoryInventoryRepository;
import Shop.InventoryInteractor;
import Shop.Shop;
import entities.LegendaryItem;
import entities.item.*;
import entities.relic.Relic;
import init.Init;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.ItemRepository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TexttestFixture {

    public ItemRepository itemRepository;

    public Init init;

    @Autowired
    public TexttestFixture(ItemRepository itemRepository, Init init) {
        this.itemRepository = itemRepository;
        this.init = init;
    }
/*
        ShopInteractor shopInteractor = new ShopInteractor(listOfAllItems);
        System.out.println("nos golds bdd " + shopInteractor.getShopGold());
    }

 */

    public static void main(String[] args) throws AWTException {
        Item itemOne = new ConjuredItem("epee des tounois", 150, 150, 10);
        Item itemTwo = new GenericItem("bouclier en fer", 100, 50, 15);
        Item itemThree = new LegendaryItem("bottes légendaires", 300, 200, 50);
        Item itemFour = new AgingItem("baton de boulot", 40, 5, 10);


        List<Item> items = new ArrayList<>();
        Shop shop = new Shop();
        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);

        // Ne fonctionne pas
        // Initialization of the database with objects
        /*
        Init.initDatabase();
        List<Item> allItems = Init.getAllSavedItem();
        shop.setItems(allItems);
        shop.sellItem(Init.getItemById(1L));
         */

        shop.setItems(items);
        shop.sellItem(itemOne);
        InventoryInteractor inventoryInteractory = new InventoryInteractor(new InMemoryInventoryRepository());
        for (Item item : inventoryInteractory.getInvetory()) {
            System.out.println(item.toString());
        }

        Relic relic = new Relic("epee des tounois", 150.15, 150);
        relic.updateSoldeShop();

    }


}
