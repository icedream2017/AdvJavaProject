package ajp;

/**
 * Created by Andreas on 2017/5/16.
 */

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Leca {
    private void overloadedMethod(Collection<?> o) {
        System.out.println("First");
    }

    private void overloadedMethod(List<?> s) {
        System.out.println("Second");
    }

    private void overloadedMethod(ArrayList<Integer> i) {
        System.out.println("Third");
    }

    public void method(List t) {
        this.overloadedMethod(t);
    }
}
