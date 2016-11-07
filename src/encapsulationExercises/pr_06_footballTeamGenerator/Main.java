package encapsulationExercises.pr_06_footballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by typer on 11/7/16.
 */
public class Main {
    private static HashMap<String, FootballTeam> teams;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        teams = new HashMap<>();
        while (true) {
            String[] input = reader.readLine().trim().split(";");
            if (input[0].equals("END")) {
                break;
            }

            try {
                switch (input[0]) {
                    case "Team":
                        FootballTeam team = tryMakeTeam(input);
                        teams.put(input[1], team);
                        break;

                    case "Add":
                        tryMakePlayer(input);
                        break;

                    case "Remove":
                        tryRemovePlayer(input);
                        break;

                    case "Rating":
                        double result = getRating(input);
                        System.out.println(String.format("%s - %.0f",input[1],result));
                        break;

                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private static double getRating(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.",teamName));
        }

        FootballTeam team = teams.get(teamName);
        return team.getRating();
    }

    private static void tryRemovePlayer(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.",teamName));
        }

        String playerName = input[2];
        FootballTeam team = teams.get(teamName);
        team.removePlayer(playerName);
    }

    private static void tryMakePlayer(String[] input) {
        String teamName = input[1];
        if (!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.",teamName));
        }
        String playerName = input[2];
        double endurance = Double.parseDouble(input[3]);
        double sprint = Double.parseDouble(input[4]);
        double dribble = Double.parseDouble(input[5]);
        double passing = Double.parseDouble(input[6]);
        double shooting = Double.parseDouble(input[7]);

        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        FootballTeam team = teams.get(teamName);
        team.addPlayer(player);
    }

    private static FootballTeam tryMakeTeam(String[] input) {
        String name = input[1];
        FootballTeam team = new FootballTeam(name);
        return team;
    }
}
