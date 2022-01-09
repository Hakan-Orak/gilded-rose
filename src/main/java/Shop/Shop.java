package Shop;
import entities.item.Item;

import java.awt.*;
import java.util.List;

public class Shop {
    public String name;
    public List<Item> items;
    public Integer golds = 20;


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

    public void sellItem(Item item) throws AWTException{
        for (Item shopItem: this.items) {
            if(shopItem == item) {
                this.golds += shopItem.getSellIn();
                this.items.remove(shopItem);
                displayTray(shopItem.toString());
            }
        }
    }


    public void displayTray(String itemSell) throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Votre item a été vendu !", itemSell, TrayIcon.MessageType.INFO);
    }


}
