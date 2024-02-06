import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        TreeSet<HeavyBox1> boxes = new TreeSet<HeavyBox1>();
        boxes.add(new HeavyBox1(10));
        boxes.add(new HeavyBox1(20));
        boxes.add(new HeavyBox1(30));
        for (HeavyBox1 box: boxes)
        {
            System.out.println(box.getWeight());
        }
    }
}