import java.util.List;

public class Task {

    public Task(List<String> name) {
        this.name = name;
    }

    public Task() {

    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name=" + name +
                '}';
    }

    private List<String>name;



    }



