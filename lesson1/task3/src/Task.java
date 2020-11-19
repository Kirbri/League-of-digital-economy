public class Task {
    private String name;
    private String surname;
    private int age;
    private String description;

    Task(String name, String surname, int age, String description){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.description = description;
    }


    public static void main(String[] args) {
        Task task = new Task("Ann", "Kornilova", 22, "it is necessary");

        System.out.println(task.toString());
    }



    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old"
                + "I learn Java because " + description;

    }


}