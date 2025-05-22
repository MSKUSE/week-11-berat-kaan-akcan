public interface Stack {

    void push(Object item);
    static Object pop();
    void peek() throws MyEmptyStackException;
    boolean isEmpty();


}
