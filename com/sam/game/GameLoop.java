package sam.game;

import sam.misc.Constants;

public class GameLoop implements Runnable{

    private boolean running;
    private int ups, fps;
    private Game game;

    public GameLoop(){
        running = true;
        game = new Game(Constants.WIDTH, Constants.HEIGHT);
    }

    @Override
    public void run() {
        double acc = 0;
        double prevTime = System.nanoTime();
        double lastTime = System.currentTimeMillis();
        double reqFps = 1000000000 / 60.0;


        while (running){
            double currTime = System.nanoTime();
            acc += currTime - prevTime;
            prevTime = currTime;
            while (acc > reqFps){
                update();
                render();
                acc -= reqFps;
            }

            if(System.currentTimeMillis() - lastTime >= 1000) {
                lastTime = System.currentTimeMillis();
                printStats();
            }

        }
    }

    private void printStats() {
        System.out.println("fps: " + fps + " ,ups: " + ups);
        fps = 0;
        ups = 0;
    }

    private void update() {
        game.update();
        ups++;
    }

    private void render() {
        game.render();
        fps++;
    }
}
