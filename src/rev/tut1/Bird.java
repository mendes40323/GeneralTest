package rev.tut1;

/**
 * Created by tonym on 07/03/2016.
 */
public class Bird extends Animal {
    public void fly(){
        System.out.println("fly fly flying.");
    }

    public Bird(){
        super();
        setSound("pri pri");
    }
}
