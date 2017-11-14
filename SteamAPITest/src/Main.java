import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String testStirng = "Hello World!";

//        String result = Stream.of(testStirng).map(String::toUpperCase).collect(Collectors.joining());
//        System.out.println(result);
//
        Integer[] sixNum = {1, 2, 3, 4, 5, 6, 7, 8};

        Integer[] evens = Stream.of(sixNum).filter(n -> n%2 == 0).toArray(Integer[]::new);

        Stream.of(evens).forEach(System.out::println);
    }
}
