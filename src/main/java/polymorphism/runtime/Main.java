package polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        String player = args[0];
        VodPlayer vodPlayer = null;

        if (player.equals("Netflix")) {
            vodPlayer = new NetflixPlayer();
        } else if (player.equals("HBO")){
            vodPlayer = new HBOPlayer();
        } else {
            vodPlayer = new DefaultPlayer();
        }

        vodPlayer.play("FRIENDS_S1E1");
    }
}
