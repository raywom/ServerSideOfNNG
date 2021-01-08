package server.code;

public class CreateGame {
    private String idOfGame;
    private String idOfOwner;
    private String timeOfStart;
    public String getIdOfGame() {
        return idOfGame;
    }

    public void setIdOfGame(String idOfGame) {
        this.idOfGame = idOfGame;
    }

    public String getIdOfOwner() {
        return idOfOwner;
    }

    public void setIdOfOwner(String idOfOwner) {
        this.idOfOwner = idOfOwner;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }
}
