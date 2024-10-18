public class Pizzas {
    Name name;
    int size;

    @Override
    public String toString() {
        return "Pizzas{" +
                "name=" + name +
                ", size=" + size +
                '}';
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Pizzas(Name name, int size) {
        this.name = name;
        this.size=size;
    }
}
