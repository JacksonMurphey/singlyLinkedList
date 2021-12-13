

public class SinglyLinkedList {
    
    Node head;

    public Node addNode(int data){

        Node newNode = new Node(data);

        if( head == null ){
            head = newNode;
            return newNode;
        }
        
        Node current = head; 

        while(current.next != null){
            current = current.next;
        }

        return newNode;
    }

    public void display(){

        //  edge case
        if (head == null) return;

        Node current = head; 


        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }


        

    }

}
