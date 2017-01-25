package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Status {
    private String name = "";
    private float potency = 0;
    private int duration = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPotency() {
        return potency;
    }
    public void setPotency(float potency) {
        this.potency = potency;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
