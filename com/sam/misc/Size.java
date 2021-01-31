package sam.misc;

public class Size {
    private int width, height;
    public Size(int width,int height){
        this.width = width;
        this.height = height;
    }

    public void update(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
