import java.util.stream.Stream;

public class InfinityRandomStream {
    public Stream<Long> infinityRandomStream(long a, long c, long m, long seed){
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
