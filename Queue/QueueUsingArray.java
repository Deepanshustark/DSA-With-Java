public class QueueUsingArray{

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=0;

        }
        public  boolean isEmpty(){
            return rear==-1;
        }
        public  void add(int e){
            if(rear==size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=e;
            
        }
        public  int remove(){
            if(front>rear || rear==-1) return -1;
            int data=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return data;

        }
        public  void traverse(){
            if(isEmpty()) {
                System.out.println("Queue is empty"); return;
            }
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int p=arr[0];
            return p;
        }

    }



    public static void main(String[] args){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.traverse();
        System.out.println("Delete element : "+q.remove());
        System.out.println("Delete element : "+q.remove());
        System.out.println("Delete element : "+q.remove());
        q.traverse();
        System.out.println(q.isEmpty());
        q.add(6);
        q.add(7);
        q.traverse();
        System.out.println(q.peek());
    }
}