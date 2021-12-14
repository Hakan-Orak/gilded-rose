package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Shop {

    public List<Item> items;

    public Shop(List<Item> items) {
        this.items = items;
    }
    public void updateQuality() {
        //items.forEach();
    }
}
