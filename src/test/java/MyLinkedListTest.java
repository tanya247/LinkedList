import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MyLinkedListTest {
    int key;
    /*@Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){

        MyNode<Integer> myFirstNode = new MyNode<>(key = 70);
        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
        MyNode<Integer> myThirdNode = new MyNode<>(key = 56);
        MyLinkedList ML = new MyLinkedList();
        ML.add(myFirstNode);
        ML.add(mySecondNode);
        ML.add(myThirdNode);
        ML.printMyNode();
        boolean result = ML.head.equals(myThirdNode) &&
                         ML.head.getNext().equals(mySecondNode) &&
                         ML.tail.equals(myFirstNode);
        Assertions.assertTrue(result);

    }*/
    /*@Test
    public void given3NumbersWhenAppendToLinkedListShouldBeAddedAtLast(){

        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
        MyLinkedList ML = new MyLinkedList();
        ML.append(myFirstNode);
        ML.append(mySecondNode);
        ML.append(myThirdNode);
        ML.printMyNode();
        boolean result = ML.head.equals(myFirstNode) &&
                ML.head.getNext().equals(mySecondNode) &&
                ML.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }*/
    @Test
    public void insertBetween2Nodes(){
        MyNode<Integer> myFirstNode = new MyNode<>(key = 56);
        MyNode<Integer> mySecondNode = new MyNode<>(key = 30);
        MyNode<Integer> myThirdNode = new MyNode<>(key = 70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.popOut();
        myLinkedList.popLast();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                         myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}
