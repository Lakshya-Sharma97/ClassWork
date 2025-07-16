class Node {
    int data;
    Node Next;
    // constructor
    Node(int data)
    {
        this.data=data;
        this.Next=null;
    }
}
public class SinglyLinkedList {
    //InsertAtBegin
    Node head;
    public void InsertAtBegin(int data){
        Node newNode= new Node(data);
        newNode.Next=head;
        head=newNode;
    }
    //InsertAtEnd
    public void InsertAtEnd(int data){
        Node temp=head;
        Node newNode=new Node(data);
        while (temp.Next!=null) {
            temp=temp.Next;
        }
            temp.Next=newNode;
    }
    //InsertAtEnd Can be written like this as well
    // public void InsertAtEnd(int data){
    //     Node newNode = new Node(data);
    //         if(head==null){  // list is empty 
    //             head =newNode;
    //             return;
    //          }
    //     Node temp = head;
    //         while(temp.Next!=null){
    //             temp = temp.Next;
    //         }    
    //         temp.Next=newNode;
    //         }  

    //InsertAtSpecificPosition 
    
    public void InsertAtSpecificPosition (int data, int position){
        if(position<1){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            InsertAtBegin(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        for(int i=1; temp!=null && i<position-1; i++){
            temp =temp.Next; 
        }
        if(temp==null){
            System.out.println("Position out of bounds");
        }
        else{
            newNode.Next = temp.Next;
            temp.Next = newNode;
        }
    }
    //DeleteAtBeginning 
    
    public void DeleteAtBeginning(){
        if(head==null){
            return;
        }
        head = head.Next;
    }
            
    public void DeleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.Next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.Next.Next != null) {
            temp = temp.Next;
        }
        temp.Next = null;
    }
// Delete at a specific position
    public void DeleteAtSpecificPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println("Invalid position or list is empty");
            return;
        }
        if (position == 1) {
            head = head.Next;
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.Next;
        }

        if (temp == null || temp.Next == null) {
            System.out.println("Position out of bounds");
        } else {
            temp.Next = temp.Next.Next;
        }
    }
    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.Next;

        }
            System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.InsertAtBegin(10);
        list.InsertAtBegin(20);
        list.InsertAtBegin(30);
        list.InsertAtBegin(20);
        list.InsertAtBegin(50);
        list.display();
        list.InsertAtEnd(17);
        list.InsertAtEnd(77);
        list.display();
        list.InsertAtSpecificPosition (75,4);
        list.display();
        list.InsertAtSpecificPosition (75,4);
        list.DeleteAtSpecificPosition(2);
        list.display();

    }
}


