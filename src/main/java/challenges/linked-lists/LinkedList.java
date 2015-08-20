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

//add one node at a time
  public void addNode(Object d) {
    Node newNode = new Node(d);
    Node currentNode = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }
    currentNode.next = newNode;
    nodeCount++;
  }

//add array of multiple nodes
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

//remove nodes with duplicate data values
  public void removeDupes(){
    Node currentNode = head.next;
      int iteration = 0;
    while(currentNode.next != null){
      iteration = iteration + 1;
    Object currentData = currentNode.data;
      System.out.println("iteration: " + iteration + ", looking for: " + currentData);
    Node tempCurrent = currentNode;
      while(tempCurrent.next != null){
        System.out.println(tempCurrent.next.data);
        if (tempCurrent.next.data == currentData) {
          System.out.println("node " + tempCurrent.next.data + " removed");
          tempCurrent.next = tempCurrent.next.next;
          nodeCount--;
        } else {
          tempCurrent = tempCurrent.next;
        }
    }
      currentNode = currentNode.next;
  }
  }

}
