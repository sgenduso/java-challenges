package challenges;

public class Node {
  Node next = null;
  int data;

  public Node(int d) {
    data = d;
  }

  public int getNodeData() {
    return data;
  }

  public void setNodeData(int d) {
    data = d;
  }

  public Node getNextNode(){
    return next;
  }

  public void setNextNode(Node nextNode){
    next = nextNode;
  }

}
