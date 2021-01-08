package server.code;

public class Weapon {
    private String name;
    private String description;
    private int minDamage;
    private int maxDamage;
    private int accuracy;

    //get and set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getMinDamage() {
        return minDamage;
    }
    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }
    public int getMaxDamage() {
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    //get and set

    public Weapon(String name, String description, int minDamage, int maxDamage, int accuracy){
        this.name = name;
        this.description = description;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.accuracy = accuracy;
    }

}
