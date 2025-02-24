import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UpperSort {
    public Stream<String> upperedAndSorted(List<String> names) {
        Stream<String> nameStream = names.stream();
         return nameStream.map(s -> s.toUpperCase()).sorted(Comparator.reverseOrder());
    }
}
