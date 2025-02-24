import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMix {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        return Stream.iterate(0, i -> firstIterator.hasNext() && secondIterator.hasNext(), i -> i + 1)
                .flatMap(i -> Stream.concat(Stream.of(firstIterator.next()), Stream.of(secondIterator.next())));
    }
}
