import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class priorityCheck {

    private static final Map<String, Integer> priorityCheck = Stream.of(
            new AbstractMap.SimpleImmutableEntry<>("+",1),
            new AbstractMap.SimpleImmutableEntry<>("-",1),
            new AbstractMap.SimpleImmutableEntry<>("*",2),
            new AbstractMap.SimpleImmutableEntry<>("/",2),
            new AbstractMap.SimpleImmutableEntry<>("(",3),
            new AbstractMap.SimpleImmutableEntry<>(")",3)
    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    public static int check (String op) throws Exception {
        if (priorityCheck.containsKey(op)){
            return priorityCheck.get(op);
        }else
            throw new RuntimeException("Operator error");
    }

//    public static void main(String[] args) throws Exception {
//        System.out.println(check("+"));
//    }
}
