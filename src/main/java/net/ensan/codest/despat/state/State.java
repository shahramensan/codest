package net.ensan.codest.despat.state;

/**
 * <p>State design pattern is used when an Object change its behavior based
 * on its internal state.
 *
 * <p>State pattern is used to provide a systematic and lose-coupled way to
 * achieve this through Context and State implementations. Context is the class
 * that has a State reference to one of the concrete implementations of the
 * State and forwards the request to the state object for processing.
 *
 * <p>The benefits of using State pattern to implement polymorphic behavior is
 * clearly visible, the chances of error are less and it’s very easy to add more
 * states for additional behavior making it more robust, easily maintainable and
 * flexible. Also State pattern helped in avoiding if-else or switch-case conditional
 * logic in this scenario.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public interface State {

    public void doAction();
}
