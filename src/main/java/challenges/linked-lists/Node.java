package challenges;

public class Node {
  Node next = null;
  int data;

  public Node(int d) {
    data = d;
  }

  void addNode(int d) {
    Node newNode = new Node(d);
    Node currentNode = this;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
  }
}
