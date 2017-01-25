package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Item {
    private String name;
    private int maxCount;
    private float value;
    private boolean isCombatItem;
    private Types.itemType type;

    public Item(){
        name = "";
        maxCount = 0;
        value = 0;
        isCombatItem = false;
    }
    public String getName(){return name;}
    public void setName(String nameToSet){name=nameToSet;}
    public int getMaxCount(){return maxCount;}
    public void setMaxCount(int maxCountToSet){maxCount = maxCountToSet;}
    public float getValue(){return value;}
    public void setValue(float valueToSet){value=valueToSet;}
    public boolean getIsCombatItem(){return isCombatItem;}
    public void setIsCombatItem(boolean isCombatItemToSet){isCombatItem=isCombatItemToSet;}
    public Types.itemType getType() {
        return type;
    }
    public void setType(Types.itemType type) {
        this.type = type;
    }
}
