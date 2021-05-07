import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class MyQueueTest {
    @Test
    void given3NumbersInQueueWhenEnqueueShouldBeDoneByFIFO() {
        int key;
        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peak = myQueue.peak();
        Assertions.assertEquals(peak,myFirstNode);
        boolean result = peak.getNext().equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}
