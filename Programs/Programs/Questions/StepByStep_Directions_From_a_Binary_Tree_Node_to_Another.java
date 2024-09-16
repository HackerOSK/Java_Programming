package Programs.Questions;



import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Scanner;

class TreeNode1{
    int data;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class StepByStep_Directions_From_a_Binary_Tree_Node_to_Another {
    public static void main(String[] args) {

        TreeNode1 root  = new TreeNode1(5);
        CreateNode(root);



//        preOrder(root);
//        1) Lowest common ancestor
//        2) Then go to LCA to Start
//        3) go to LCA to End
//        4) merge Start to End

//        Lowest_Common_Ancestor
        int startVal  = 3;
        int destVal = 6;
        TreeNode1 lca = LCA(root,startVal,destVal);
        System.out.println(lca.data);

        StringBuilder fp = new StringBuilder();
        StringBuilder bp = new StringBuilder();

        GetPath(lca,startVal,fp);
        GetPath(lca,destVal,bp);
        int len = fp.length();
        fp = new StringBuilder();
        for(int i =0;i<len;i++)
        {
            fp.append('U');
        }

        System.out.println(fp.toString()+bp.toString());








    }

    private static boolean GetPath(TreeNode1 lca, int Val, StringBuilder sb) {
        if(lca==null)
        {
            return false;
        }
        if(lca.data == Val ) {
            return true;
        }

        boolean left = GetPath(lca.left,Val,sb.append('L'));
        if(left)
        {
            return true;
        }
        sb.delete(sb.length()-1,sb.length());
        boolean right = GetPath(lca.right, Val,sb.append('R'));
        if(right)
        {
            return true;
        }
        sb.delete(sb.length()-1,sb.length());
        return false;

    }


    static TreeNode1 LCA(TreeNode1 root, int startVal, int destval) {
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

        TreeNode1 leftNode = LCA(root.left,startVal,destval);
        TreeNode1 rightNode = LCA(root.right,startVal,destval);

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



    private static void preOrder(TreeNode1 root) {
        if(root == null )
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }


    private static void CreateNode(TreeNode1 root) {
        Scanner sc = new Scanner(System.in);
        if(root==null)
        {
            System.out.println("Enter the data into the node : ");
            int data = sc.nextInt();
            TreeNode1 node = new TreeNode1(data);
            root=node;
        }else{
            boolean loop = true;
            while(loop)
            {
                System.out.println("Enter the data into the node : ");
                int data = sc.nextInt();
                TreeNode1 node = new TreeNode1(data);
                boolean status = true;
                TreeNode1 q = root;
                while (status)
                {
                    System.out.println("Enter on which side of  "+q.data+" you want to add the new node : ");
                    System.out.println("press 1) Left \t 2) Right");
                    int dir = sc.nextInt();
                    if(dir==1)
                    {
                        if(q.left==null)
                        {
                            q.left = node;
                            status = false;
                        }else{
                            q = q.left;
                        }
                    }else if(dir==2)
                    {
                        if(q.right==null)
                        {
                            q.right = node;
                            status = false;
                        }else{
                            q = q.right;
                        }
                    }else{
                        System.out.println("Invalide! Input!");
                    }
                }

                System.out.println("If you want to add one more node then press 'y' else press 'any key' ");
                char ch = sc.next().trim().charAt(0);
                if(ch!='y')
                {
                    loop = false;
                }

            }
        }
    }
}
