
public class List {
    Node head;
    Node tail;

    public static class Node {
        int value;
        Node next;
        Node previous;
    }

    public static void main(String[] args) {
        List l1 = new List();
        List l2 = new List();
        l1.add(9);
        l1.add(29);
        l1.add(13);
        l1.add(77);
        l1.add(3);
        l1.printLt();

        l1.revert();
        l1.printLt();

//        printList(l1.head);
//        System.out.println(l1.find(11).value);
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
    }

    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void printLt() {
        Node current = head;
        while (current != null) {
            System.out.printf("%d ", current.value);
            current = current.next;
        }
        System.out.println();
    }

//    public static void printList(Node head)
//    {
//        Node ptr = head;
//        while (ptr != null)
//        {
//            System.out.print(ptr.value + " —> ");
//            ptr = ptr.next;
//        }
//
//        System.out.println("null");
//    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(head, tail);
//    }

//    public Node find(int value) {
//        Node currentNode = head;
//        while (currentNode != null) {
//            if (currentNode.value == value) {
//                return currentNode;
//            }
//            currentNode = currentNode.next;
//        }
//        return null;
//    }

//    public void push (int value){
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head = node;
//    }

//    public Integer peek(){
//        Integer result = null;
//        if (tail != null){
//            result = tail.value;
//            tail.previous.next = null;
//            tail = tail.previous;
//        }
//        return result;
//    }

//    public Integer pop(){
//        Integer result = null;
//        if (head != null){
//            result = head.value;
//            head = head.next;
//        }
//        return result;
//    }

//
//    public void add(int value, Node node) {
//        Node next = node.next;
//        Node newNode = new Node();
//        newNode.value = value;
//        node.next = newNode;
//        newNode.previous = node;
//        if (next == null) {
//            tail = newNode;
//        }
//        else {
//            next.previous = newNode;
//            newNode.next = next;
//        }
//    }
//    public void delete(Node node){
//        Node previous = node.previous;
//        Node next = node.next;
//        if (previous == null){
//            next.previous = null;
//            head = next;
//        }
//        else {
//            if (next == null){
//                previous.next = null;
//                tail = previous;
//            }
//            else {
//                previous.next = next;
//                next.previous = previous;
//            }
//        }
//    }
//

//    public void revert() {
//        if (head != null && head.next != null) {
//            Node temp = head;
//            revert(head.next, head);
//            temp.next = null;
//        }
//    }
//
//    private void revert(Node currentNode, Node previousNode) {
//        if (currentNode.next == null) {
//            head = currentNode;
//        } else {
//            revert(currentNode.next, currentNode);
//        }
//        currentNode.next = previousNode;
//        previousNode.next = null;
//    }
}
