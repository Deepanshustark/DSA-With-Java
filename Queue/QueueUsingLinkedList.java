

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
        static Node head=null;
        static Node tail=null;
        static int size=0;

        public boolean isEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node node = new Node(data);
            if(head==null){
                head=tail=node;
                return;
            }
                tail.next=node;
                tail=node;
                size++;
            
        }
        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int data=head.data;
            if(tail==head){
                tail=head=null;
            }
            head=head.next;
            size--;
            return data;
        }

        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        public  void traverse(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        QueueUsingLinkedList q= new QueueUsingLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.traverse();
        System.out.println(q.peek());
        System.out.println("Delete element : "+q.remove());
        System.out.println("Delete element : "+q.remove());
        System.out.println(q.isEmpty());
        q.traverse();
    }

}
