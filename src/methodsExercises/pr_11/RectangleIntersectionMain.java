package methodsExercises.pr_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RectangleIntersectionMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLines = reader.readLine().trim().split("\\s+");
        int rows = Integer.parseInt(inputLines[0]);
        int intersections = Integer.parseInt(inputLines[1]);

        List<Rectangles> rectangles = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            String[] data = reader.readLine().trim().split("\\s+");

            rectangles.add(new Rectangles(
                    data[0],
                    Double.parseDouble(data[1]),
                    Double.parseDouble(data[2]),
                    Double.parseDouble(data[3]),
                    Double.parseDouble(data[4])
            ));
        }

        for (int i = 0; i < intersections; i++) {
            String[] ids = reader.readLine().trim().split("\\s+");
            String firstId = ids[0];
            String secondId = ids[1];

            for (Rectangles r : rectangles) {
                if (r.getId().equals(firstId)) {
                    for (Rectangles r1 : rectangles) {
                        if (r1.getId().equals(secondId)) {
                            System.out.println(r.overlapRectangles(r1));
                        }
                    }
                }
            }
        }

    }
}
