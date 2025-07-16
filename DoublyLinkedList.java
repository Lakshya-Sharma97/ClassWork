class Node{
    int data;
    Node prev,next;
    //Constructor 
    Node(int data){
      this.data = data;
      this.prev = null;
      this.next = null;
    }
}
public class DoublyLinkedList{
    Node head;
    // Node tail;
    public void InsertAtBeg(int data){
          Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
           head= newNode;
    }
    // DeleteAtBeginning 
    public void DeleteAtBeginning(){
        if(head==null){
            return;
        }
        head = head.next;
    }
    //DeleteAtEnd
    public void DeleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){   
            head=null;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.prev.next=null;
        temp.prev = null;
    }
    // InsertAtEnd
    public void display(){
        Node temp = head;
        System.out.print("null <->");
        while(temp!=null){
            System.out.print(temp.data + " <->");
            temp = temp.next;
            // temp.prev = null;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
       DoublyLinkedList list = new DoublyLinkedList();
       list.InsertAtBeg(10);
       list.InsertAtBeg(20);
       list.InsertAtBeg(30);
       list.InsertAtBeg(40);
       list.InsertAtBeg(50);
       list.DeleteAtBeginning();
       list.DeleteAtBeginning();
       list.display();    
       list.DeleteAtEnd();
       list.display();    
    } 
}