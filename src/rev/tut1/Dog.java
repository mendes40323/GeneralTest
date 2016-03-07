package rev.tut1;

/**
 * Created by tonym on 07/03/2016.
 */
public class Dog extends Animal {

    public void digHole(){
        System.out.println("Dug hole.");
    }

    public Dog(){
        super();

        setSound("Bark");
    }

}
