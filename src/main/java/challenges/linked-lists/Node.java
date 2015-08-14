package challenges;

public class Node {
  Node next = null;
  Object data;

  public Node(Object d) {
    data = d;
  }

  public Object getNodeData() {
    return data;
  }

  public void setNodeData(Object d) {
    data = d;
  }

  public Node getNextNode(){
    return next;
  }

  public void setNextNode(Node nextNode){
    next = nextNode;
  }

}
