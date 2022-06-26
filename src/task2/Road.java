package task2;

public class Road {

    private final City target;
    private final int weight;

    public Road(City target, int weight) {
        this.target = target;
        this.weight = weight;
    }

    public City getTarget() {
        return target;
    }

    public int getWeight() {
        return weight;
    }
}
