package sam;

import sam.game.GameLoop;

public class Launcher {
    public static void main(String[] args) {
//        Display display = new Display(1280, 720);
        new Thread(new GameLoop()).start();
    }

}
