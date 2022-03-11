public class reverseLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void display() {
        Node currNode = head;
        if(head == null) {
            System.out.println("list is empty");
        }
        while(currNode != null) {
            System.out.print(currNode.data +" --> ");
            currNode = currNode.next;
       }
       System.out.println("null");
       System.out.println();
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
        head =  prevNode;   
    }

    public int countNode() {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        list.addNode(2);
        list.addNode(7); 
        list.addNode(5);
        list.addNode(4);
        list.display();

        list.reverseIterate();
        list.display();

        System.out.println("total nodes are : " + list.countNode());

    }
}