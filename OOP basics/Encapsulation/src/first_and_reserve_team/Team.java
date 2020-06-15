package first_and_reserve_team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private final int MAX_YOUTH_AGE = 40;

    private String teamName;
    private List<Player> firstTeam;
    private List<Player> reserveTeam;

    public Team(String name) {
        this.teamName = name;
        this.firstTeam = new ArrayList<> ();
        this.reserveTeam = new ArrayList<> ();
    }

    private void setFirstTeam(Player player) {
        this.firstTeam.add (player);
    }

    private void setReserveTeam(Player player) {
        this.reserveTeam.add (player);
    }

    public void addPlayer(Player player) {
        if (player.getAge () < MAX_YOUTH_AGE) {
            setFirstTeam (player);
        }
        if (player.getAge () >= MAX_YOUTH_AGE) {
            setReserveTeam (player);
        }
    }

    public List<Player> getFirstTeam() {
        return Collections.unmodifiableList (this.firstTeam);
    }

    public List<Player> getReserveTeam() {
        return Collections.unmodifiableList (this.reserveTeam);
    }

}
