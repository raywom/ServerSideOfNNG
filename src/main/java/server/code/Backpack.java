package server.code;

import java.util.ArrayList;

public class Backpack {
    private int bullets;
    private ArrayList<Item> items;
    private Weapon spareWeapon;

    //get and set
    public int getBullets() {
        return bullets;
    }
    public void setBullets(int bullets) {
        this.bullets = bullets;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public Weapon getSpareWeapon() {
        return spareWeapon;
    }
    public void setSpareWeapon(Weapon spareWeapon) {
        this.spareWeapon = spareWeapon;
    }
    //get and set
}
