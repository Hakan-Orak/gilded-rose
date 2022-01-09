package init;

import entities.LegendaryItem;
import entities.item.AgingItem;
import entities.item.ConjuredItem;
import entities.item.GenericItem;
import entities.item.Item;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ItemRepository;

import java.util.List;

// Ne fonctionne pas
@Service
public class Init {

    private static ItemRepository itemRepository;

    @Autowired
    public void Init(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public static void initDatabase() {
        Item itemOne = new ConjuredItem("epee des tounois", 150, 150, 10);
        Item itemTwo = new GenericItem("bouclier en fer", 100, 50, 15);
        Item itemThree = new LegendaryItem("bottes légendaires", 300, 200, 50);
        Item itemFour = new AgingItem("baton de boulot", 40, 5, 10);
        itemRepository.save(itemOne);
        itemRepository.save(itemTwo);
        itemRepository.save(itemThree);
        itemRepository.save(itemFour);
    }

    public static List<Item> getAllSavedItem() {
        return itemRepository.findAll();
    }

    public static Item getItemById(Long id) {
        return itemRepository.getById(id);
    }
}
