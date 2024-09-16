package Programs.Questions.TreeQuestions;


import java.util.ArrayList;
import java.util.Scanner;

class Treenode{
    int data;
    Treenode left;

    Treenode right;
    Treenode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Delete_Nodes_And_Return_Forest {
    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        addnode(2,'l',root);
        addnode(4,'l',root);
        addnode(5,'l',root);
        addnode(3,'r',root);
        addnode(6,'r',root);
        addnode(7,'r',root);

        preOrder(root);


//        delete node
//        store left and right node inside the arraylist if they are not null
        ArrayList<Treenode> ans = new ArrayList<>();
        int count = 0;
        int to_delete[] = {3,5};
        for(int i : to_delete) {
            if(root.data!=i)
            {
                count++;
            }
            deleteNodes(root,i,ans);
            Treenode check = new Treenode(i);
            if(ans.contains(check))
            {
                ans.remove(check);
            }
        }

        if(count>0)
        {
            ans.add(root);
        }






        System.out.println("----------------------------------------");

        for(Treenode i : ans)
        {
            System.out.println(i.data);
        }


    }

    private static void deleteNodes(Treenode root, int i, ArrayList<Treenode> ans) {
            if(root==null)
            {
                return;
            }
            if(root.data==i)
            {
                if(root.left!=null)
                {
                    ans.add(root.left);
                }
                if(root.right!=null)
            {
                ans.add(root.right);
            }
            }

            deleteNodes(root.left,i,ans);
            deleteNodes(root.right,i,ans);

    }

    private static void preOrder(Treenode root) {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void addnode(int i, char l,Treenode root) {
        Treenode n1 = new Treenode(i);
        Treenode q = root;
        Scanner sc = new Scanner(System.in);
        boolean status = true;

        while(status)
        {
            if(l == 'l')
            {
                if(q.left==null)
                {
                    q.left = n1;
                    status=false;
                }else{
                    q = q.left;
                }
            }else{
                if(q.right==null)
                {
                    q.right = n1;
                    status = false;
                }else{
                    q = q.right;
                }
            }

            if(status)
            {
                System.out.println("Enter on which side of "+q.data+" you want to add your node : "+n1.data);
                System.out.println("press 1)Left \n2)Right");
                int inp = sc.nextInt();
                if(inp == 1)
                {
                    l = 'l';
                }else if(inp==2)
                {
                    l='r';
                }else{
                    System.out.println("invalide input!");
                }
            }
        }
    }
}
