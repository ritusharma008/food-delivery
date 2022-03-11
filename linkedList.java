public class linkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
 
    
    public void addFirst(String data) {
        Node newNode = new Node(data);    // insert new node at first
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(String data) {    // add  new node at last
        Node newNode = new Node(data);
        while(head != null) {
            head = newNode;
            tail= newNode;
        }
            tail.next = newNode;
            tail = newNode;
    }

    public void deleteFirst() {   // delete first node
        if(head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
    }

    public void deleteLast() {    //delete node at last
        if(head == null) {
            System.out.println("list is empty");
        }
        if(head.next == null)  {
            head = null;  
            return;    
        } 

        Node secondLast = head;
        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        secondLast = head;
    }

    public void display() {   //  traverse a list
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }

    
    public int countNodes() {    // count nodes
        int count = 0;
        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode; 

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addAtLast("Ritu");
        list.addAtLast("is");
        list.addAtLast("a");
        list.addAtLast("girl");

        list.display();

        list.addFirst("hi");
        list.addFirst("hello");
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
        
        list.reverseIterate();
        list.display();

        System.out.println("total number of nodes : " +list.countNodes());
        
    }
}

