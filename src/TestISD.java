import java.util.stream.Stream;

public class TestISD {
    public static void main(String[] args) {
        Stream<Integer> stream4 = Stream.of(1,2,3,4,5,1,2,3);
        System.out.println(stream4.distinct().peek(System.out::println).count());
        // TODO
        // FIXME ADD some code here:
        //  Add class to Streams Package
    }
}
