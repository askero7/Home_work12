public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        System.out.println("Name Dog: " + dog.getName());
        dog.setAge(2);
        System.out.println("Age Dog: " + dog.getAge());
        dog.setParoda("kuunaiyk");
        System.out.println("Paroda Dog: " + dog.getParoda());
        System.out.println("--------------");

        Fish fish = new Fish();
        fish.setName("Akula");
        System.out.println("Name Fish; " + fish.getName());
        fish.setAge(4);
        System.out.println("Age Fish: " + fish.getAge());
        fish.setParoda("bilbeim");
        System.out.println("Paroda Fish: " + fish.getParoda());
        System.out.println("------------------");

        Parrot par = new Parrot();
        par.setName("Gu-Gu");
        System.out.println("Name Parro: t" + par.getName());
        par.setAge(1);
        System.out.println("Age Parrot: " + par.getAge());
        par.setParoda("no");
        System.out.println("Paroda Parrot: "+ par.getParoda());

    }
}