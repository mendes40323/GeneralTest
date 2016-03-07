package rev.tut1;

public class WorkWithAnimals {

    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(10);

        System.out.println(fido.getSound());

        Cat fred = new Cat();
        fred.setName("Fred");

        System.out.println(fred.getSound());

    }
}
