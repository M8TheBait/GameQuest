import java.util.ArrayList;

public class GameQuest {
    private Player player;
    private ArrayList<Level> levels;
    private int currentLevel;

    public GameQuest(){
        this.currentLevel = 0;
        this.player = new Player(player.getPlayerName());
        this.levels = new ArrayList<>();
    }
}
