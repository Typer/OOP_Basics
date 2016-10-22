package methodsExercises.pr_14;

/**
 * Created by typer on 10/21/16.
 */
public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("|%s|%n",new String(new char[this.width]).replace('\0','-'));
        for (int i = 0; i < this.height - 2; i++) {
            System.out.printf("|%s|%n",new String(new char[this.width]).replace('\0',' '));
        }
        System.out.printf("|%s|%n",new String(new char[this.width]).replace('\0','-'));
    }
}
