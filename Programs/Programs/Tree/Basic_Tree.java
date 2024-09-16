package Programs.Tree;


import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

class treeNode{
    int data;
    treeNode left = null;
    treeNode right = null;

    treeNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Basic_Tree {
    public static void main(String[] args) {
        treeNode root = null;
        Scanner sc = new Scanner(System.in);
//        HashMap<treeNode,ArrayList<treeNode>> map = new HashMap<>();
        boolean loop = true;
        while(loop)
        {
            System.out.println("Choose the following operation : ");
            System.out.println("1) Create Node\n2) Display \n3) Lowest Common Ancestor \n4) Exit");
            int inp = sc.nextInt();
            switch (inp)
            {
                case 1 :
                    if(root==null)
                    {
                        System.out.println("Enter the data : ");
                        int data = sc.nextInt();
                        treeNode newNode = new treeNode(data);
                        root = newNode;
                    }else {
                        boolean loop1 = true;
                        while(loop1)
                        {
                            treeNode q = root;
                            System.out.println("\nEnter the data : ");
                            int data = sc.nextInt();
                            treeNode newNode = new treeNode(data);
                            boolean set = true;
                            while(set) {
                                System.out.println("\nEnter on which side of " + q.data + " do you want to add this Node ");
                                System.out.println("press \n1) Left \n2) Right");
                                int dir = sc.nextInt();
                                if (dir == 1) {
                                    if (q.left == null) {
                                        q.left = newNode;
                                        set = false;
                                    } else {
                                        q = q.left;
                                    }
                                }
                                else if(dir == 2)
                                {
                                    if (q.right == null) {
                                        q.right = newNode;
                                        set = false;
                                    } else {
                                        q = q.right;
                                    }
                                }
                                else{
                                    System.out.println("Invalide input! 😡 \n");
                                }
                            }

                            System.out.println("If you want to add more data then press 'y' else press 'any key' ");
                            char ch = sc.next().trim().charAt(0);
                            if(ch!='y')
                            {
                                loop1 = false;
                            }

                        }

                    }
                    break;
                case 2:
                    display(root);
                    break;
                case 3:
                    System.out.println("Enter the starting Node  : ");
                    int startVal = sc.nextInt();
                    System.out.println("Enter the Destination Node : ");
                    int destval = sc.nextInt();
                    treeNode lca = LCA(root,startVal,destval);
                    System.out.println(lca.data);

                    break;
                case 4:
                    loop=false;
                    System.out.println("Thank You 😀");
                    break;

                default:
                    System.out.println("Invalide input!");
            }

        }

    }

    private static treeNode LCA(treeNode root, int startVal, int destval) {
        if(root==null)
        {
            return null;
        }

        if(root.data == startVal)
        {
            return root;
        }else if(root.data == destval)
        {
            return root;
        }

        treeNode leftNode = LCA(root.left,startVal,destval);
        treeNode rightNode = LCA(root.right,startVal,destval);

        if(leftNode==null &&  rightNode!=null)
        {
            return rightNode;
        }else if(leftNode!=null && rightNode==null)
        {
            return leftNode;
        }else if(leftNode!=null && rightNode!=null){
            return root;
        }else{
            return null;
        }
    }

    private static void createNode(treeNode root) {
        Scanner sc = new Scanner(System.in);

        if(root==null)
        {
            System.out.println("Enter the data : ");
            int data = sc.nextInt();
            treeNode newNode = new treeNode(data);
            root = newNode;
        }else {
            boolean loop = true;
            while(loop)
            {
                treeNode q = root;
                System.out.println("\nEnter the data : ");
                int data = sc.nextInt();
                treeNode newNode = new treeNode(data);
                boolean set = true;
                while(set) {
                    System.out.println("\nEnter on which side of " + q.data + " do you want to add this Node ");
                    System.out.println("press \n1) Left \n2) Right");
                    int dir = sc.nextInt();
                    if (dir == 1) {
                        if (q.left == null) {
                            q.left = newNode;
                            set = false;
                        } else {
                            q = q.left;
                        }
                    }
                    else if(dir == 2)
                    {
                        if (q.right == null) {
                            q.right = newNode;
                            set = false;
                        } else {
                            q = q.right;
                        }
                    }
                    else{
                        System.out.println("Invalide input! 😡 \n");
                    }
                }

                System.out.println("If you want to add more data then press 'y' else press 'any key' ");
                char ch = sc.next().trim().charAt(0);
                if(ch!='y')
                {
                    loop = false;
                }

            }

        }
    }

    private static void display(treeNode root) {
        if(root==null)
        {
            return;
        }


        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }


}
