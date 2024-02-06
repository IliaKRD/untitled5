public class HeavyBox1 implements Comparable<HeavyBox1>{
    private int weight;

    public HeavyBox1(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox1 otherBox) {
        return Integer.compare(this.weight, otherBox.getWeight());
    }
}
