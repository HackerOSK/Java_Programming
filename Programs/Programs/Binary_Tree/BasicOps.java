package Programs.Binary_Tree;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BasicOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        Node root = null;

        while(loop)
        {
            System.out.println("Choose the following operation on the tree : ");
            System.out.println("1) Create Node \n2) PreOrder \n3) InOrder \n4) PostOrder \n5) Level Order\n6) Height \n7) Count Nodes \n8) Leaf Nodes\n9) Path from Root to Node\n10) Exit");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    root = createNode(root);
                    break;
                case 2:
                    System.out.println("Preorder : ");
                    Preorder(root);
                    break;
                case 3:
                    System.out.println("Inorder : ");
                    Inorder(root);
                    break;
                case 4:
                    System.out.println("Postorder : ");
                    Postorder(root);
                    break;
                case 5:
                    Levelorder(root);
                    break;
                case 6:
                    int h = height(root);
                    System.out.println("Height of given binary tree : "+h);
                    break;
                case 7:
                    int numLeaves = CountLeaves(root);
                    System.out.println("Count of the leaves of the tree : "+(numLeaves-1));
                    break;
                case 8:
                    leafNodes(root);
                    break;
                case 9:
                    System.out.println("Enter the target : ");
                    int target = sc.nextInt();
                    ArrayList<Node>list = new ArrayList<>();
                    list.add(root);
                    PathFromRootToNode(root,list,target);
                    for(Node l : list)
                    {
                        System.out.println(l.data);
                    }
                    break;
                case 10:
                    loop=false;
                    break;

                default:
                    System.out.println("Invalide Input!");
            }

        }
    }

    private static void PathFromRootToNode(Node root, ArrayList<Node> list,int target) {
        if(root==null)
        {
            return;
        }
        PathFromRootToNode(root.left,list,target);
        list.add(root);
        if(root.data==target)
        {
            list.add(root);
            return;
        }
        PathFromRootToNode(root.right,list,target);
        list.remove(list.size()-1);

    }

    private static void leafNodes(Node root) {
        if(root.left==null && root.right==null)
        {
            System.out.println(root.data);
            return;
        }
        leafNodes(root.left);
        leafNodes(root.right);
    }

    private static int CountLeaves(Node root) {
        if(root==null)
        {
            return 1;
        }
        return CountLeaves(root.left)+CountLeaves(root.right);
    }

    private static int height(Node root) {
        if(root==null)
        {
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }

    private static void Levelorder(Node root) {
        Queue<Node> queue =  new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.peek();
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }if(temp.right!=null)
        {
            queue.add(temp.right);
        }
            System.out.println(queue.remove().data);
        }
    }

    private static void Preorder(Node root) {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }

    private static void Inorder(Node root) {
        if(root==null)
        {
            return;
        }

        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    private static void Postorder(Node root) {
        if(root==null)
        {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);
    }

    private static Node createNode(Node root) {
        Scanner sc = new Scanner(System.in);
        if(root==null)
        {
            System.out.println("Enter the data : ");
            int data = sc.nextInt();
            Node temp = new Node(data);
            root=temp;
            System.out.println("Root created Successfully!");
            return root;
        }
        else {
            boolean l2 = true;

            while(l2)
            {
                System.out.println("Enter the data : ");
                int data = sc.nextInt();
                Node temp = new Node(data);
                Node q = root;
                boolean check = true;
                while(check)
                {
                    if(temp.data>q.data)
                    {
                        if(q.right==null)
                        {
                            q.right=temp;
                            check=false;
                        }else{
                            q=q.right;
                        }
                    }else{
                        if(q.left==null)
                        {
                            q.left=temp;
                            check=false;
                        }else{
                            q=q.left;
                        }
                    }
                }
                System.out.println("Node Added Successfully!");
                System.out.println("If you want to add more Node then press 'y' else press any other key : ");
                char cho = sc.next().trim().charAt(0);
                if(cho!='y')
                {
                    l2=false;
                    return root;
                }
            }
        }
        return root;
    }
}
