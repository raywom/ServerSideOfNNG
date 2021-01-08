package server.code;

import java.util.ArrayList;

public class ActionJson {
    public String action;
    public Player player;
    public Player toPlayer;
    //preparation
    public ArrayList<Weapon> weapons;
    public ArrayList<Perk> perks;
    //battle
    public ArrayList<Item> useItem;

    //get and set
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Player getToPlayer() {
        return toPlayer;
    }
    public void setToPlayer(Player toPlayer) {
        this.toPlayer = toPlayer;
    }
    public ArrayList<Item> getUseItem() {
        return useItem;
    }
    public void setUseItem(ArrayList<Item> useItem) {
        this.useItem = useItem;
    }
    public ArrayList<Perk> getPerks() {
        return perks;
    }
    public void setPerks(ArrayList<Perk> perks) {
        this.perks = perks;
    }
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
    //get and set

    public ActionJson(String action, Player player){
        this.player = player;
        this.action = action;
    }
}
