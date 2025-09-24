class NodeStructure{
    public static class Node{
       public int data;
       public  Node next;

        //Constructor
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size;

    // add First
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            node.data=data;
            node.next=null;
            head=tail=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
    }
    public void print(Node head){
        Node temp= head;
        while(temp!=null){
            if(temp.next==null){
                System.out.println(temp.data);
            }else{
                System.out.print(temp.data + " > ");
            }
            temp=temp.next;
        }
    }

    // add last
    public void addLast(int data){
        Node node= new Node(data);
        if(tail==null){
            node.next=null;
            tail=head=null;
        }else{
            tail.next=node;
            tail=node;
        }
        size++;
    }
    // remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    // remove last

    public int removeLast(){
        Node temp=head;
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        int val=temp.data;
        size--;
        return val;
    }
    // add mid
    public void addMid(int idx, int data){
        if(size==0){
            addFirst(data);
        }
        Node newnode= new Node(data);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;

    }

    // Search Value by Iterator

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


    public static void main(String[] args) {
        NodeStructure ll= new NodeStructure();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(50);
        ll.addLast(60);
        ll.removeFirst();
        ll.removeLast();
        ll.addMid(2,35);
        ll.addMid(4,45);
        ll.addFirst(10);
        ll.addLast(60);
        ll.print(head);
        System.out.println("Size = "+size);
        System.out.println(ll.itrSearch(40));
        System.out.println(ll.itrSearch(70));
        
    }
}