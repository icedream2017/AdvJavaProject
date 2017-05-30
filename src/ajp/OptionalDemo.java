package ajp;

import java.util.Optional;

/**
 * Created by Andreas on 5/30/2017.
 */
public class OptionalDemo {

    public static void main(String... args) {

        Optional<String> opStr = Optional.ofNullable(args[0]);
        Optional<String> s1 = opStr.filter(s -> s.length() > 5);
        Optional<Integer> sLen = s1.map(String::length);
        sLen.orElse(1);
        sLen.orElseGet(()->1);
        sLen.orElseThrow(RuntimeException::new);

        String str = opStr.get();

        int i;
        opStr.ifPresent(s -> i = s.length());

    }
}
