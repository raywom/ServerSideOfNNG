package server.code;

import java.util.ArrayList;

public class GameCharacter {
    private Backpack backpack = new Backpack();
    private int health;
    private int energy;
    private ArrayList<Perk> perks = new ArrayList<Perk>();
    private String state;
    private Weapon equipmentWeapon;
    private int position = 0;

    //get and set
    public Backpack getBackpack() {
        return backpack;
    }
    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public ArrayList<Perk> getPerks() {
        return perks;
    }
    public void setPerks(ArrayList<Perk> perks) {
        this.perks = perks;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Weapon getEquipmentWeapon() {
        return equipmentWeapon;
    }
    public void setEquipmentWeapon(Weapon equipmentWeapon) {
        this.equipmentWeapon = equipmentWeapon;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    //get and set

    public void ToDamage(int damage){
        health -= damage;
    }
}
