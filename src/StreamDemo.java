import java.util.stream.Stream;

public class StreamDemo
{
    public static void main(String[] args) {
        System.out.println("welcome to intellij idea");
        constructEmptyStream();
        constructInfiniteStreamUsingGenerate();
    }

    private static void constructEmptyStream() {
        Stream<String> empty = Stream.empty();
        empty.forEach(s-> System.out.println("Print"));
    }

    static void constructInfiniteStreamUsingGenerate() {
        Stream<Double> randomInfinitStream = Stream.generate(() -> Math.random());
        randomInfinitStream.limit(2).forEach(x -> System.out.println(x));
    }
}
