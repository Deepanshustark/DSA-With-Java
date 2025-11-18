
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees{
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int  idx=-1;
        
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnNode = new Node(nodes[idx]);
            newnNode.left=buildTree(nodes);
            newnNode.right=buildTree(nodes);

            return newnNode;

        }

        public static void preOrderTraversal(Node node){
            if(node == null) return;
            System.out.print(node.data + " " );
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
        public static void inOrderTraversal(Node node){
            if(node== null) return;
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);


        }
        public static void postOrderTraversal(Node node){
            if(node==null) return;

            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+" ");
        }

        public static int height(Node node){
            if(node==null) {
                return 0;
            }
            int lh=height(node.left);
            int rh=height(node.right);
            return Math.max(lh,rh)+1;
        }

        public static void levelOrder(Node node){
            if(node==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null) q.add(currNode.left);
                    if(currNode.right!=null) q.add(currNode.right);
                }
            }
            
        }

        public static int sum(Node node){
            
            if(node==null){
                return 0;
            }
            int sum=0;
            Queue<Node> q = new LinkedList<>();
            q.add(node);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                sum=sum+currNode.data;
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
         return sum;   
        }

        public static int totalNodes(Node node){
            
            if(node==null){
                return 0;
            }
            int count=0;
            Queue<Node> q = new LinkedList<>();
            q.add(node);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                
                    count++;
                    if(currNode.left!=null) q.add(currNode.left);
                    if(currNode.right!=null) q.add(currNode.right);
                
            }
         return count;   
        }

        public static int countNode(Node node){
            if(node==null){ return 0;}
            int leftCount=countNode(node.left);
            int rightCount=countNode(node.right);
            return leftCount+rightCount+1;

        }
        public static int sumOfNode(Node root){
            if(root==null) return 0;
            int leftSum=sumOfNode(root.left);
            int rightSum=sumOfNode(root.right);
            return leftSum+rightSum + root.data;
            

        }
        public static int diameter(Node root){
            if(root==null) return 0;
            int leftdiam=diameter(root.left);
            int rightdiam=diameter(root.right);
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            int self=leftHeight+rightHeight+1;
            int maxHeight= Math.max(leftdiam,rightdiam);
            return Math.max(self, maxHeight);
        }

    }
    public static void main(String[] args) {
        // tree1
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree1= new BinaryTree();
        Node root= tree1.buildTree(nodes);
        // System.out.println(root.data);
        // tree1.preOrderTraversal(root);
        // System.out.println();
        // tree1.inOrderTraversal(root);
        // System.out.println();
        // tree1.postOrderTraversal(root);
        // System.out.println(tree1.height(root));


        // tree 2

        BinaryTree tree2 = new BinaryTree();
        Node root1=new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left =new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.left.left.left = new Node(7);
        root1.left.left.right = new Node(8);
        root1.left.left.left.left = new Node(9);
        // System.out.println(tree2.height(root1));

    //    tree2.levelOrder(root1);
    //    System.out.println("sum of  nodes of tree2 =  "+tree2.sum(root1));
    //    System.out.println("total num of nodes of tree2 = "+tree2.totalNodes(root1));

    //    tree1.levelOrder(root);
    //    System.out.println("sum of nodes of tree1  = "+tree1.sum(root));
    //    System.out.println("total num of nodes of tree1  = "+tree1.totalNodes(root));
        tree1.levelOrder(root);
        // System.out.println();
        // tree2.levelOrder(root1);
        // System.out.println("total  in tree1  = "+tree1.countNode(root));
        // System.out.println("total nodes in tree2 = "+tree2.countNode(root1));
        // System.out.println("the sum of nodes of tree1 = "+tree1.sumOfNode(root));
        // System.out.println("the sum of nodes of tree1 = "+tree2.sumOfNode(root1));
        System.out.println(tree1.diameter(root));
        

 

    }

}