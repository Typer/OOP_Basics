package encapsulationExercises.pr_06_footballTeamGenerator;

import java.util.HashMap;

/**
 * Created by typer on 11/7/16.
 */
public class FootballTeam {
    private String name;
    private HashMap<String, Player> players;

    public FootballTeam(String name) {
        this.setName(name);
        this.players = new HashMap<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.equals(" ")) {
            throw new IllegalArgumentException("A name should not be empty. ");
        }
        this.name = name;
    }

    public void addPlayer(Player player) {
        this.players.put(player.getName(), player);
    }

    public void removePlayer(String playersName){
        if (!players.containsKey(playersName)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.",playersName,this.name));
        }
        players.remove(playersName);
    }

    public double getRating(){
        if (players.size() == 0)
        {
            return 0;
        }

        double total = 0;
        for (Player player : this.players.values()) {
            total += player.getAverageStats();
        }

        return total / this.players.size();
    }
}
