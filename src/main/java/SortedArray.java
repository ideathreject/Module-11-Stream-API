import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedArray {
    public void sortedArray(String[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for(String array1 : array){
            stringBuilder.append(array1 + ", ");
        }
        String names = String.valueOf(stringBuilder);
        String[] arrayNames =  names.split(", ");
        StringBuilder stringBuilder1 = new StringBuilder();
        Stream.of(arrayNames).mapToInt(Integer::parseInt).sorted().forEach(x -> stringBuilder1.append(x + ", "));
        System.out.println(stringBuilder1.substring(0, stringBuilder1.length() - 2));
    }

}
