package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Poison extends Item {
    private float potency = 0;

    public float getPotency() {
        return potency;
    }

    public void setPotency(float potency) {
        this.potency = potency;
    }
}
