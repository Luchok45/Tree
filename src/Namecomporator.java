import java.util.Comparator;
public class Namecomporator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return Integer.compare(person.getName().length(), t1.getName().length());
    }
}