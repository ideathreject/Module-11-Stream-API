import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddNames {
    public List<String> oddNames(List<String> names) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, names.size()).filter(i -> i % 2 == 0).forEach(x -> stringBuilder.append(x+ 1 + ". " +names.get(x) +", "));
        String string = String.valueOf(stringBuilder);
        String[] arrayString = string.split(", ");
        return new ArrayList<>(Arrays.asList(arrayString));
    }
}
