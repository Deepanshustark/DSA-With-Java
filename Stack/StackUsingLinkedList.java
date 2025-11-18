public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static  class  LinkedList{
          static Node head=null;
          public static boolean isEmpty(){
            return head==null;
        }
          public static void push(int data){
            Node newnode= new Node(data);
            if(head==null){
                head=newnode;
            }else{
             newnode.next=head;
             head=newnode;
            }
        }
          public static int pop(){
            if(head==null){
                return -1;
            }
            else{
                int top=head.data;
                head=head.next;
                return top;
            }
        }
          public static int peek(){
            if(head==null){
                return -1;
            }
            else{
                return head.data;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList.push(1);
        LinkedList.push(2);
        System.out.println(LinkedList.peek());
        LinkedList.push(3);
        LinkedList.push(4);
        System.out.println(LinkedList.isEmpty());
        System.out.println(LinkedList.pop());
        System.out.println(LinkedList.peek());
    }
    
}
