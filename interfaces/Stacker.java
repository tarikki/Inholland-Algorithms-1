package interfaces;

/**
 * Created by extradikke on 04/02/15.
 */
public interface Stacker<T> {

    int size();
    boolean push(T thing);
    boolean isEmpty();
    T pop();

}
