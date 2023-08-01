public class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.address != null) {
                System.out.println(temp.address);
                temp = temp.address;
            }
            temp.address = newNode;
            System.out.println(temp.address);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
    }
}