import java.util.ArrayList;

public class Player {
    private String playerName;
    private double hp = 100;
    private ArrayList<String> inventory;

    public Player(String playerName){
        this.playerName = playerName;
        this.hp = 100;
        this.inventory = new ArrayList<>();
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public String showStats(){
        // Add max hp later
        // Add other aspects of player (mana, armor, etc)
        return this.hp + "/" + 100;
    }

    public void takeDamage(double damage){
        this.hp -= damage;
    }

    public void addItem (String item){
        inventory.add(item);
        System.out.println(item + " has been added to your inventory.");
    }
    public ArrayList<String> showInventory(){
        return this.inventory;
    }
}
