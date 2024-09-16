package Programs.Questions;

import java.util.ArrayList;
import java.util.HashMap;

class treeNode
{
    int data;
    treeNode left;
    treeNode right;

    treeNode(int data)
    {
        this.data = data;
        this.left =null;
        this.right=null;

    }
}

public class Create_Binary_Tree_From_Descriptions {
    public static void main(String[] args) {
        int description[][] = {{39,70,1},{13,39,1},{85,74,1},{74,13,1},{38,82,1},{82,85,1}};

        treeNode root = null;
        HashMap<Integer,treeNode> map= new HashMap<>();
        ArrayList<Integer> chiArr = new ArrayList<>();
        HashMap<Integer,Integer> parent_child = new HashMap<>();

        for(int arr[] : description)
        {
            int parent = arr[0];
            int child = arr[1];
            int dir = arr[2];
            chiArr.add(child);
            treeNode parentNode;
            treeNode childNode;
            if(map.containsKey(parent)) {
                 parentNode = map.get(parent);
            }else {
                parentNode = new treeNode(parent);
            }
            if(root==null)
            {
                root = parentNode;
            }
            if(map.containsKey(child)) {
                childNode = map.get(child);

            }else{
                childNode  = new treeNode(child);
            }

//            childNode and ParentNode are ready lets connet them
            if(dir == 1)
            {
                parentNode.left = childNode;
            }else
            {
                parentNode.right = childNode;
            }

            map.put(parent,parentNode);
            map.put(child,childNode);
            parent_child.put(child,parent);
            if(childNode==root)
            {
                while(chiArr.contains(root.data))
                {
                    root = map.get(parent_child.get(root.data));
                }
            }
        }

        display(root);
        System.out.println(root.data);


    }

    private static void display(treeNode root) {
        if(root==null)
        {
            return;
        }


        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }
}
