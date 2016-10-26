package encapsulationExercises.pr_02_EE;

/**
 * Created by typer on 10/26/16.
 */
public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws Exception {
        this.setLenght(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLenght(double lenght) throws IllegalArgumentException {
        if (lenght <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.length = lenght;
        }
    }

    private void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.height = height;
        }
    }

    public double getSurfaceArea() {
        return 2 * length * width + 2 * width * height + 2 * length * height;
    }

    public double getLateralSurfaceArea() {
        return 2 * width * height + 2 * length * height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f"
                , getSurfaceArea()
                , getLateralSurfaceArea()
                , getVolume());
    }
}
