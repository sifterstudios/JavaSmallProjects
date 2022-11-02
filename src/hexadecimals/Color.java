package hexadecimals;

public class Color {
    String name;

    Color(String name) {
        this.name = name;
    }

    public String[] SplitRGBValues() {
        int indexStart = 0;
        String[] rGBValues = new String[3];
        boolean hasPound = (name.charAt(0) == '#');

        if (name.length() < 6) return null;
        if (hasPound) indexStart++;

        rGBValues[0] = rGBValues[0] + name.charAt(indexStart) + name.charAt(indexStart + 1);
        indexStart += 2;
        rGBValues[1] = rGBValues[1] + name.charAt(indexStart) + name.charAt(indexStart + 1);
        indexStart += 2;
        rGBValues[2] = rGBValues[2] + name.charAt(indexStart) + name.charAt(indexStart + 1);

        return rGBValues;
    }
}
