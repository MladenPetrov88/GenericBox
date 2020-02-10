package GenericBox;

public class Box<T> {

    private T names;

    public void add (T names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", "java.lang.String", names);
    }
}
