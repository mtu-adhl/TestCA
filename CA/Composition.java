package CA;

public class Composition {
    private static int count;
    private String id;
    private int size;

    public Composition(int size) {
        setSize(size);
        setId();
    }

    public Composition(int size, boolean encapsulation) {
        setSize(size);
    }

    @Override
    public String toString() {
        return String.format("This is object no.%s, there were %d objects created. Object has attribute {%d}",id,count, getSize());
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = String.valueOf(++count);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
