package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortBase;
    private int longBase;
    private int height;

    public IsoscelesTrapezoid(int shortBase, int longBase, int height) {
        this.shortBase = shortBase;
        this.longBase = longBase;
        this.height = height;
    }

    @Override
    public double calculateFigureArea() {
        return ((shortBase + longBase) / 2) * height;
    }

    @Override
    public void printInformation() {
        System.out.println("IsoscelesTrapezoid short base: " + shortBase
                + " long base: " + longBase + " height: " + height
                + " area " + calculateFigureArea() + " Color " + getColor());
    }
}
