import java.util.List;
import java.util.stream.IntStream;

public class OddNames {
    public void oddNames(List<String> names){
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, names.size()).filter(i -> i % 2 == 0).forEach(x -> stringBuilder.append(x+ 1 + ". " +names.get(x) +", "));
        System.out.println(stringBuilder.substring(0, stringBuilder.length()-2));
    }
}
