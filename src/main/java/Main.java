import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<String> names = new ArrayList<>();
        names.add("Vlad");
        names.add("Sasha");
        names.add("Alex");
        names.add("Mark");
        names.add("Nikita");
        OddNames oddNames = new OddNames();
        System.out.println(oddNames.oddNames(names));

        //Task 2
        UpperSort upperSort = new UpperSort();
        upperSort.upperedAndSorted(names).forEach(System.out::println);

        //Task 3
        SortedArrayAsString sortedArray= new SortedArrayAsString();
        System.out.println(sortedArray.sortedArrayAsString(new String[]{"1, 2, 0", "4, 5"}));

        //Task 4
        InfinityRandomStream infinityRandomStream= new InfinityRandomStream();
        long currentTimeMillis = System.currentTimeMillis();
        Stream<Long> randomStream = infinityRandomStream.infinityRandomStream(25214903917L, 11L, 281474976710656L, currentTimeMillis);
        randomStream.limit(10).forEach(System.out::println);

        //Task 5
        Stream <String> cities = Stream.of("Kyiv", "Kherson", "Odesa", "Donetsk");
        Stream <String> numbers = Stream.of("1", "2","3","4","5","6","7");
        StreamMix.zip(cities, numbers).forEach(System.out::println);
    }
}
