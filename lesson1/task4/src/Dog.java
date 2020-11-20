public class Dog extends Animal{

    Dog(String name, int age) {
        super(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("Dog talk's");
    }
}
