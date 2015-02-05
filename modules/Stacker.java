package modules;

/**
 * Created by extradikke on 04/02/15.
 */
public interface Stacker {

    int size();
    boolean push(int number);
    boolean isEmpty();
    int pop();

}
