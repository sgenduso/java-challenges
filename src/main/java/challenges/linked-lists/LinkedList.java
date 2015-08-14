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

  public int nodeLength(){
    return nodeCount;
  }

  public void addNode(int d) {
    Node newNode = new Node(d);
    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
    nodeCount++;
  }

  public void addMultipleNodes(int[] integers){
    for (int integer : integers) {
      Node newNode = new Node(integer);
      Node currentNode = head;
      while (currentNode.next != null){
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
      nodeCount++;
    }
  }

}
