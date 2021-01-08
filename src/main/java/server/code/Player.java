package server.code;

public class Player {
    private int id;
    private String name;
    private int winAmount;
    private int lossAmount;
    private GameCharacter character = new GameCharacter();

    //get and set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWinAmount() {
        return winAmount;
    }
    public void setWinAmount(int winAmount) {
        this.winAmount = winAmount;
    }
    public int getLossAmount() {
        return lossAmount;
    }
    public void setLossAmount(int lossAmount) {
        this.lossAmount = lossAmount;
    }
    public GameCharacter getCharacter() {
        return character;
    }
    public void setCharacter(GameCharacter character) {
        this.character = character;
    }
    //get and set
}
