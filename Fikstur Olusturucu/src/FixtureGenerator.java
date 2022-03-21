import java.util.ArrayList;
import java.util.List;


public class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
    }

    public void createFixture() {
        int numDays = (teams.size() - 1); // Days needed to complete tournament
        int halfSize = teams.size() / 2;

        List<String> teamsList = new ArrayList<>(teams); // Add teams to List and remove the first team
        teamsList.remove(0);

        int teamsSize = teamsList.size();

        for (int day = 0; day < numDays; day++) {
            System.out.println("Day " + String.valueOf(day + 1));

            int teamIdx = day % teamsSize;

            System.out.println(teamsList.get(teamIdx) + " vs " + teams.get(0));

            for (int idx = 1; idx < halfSize; idx++) {
                int firstTeam = (day + idx) % teamsSize;
                int secondTeam = (day + teamsSize - idx) % teamsSize;
                System.out.println(teamsList.get(firstTeam) + " vs " + teamsList.get(secondTeam));

            }
        }
    }
}
