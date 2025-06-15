public class ReverseaLinkedList{
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    
    //Insert atend
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
            
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
        
        public void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
        public void reverseList() {
            Node prev = null;
            Node current = head;
            Node next = null;
            
            while (current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            
            head = prev;
        }
        
        public static void main(String[] args) {
            ReverseaLinkedList list = new ReverseaLinkedList();
            
            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);
            list.insertAtEnd(40);
            
            System.out.print("original List: ");
            list.display();
            
            list.reverseList();
            
            System.out.print("Reversed list: ");
            list.display();
            
        }
    }
    
