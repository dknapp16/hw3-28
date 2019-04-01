import java.util.List;

public class Person {


    public Person(List<String> name) {
        this.name = name;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }

    private List<String> name;


    public Person() {

    }
}
