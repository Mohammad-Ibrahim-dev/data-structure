import java.util.*;

public class binarytree_self {
    // build node of tree
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data = data;
           this.left = null;
           this.right =null;
        }
    }

    // build tree
    static class binarytree{
        static int indx=-1;
        public static Node buildtree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[indx]);
            newnode.left = buildtree(nodes);
            newnode.right =buildtree(nodes);
            return newnode;
        }
        //preorder
        public static void preorder(Node root){
            if(root == null){
                System.out.print("NULL ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //postorder
        public static void postorder(Node root){
            if(root==null){
                System.out.print("NULL ");
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print((root.data +" "));
        } 
        //inorder
        public static void inorder(Node root){
            if(root==null){
              System.out.print("NULL ");
              return;
            }
            inorder(root.left);
            System.out.print(root.data +" ");
            inorder(root.right);
        }  
        //levelorder or B.F.S
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr =q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }else{
                System.out.print(curr.data +" ");
                if(curr.left!=null ){
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    q.add(curr.right);
                }    
                }       
            }        
        }
        // height of tree
        public static int Height(Node root){
           if(root == null){
            return 0;
           }
           int leftheight =Height(root.left);
           int rightheight = Height(root.right);
           return Math.max(leftheight,rightheight) +1;
        }
        //count nodes of tree
        public static int countNodes(Node root){
            if(root==null){
              return 0;
            }
            int leftcout=countNodes(root.left);
            int rightcount=countNodes(root.right);
            return leftcout + rightcount +1;
        }
        //sum of nodes
        public static int sumofnode(Node root){
            if(root==null){
                return 0;
            }
            int leftSum =sumofnode(root.left);
            int rightSum =sumofnode(root.right);
            return leftSum+rightSum+root.data;
        }
     /*    //diameter of the tree
        public static TreeInfo treeDiameter(Node root){
            if(root==null){
                return new TreeInfo(0,0);
            }
        }*/
    }  
    
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);
        //System.out.println(root.data +" ");
        System.out.println("\n---preorder traverse---");
        tree.preorder(root);
        System.out.println("\n---postorder traverse---");
        tree.postorder(root);
        System.out.println("\n---inorder traverse---");
        tree.inorder(root);
        System.out.println("\n---levelorder traverse---");
        tree.levelorder(root);
        System.out.println("height of tree= " + tree.Height(root));
        System.out.println("numbers of nodes "+tree.countNodes(root));
        System.out.println("sum of nodes ="+tree.sumofnode(root));
    }
}