public class CircularQueueUsingArray {
     static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;

        }
        public  boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public  boolean isFull(){
            return (rear+1)%size == front;
        }
        public  void add(int e){
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear=(rear+1)%size;
            arr[rear]=e;
            
        }
        public  int remove(){
            if(isEmpty()) return -1;
            int data=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
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
            return arr[front];
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
