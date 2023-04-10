public class Person {
    private String name;
    private String surname;
    private int age;
    public Person(String name, String surname, int age ){
        this.name=name;
        this.surname=surname;
        this.age=age;
    };
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String s){
        surname=s;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    @Override
    public String toString() {
        return  name +  " " + surname + " " + age;
    }
}
