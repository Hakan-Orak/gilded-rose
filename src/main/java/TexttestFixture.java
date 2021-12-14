import entities.Item;
import entities.LegendaryItem;

public class TexttestFixture {
    public static void main(String[] args) {
        LegendaryItem legendaryItem = new LegendaryItem("Pourfendeur Divin", 50, 10, "Legendaire", 16);
        System.out.println(legendaryItem.toString());

    }
}
