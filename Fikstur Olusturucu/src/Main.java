import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> teams = new ArrayList<>();
        int teamCount = 0;
        System.out.println("Enter teams... Press (K) to complete.\n");
        while (true) {
            System.out.print(teamCount + 1 + ". Team: ");
            String team = scanner.next();
            if(team.equals("K"))
                break;
            teams.add(team);
            teamCount++;
        }

        if (teamCount % 2 == 1) {
            teams.add("Bay");
            teamCount++;
        }



        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        fixtureGenerator.createFixture();
    }
}
