package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lecture12 {
    @Test
    public void understandingCollect() throws Exception {
        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        ArrayList::new,
                        List::add,
                        List::addAll
                );

        List<String> emails2 = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        () -> new ArrayList<>(),
                        (list, element) -> list.add(element),
                        (list1, list2) -> list1.addAll(list2)
                );

        emails.forEach(System.out::println);
    }
}
