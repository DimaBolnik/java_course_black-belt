package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> ex = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new DestFriend("Dima", friend1Action, ex);
        new DestFriend("Zaur", friend2Action, ex);



    }
}

enum Action{
    KAMEN, NOJNICI, BUMAGA;
}

class DestFriend extends Thread{
    String name;
    List<Action> actions;
    private Exchanger<Action> exchanger;

    public DestFriend(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    private void twoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.KAMEN && friendAction == Action.NOJNICI)
        || (myAction == Action.NOJNICI && friendAction == Action.BUMAGA)
        || (myAction == Action.BUMAGA && friendAction == Action.KAMEN)) {
            System.out.println(name + " Wins!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : actions) {
            try {
                reply = exchanger.exchange(action);
                twoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}