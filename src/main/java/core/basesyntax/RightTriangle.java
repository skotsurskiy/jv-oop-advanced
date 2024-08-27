package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Figure createRandomFigure() {
        return new RightTriangle(getRandomInt(), getRandomInt());
    }

    @Override
    public void printInformation() {
        System.out.println("Right triangle firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + " area: " + ((firstLeg * secondLeg / 2)) + " Color " + getColor());
    }
}
