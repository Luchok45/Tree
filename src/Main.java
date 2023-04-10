import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> student = new ArrayList<Person>();
        student.add(new Person("Ivan", "Ivanov", 18 ));
        student.add(new Person("Sasha", "Fidulov", 19 ));
        student.add(new Person("Stanislav", "Vinov", 22 ));
        student.add(new Person("Nikol", "Sumova", 20 ));
        student.add(new Person("Valeria", "Ivanova", 25 ));
        System.out.println(student);
        Collections.sort(student, new Namecomporator());
        System.out.println(student);
    }
}