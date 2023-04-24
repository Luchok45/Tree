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
        Collections.sort(student, (o1, o2) ->{
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if(length1>length2){
                return 1;
            }
            if(length1<length2){
                return -1;
            }
            return o1.getAge() - o2.getAge();
        });
        System.out.println(student);
    }
}