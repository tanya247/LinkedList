import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToTheStackShouldHaveLastAddedNode(){
        int key;
        MyNode<Integer> myFirstNode = new MyNode<>(key = 70);
        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
        MyNode<Integer> myThirdNode = new MyNode<>(key = 56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
}
