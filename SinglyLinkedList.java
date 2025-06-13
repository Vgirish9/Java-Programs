public class SinglyLinkedList {
    
    
    class Node {
        int data;
        Node next;

        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    Node head = null;

    
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void insertatEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    
 public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertatEnd(50);
        list.insertatEnd(40);

        list.display();
    }
}
   



    
