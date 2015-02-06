package interfaces;

/**
 * Created by extradikke on 04/02/15.
 */
public interface StackerForList<T> {

    int size();
    boolean push(T thing);
    boolean isEmpty();
    T pop();

}
