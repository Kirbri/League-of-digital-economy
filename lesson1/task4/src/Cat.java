public class Cat extends Animal{

    Cat(String name, int age) {
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
        System.out.println("Cat talk's");
    }
}
