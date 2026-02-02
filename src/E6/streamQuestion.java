package E6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamQuestion {
    public static void main(String[] args){
    List<Person> people = Arrays.asList(
            new Person("Alice"),
            new Person("Bob"),
            new Person("Charlie")
    );

    List<String> names = people.stream()
        .map(person -> {
            String name = person.getName();
            return name;
    })
            .collect(Collectors.toList());

    List<Person> modifiedPeople = people.stream()
            .map(person -> {
                person.setName(person.getName().toUpperCase());
                return person;
            })
            .collect(Collectors.toList());

    // Print modified people
        System.out.println("\nModified People:");
    modifiedPeople.forEach(System.out::println);

    // Print Original people
        System.out.println("\nModified People:");
    people.forEach(System.out::println);
}

}
