public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }
    public INode peak(){
        return myLinkedList.head;
    }
    public void enqueue(INode myNode) {
        if(myLinkedList.head == null){
            myLinkedList.append(myNode);
        }
        else {
            myLinkedList.append(myNode);
        }
    }
}
