package Programs.Questions;

import java.util.List;

class ListNode{
    int data;
    ListNode next;
    ListNode(int val)
    {
        this.data = val;
        next = null;
    }
}
public class Merge_Nodes_in_Between_Zeros {
    public static void main(String[] args) {
        ListNode L1head = new ListNode(0);
//        [0,1,0,3,0,2,2,0]
//        System.out.println(L1head.data);
        Add(L1head,0);
        Add(L1head,1);
        Add(L1head,0);
        Add(L1head,3);
        Add(L1head,0);
        Add(L1head,2);
        Add(L1head,2);
        Add(L1head,0);

        display(L1head);

        System.out.println("--------------------");

        ListNode ansHead = MergeNode(L1head);
        display(ansHead);

//
    }

    private static ListNode MergeNode(ListNode l1head) {
        ListNode ansNode = null;
        int sum = 0;
        ListNode q = l1head;
        while(q!=null)
        {
            if(q.data!=0)
            {
                sum+=q.data;
            }else{
                if(sum>0)
                {
                    if(l1head.data==0)
                    {
                        ListNode newNode = new ListNode(sum);
                        l1head = newNode;
                    }else{
                        Add(l1head,sum);
                    }
                }
                sum=0;
            }
            q = q.next;
        }

        return l1head;
    }

    static void display(ListNode L1head) {
        if(L1head==null)
        {
            System.out.println("List is empty");
        }else{
            ListNode q  = L1head;
            while(q!=null)
            {
                System.out.println(q.data);
                q = q.next;
            }
        }
    }

    static void Add(ListNode L1head, int i) {

        if(L1head==null)
        {
            ListNode newNode = new ListNode(i);
//            System.out.println(newNode.data);
            L1head = newNode;
        }else{
            ListNode newNode = new ListNode(i);
            ListNode q = L1head;
            while(q.next!=null)
            {
                q = q.next;
            }
            q.next = newNode;
        }
    }
}
