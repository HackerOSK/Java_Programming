package Programs.Questions;


import java.util.ArrayList;
import java.util.Arrays;

class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
        next = null;
    }
}
public class Find_the_Minimum_and_Maximum_Number_of_Nodes_Between_Critical_Points {
    public static void main(String[] args) {
//        [5,3,1,2,5,1,2]
//        lets first find the critical point in linked list
        Node head = new Node(1);
        Add(1,head);


        display(head);
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(giveCriticalPoint(head)));
    }

    private static int[] giveCriticalPoint(Node head) {
        Node prev = head;
        Node current = head.next;
        int pos = 2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();

        while(current.next!=null)
        {

            if(current.val > prev.val && current.val > current.next.val)
            {
//                System.out.println(current.val);
//                System.out.println(pos);
                arr.add(pos);


            } else if (current.val < prev.val && current.val < current.next.val) {
//                System.out.println(current.val);
//                System.out.println(pos);
                arr.add(pos);

            }
            prev = prev.next;
            current = current.next;
            pos++;
        }

        System.out.println(arr);
        if(arr.size()>1) {
            max = arr.get(arr.size() - 1) - arr.get(0);
            int i = 0;
            int j = 1;
            while (j < arr.size()) {
                int d = arr.get(j) - arr.get(i);
                if (d < min) {
                    min = d;
                }
                j++;
                i++;
            }
        }else {
            min = -1;
            max = -1;
        }

        int ans[] = new int[2];
        ans[0] = min;
        ans[1] = max;
        return ans;

//        System.out.println(min);
//        System.out.println(max);
    }

    private static void display(Node head) {
        Node q = head;
        while(q!=null)
        {
            System.out.println(q.val);
            q = q.next;
        }
    }

    private static void Add(int i,Node head) {
        Node q = head;
        Node temp = new Node(i);
        while(q.next!=null)
        {
            q = q.next;
        }
        q.next = temp;
    }
}
