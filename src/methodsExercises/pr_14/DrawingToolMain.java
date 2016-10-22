package methodsExercises.pr_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingToolMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String figureType = reader.readLine();
        Figure figure = null;

        switch (figureType){
            case "Square":
                int size = Integer.valueOf(reader.readLine());
                figure = new Square(size);
                break;

            case "Rectangle":
                int width = Integer.valueOf(reader.readLine());
                int height = Integer.valueOf(reader.readLine());
                figure = new Rectangle(width, height);
                break;
        }

        figure.draw();

    }
}
