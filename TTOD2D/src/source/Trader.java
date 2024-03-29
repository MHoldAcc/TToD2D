package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Trader extends NPC implements java.io.Serializable {
    public Trader(String traderName){
        super(traderName);
    }

    public Trader(String traderName, ArrayList<String> sentences){
        super(traderName, sentences);
    }

    public int getSellItemPrice(Item item){
        return (int)item.getValue();
    }

    public int getBuyItemPrice(Item item){
        return (int)item.getValue();
    }

    public boolean sellItem(Item item){
        if(Player.getInstance().getItems().contains(item)) {
            if (Player.getInstance().getArmor() == item)
                Player.getInstance().setArmor(null);
            if (Player.getInstance().getWeapon() == item)
                Player.getInstance().setWeapon(null);
            if (Player.getInstance().getShield() == item)
                Player.getInstance().setShield(null);
            Player.getInstance().getItems().remove(item);
            getItems().add(item);
            int itemPrice = getSellItemPrice(item);
            setMoney(getMoney() - itemPrice);
            Player.getInstance().setMoney(Player.getInstance().getMoney() + itemPrice);
            if(getMoney() < 0)
                setMoney(0);
            return true;
        }
        else
            return false;

    }

    public boolean buyItem(Item item){
        if(getItems().contains(item)){
            int itemPrice = (int)item.getValue();
            if(getMoney() < itemPrice)
                itemPrice = getMoney();
            setMoney(getMoney() + itemPrice);
            Player.getInstance().setMoney(Player.getInstance().getMoney() - itemPrice);
            Player.getInstance().getItems().add(item);
            return true;
        }
        else
            return false;
    }
}
