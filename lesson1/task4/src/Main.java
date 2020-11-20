public class Main {
   public static void main(String[] args) {
   Cat cat = new Cat("Cat", 25);
   Dog dog = new Dog("Dog", 30);
   Animal animal = new Animal("Animal", 1000);

   animal.talk();
   cat.talk();
   dog.talk();
   }
}