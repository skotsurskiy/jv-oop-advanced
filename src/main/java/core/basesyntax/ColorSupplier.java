package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(FigureColor.values().length);
        return FigureColor.values()[index].toString();
    }
}