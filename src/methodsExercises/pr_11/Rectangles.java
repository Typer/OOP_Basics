package methodsExercises.pr_11;

/**
 * Created by typer on 10/22/16.
 */
public class Rectangles {
    private String id;
    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangles(String id, double width, double height, double x, double y) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public String getId() {
        return id;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean overlapRectangles(Rectangles rect){
        if (this.x < rect.getX() + rect.getWidth() &&
                this.x + this.width > rect.getX() &&
                this.y < rect.getY() + rect.getHeight() &&
                this.y + this.height > rect.getY()){
            return true;
        }
        else{
            return false;
        }
    }
}
