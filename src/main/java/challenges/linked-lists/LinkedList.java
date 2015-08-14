package challenges;

public class LinkedList {
  //specify first node(head) in list
  public Node head;
  public int nodeCount;

  public LinkedList(){
    //empty list to start
    head = new Node(null);
    nodeCount = 0;
  }

  public Boolean isEmpty(){
    return (head.data == null);
  }

  public int listLength(){
    return nodeCount;
  }

  public void addNode(Object d) {
    Node newNode = new Node(d);
    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
    nodeCount++;
  }

  public void addMultipleNodes(Object[] data){
    for (Object item : data) {
      Node newNode = new Node(item);
      Node currentNode = head;
      while (currentNode.next != null){
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
      nodeCount++;
    }
  }

}
