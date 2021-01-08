package server.code;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private int id;
    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Player> teamA = new ArrayList<>();
    private ArrayList<Player> teamB = new ArrayList<>();
    private ArrayList<Boolean> listOfWhoMadeTurn = new ArrayList<>();
    private int moveCount = 0;
    private String stage = "wait";
    private ArrayList<ActionJson> actionPlayer = new ArrayList<>();

    private ArrayList<Weapon> rangedWeapons = InitialFunction.generationOfRandomRangedWeapons();
    private ArrayList<Weapon> meleeWeapons = InitialFunction.generationOfRandomMeleeWeapons();
    private ArrayList<Perk> perks = InitialFunction.generationOfRandomPerks();

    //get and set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public ArrayList<Player> getTeamA() {
        return teamA;
    }
    public void setTeamA(ArrayList<Player> teamA) {
        this.teamA = teamA;
    }
    public ArrayList<Player> getTeamB() {
        return teamB;
    }
    public void setTeamB(ArrayList<Player> teamB) {
        this.teamB = teamB;
    }
    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }
    //get and set

    public ArrayList<ActionJson> distributionWeapon(boolean isRange){
        ArrayList<ActionJson> jsonList = new ArrayList<ActionJson>();
        Random random = new Random();

        for (var i : players){
            var buf = new ActionJson("dW", i);

            while (buf.getWeapons().size() < 3) {
                var gun = isRange? rangedWeapons.get(random.nextInt(rangedWeapons.size())) : meleeWeapons.get(random.nextInt(random.nextInt(meleeWeapons.size())));
                if (buf.getWeapons().contains(gun))
                    buf.getWeapons().add(gun);
            }
            jsonList.add(buf);
        }
        return jsonList;
    }

    public ArrayList<ActionJson> distributionPerks(){
        ArrayList jsonList = new ArrayList<ActionJson>();
        Random random = new Random();

        for(var i : players){
            var buf = new ActionJson("dP", i);

            while (buf.getPerks().size() < 5) {
                var perk = perks.get(random.nextInt(perks.size()));
                if (buf.getPerks().contains(perk))
                    buf.getPerks().add(perk);
            }
            jsonList.add(buf);
        }
        return jsonList;
    }

    public void ChoiceOfWeapon(Player player, Weapon weapon){
        if (!meleeWeapons.contains(weapon)) {
            this.players.get(this.players.indexOf(player)).getCharacter().setEquipmentWeapon(weapon);
        }
        else {
            this.players.get(this.players.indexOf(player)).getCharacter().getBackpack().setSpareWeapon(weapon);
        }
        listOfWhoMadeTurn.set(this.players.indexOf(player), true);
    }

    public void ChoiceOfPerk(Player player, ArrayList<Perk> perks){
        this.players.get(this.players.indexOf(player)).getCharacter().getPerks().addAll(perks);
        listOfWhoMadeTurn.set(this.players.indexOf(player), true);
    }

    public boolean CheckingWhoMadeTheMove(ActionJson actionJson){
        if (!this.listOfWhoMadeTurn.get(this.players.indexOf(actionJson.getPlayer()))) {
            this.listOfWhoMadeTurn.set(this.players.indexOf(actionJson.getPlayer()), true);
            actionPlayer.add(actionJson);
            if (!this.listOfWhoMadeTurn.contains(false)) {
                ProcessingMoves();
                return true;
            }
        }
        return false;
    }

    private void ProcessingMoves(){
        for (var action : actionPlayer) {
            //variables
            boolean  comeUpEnd = false;
            //variables

            //afk
            //afk

            //come up
            if (action.getAction() == "come_up"){
                var isTeamA = teamA.contains(action.getPlayer());
                var index = isTeamA? teamA.indexOf(action.getPlayer()) : teamB.indexOf(action.getPlayer());
                if (isTeamA)
                    teamA.get(index).getCharacter().setPosition(1);
                else
                    teamB.get(index).getCharacter().setPosition(1);
                comeUpEnd = true;
            }
            //come up

            //use item
            //use item

            //attack
            if(action.getAction() == "attack"){
                ActionAttack(action, action.getPlayer().getCharacter().getEquipmentWeapon().getMaxDamage(), action.getPlayer().getCharacter().getEquipmentWeapon().getMinDamage());
            }
            //attack

            //use perk
            //use perk

            //recharges and recreation
            //recharges and recreation

            //end action
            if (comeUpEnd){
                if (teamA.size() >= teamB.size())
                    ComeUpEnd(teamB, teamA);
                else
                    ComeUpEnd(teamA, teamB);
            }
            //end action
        }
    }

    private void ComeUpEnd(ArrayList<Player> min, ArrayList<Player> max){
        for(int i = 0; i <  (Math.max(max.size(), min.size())); i++) {
            if (max.get(i).getCharacter().getPosition() == 1) {
                if (min.size() >= i) {
                    if (min.get(i).getCharacter().getPosition() == 0){
                        max.get(i).getCharacter().setPosition(2);
                    }
                }
            }
            else if(Math.min(max.size(), min.size()) > i){
                if (min.get(i).getCharacter().getPosition() == 1) {
                    min.get(i).getCharacter().setPosition(2);
                }
            }
        }
    }

    private void ActionAttack(ActionJson action, int maxDamage, int minDamage)
    {
        Random random = new Random();
        action.getToPlayer().getCharacter().ToDamage(random.nextInt(maxDamage-minDamage) + minDamage);
    }



}
