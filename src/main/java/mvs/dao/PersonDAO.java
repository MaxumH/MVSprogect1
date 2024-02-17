package mvs.dao;

import mvs.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tim","tim@gamil.com",12));
        people.add(new Person(++PEOPLE_COUNT, "Mark","marc@gmail.ukrcom",34));
        people.add(new Person(++PEOPLE_COUNT, "Maks","maks@gmail.com",18));
        people.add(new Person(++PEOPLE_COUNT, "Tom","jimbo@gmail.com",22));
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id)
    {
        people.removeIf(p ->p.getId()==id);
    }

}
