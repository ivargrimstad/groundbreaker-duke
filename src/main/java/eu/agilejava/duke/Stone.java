package eu.agilejava.duke;

public class Stone {

    private final String name;
    private final String color;

    public Stone(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
