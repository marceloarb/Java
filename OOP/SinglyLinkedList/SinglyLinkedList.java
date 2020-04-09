public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    public void remove(){
        Node runner = this.head;
        while(runner.next != null){
            if(runner.next.next == null){
                runner.next = null;
                break;
            }
            runner = runner.next;
        }
    }
    public void printValues(){
        Node runner = this.head;
        if(this.head == null){
            System.out.println("No Nodes!");
        }
        while(runner.next != null ){
            System.out.println(runner.value);
            runner = runner.next;
        }
        
    }
}