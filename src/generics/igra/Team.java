package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T p) {
        participants.add(p);
        System.out.println("V komandu " + name + "bil dobavlen noviy uchastnik po imeni "
        + p.getName());
    }

    public void playWith(Team<? extends T> team) {
        String winner;
        Random rand = new Random();
        int i = rand.nextInt(2);
        if (i == 0) {
            winner = this.name;
        }else {
            winner = team.name;
        }
        System.out.println("Выиграла команда "+winner);
    }
}
