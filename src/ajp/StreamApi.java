package ajp;

/**
 * Created by Andreas on 2017/5/16.
 */
import java.lang.Math;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.*;
import gm.Person;

public class StreamApi {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(value -> System.out.println(value));

        List<Integer> list = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        System.out.println(list.stream().count());

        Double average = list.stream().collect(Collectors.averagingInt(item -> item));
        System.out.println(average);

        IntSummaryStatistics iss = list.stream().collect(Collectors.summarizingInt(value -> value));
        System.out.println(iss);

        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(p -> p, q->q*3));
        System.out.println(map);

//        List<Integer> list1 = new Random().ints(-100,100).limit(250).boxed().collect(Collectors.toList());
//        Optional<Integer> max = list1.stream().reduce(Math::max);
//        max.ifPresent(value -> System.out.println(value));

    }

/*
    // 1
    public void printlnAllPersons(Collection<Person> persons) {
        persons.stream().forEach(System.out::println);
    }

    // 2
    public void printlnAllPersonsSortedByName(Collection<Person> persons) {
        persons.stream().sorted().forEach(System.out::println);
    }

    // 3
    public List<String> getAllLastNamesWithoutDuplicates(Collection<Person> persons) {
        persons.stream().forEach(System.out::println);
    }

    // 4
    public boolean areAllPetersFromGermany(List<Person> persons) {
        persons.stream().filter(s->"Peter".equals());
    }

    // 5
    public Optional<Person> findPeterBiggerThan(List<Person> persons, int meter) {

    }

    // 6
    public List<String> getAllHobbiesNoDuplicatesAndOrdered(List<Person> persons) {
        persons.stream().map(person -> person.getHobby());
    }

    // 7
    public int getSizeOfPersonInTheMiddle(List<Person> persons) {
        persons.stream().skip(persons.size()/2).map(p->p.getHeight()).findFirst().orElse(0);
    }

    // 8
    public Optional<Person> isThereAnyPersonThatAndPrintAllProcessedElementsToStdout(
            List<Person> persons,
            Collection<Person> morePersons,
            Predicate<Person> pred) {

        Stream.concat(persons.stream().)

    }

    // 9
    public Set<String> allStringsInList(List<Object> listOfArbitraryObjects) {
        persons.stream().filter

    }
*/

}
