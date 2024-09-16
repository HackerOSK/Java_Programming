package Programs.LinkListQues;

class Listnode
{
    int val;
    Listnode next;
    Listnode(int val)
    {
        this.val = val;
        this.next = null;
    }
    Listnode()
    {

    }
}
public class Add_2_Numbers {
    public static void main(String[] args) {
        Listnode l1 = new Listnode(9);
        Listnode l2 = new Listnode(9);
        Listnode l3 = new Listnode(9);
        Listnode l4 = new Listnode(9);
        Listnode l5 = new Listnode(9);
        Listnode l6 = new Listnode(9);
        Listnode l7 = new Listnode(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        Listnode n1 = new Listnode(9);
        Listnode n2 = new Listnode(9);
        Listnode n3 = new Listnode(9);
        Listnode n4 = new Listnode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Listnode ans = new Listnode(-1);
        Listnode q1 = l1;
        Listnode q2 = n1;

        int c = 0;

        while(q1!=null || q2!=null || c!=0)
        {
            int sum=0;
            if(q1==null && q2==null && c!=0)
            {
                sum = c;
                if(sum>=10)
                {
                    c = sum/10;
                    sum = sum%10;
                }
                else
                {
                    c=0;
                }
            }
            else if(q1==null)
            {
                sum = q2.val+c;
                if(sum>=10)
                {
                    c = sum/10;
                    sum = sum%10;
                }
                else
                {
                    c=0;
                }
                q2=q2.next;
            }
            else if(q2==null)
            {
                sum = q1.val+c;
                if(sum>=10)
                {
                    c = sum/10;
                    sum = sum%10;
                }
                else
                {
                    c=0;
                }
                q1 = q1.next;
            }
            else
            {
                sum = q1.val+q2.val+c;
                if(sum>=10)
                {
                    c = sum/10;
                    sum = sum%10;
                }
                else
                {
                    c=0;
                }
                q1 = q1.next;
                q2 = q2.next;
            }

            if(ans.val == -1)
            {
                ans.val=sum;
                ans.next = null;
            }
            else
            {
                Listnode m = ans;
                while (m.next!=null)
                {
                    m = m.next;
                }
                Listnode temp = new Listnode(sum);
                m.next = temp;
            }

        }

        Listnode a = l1;
        Listnode b = n1;
        Listnode uttar = ans;

        System.out.print("\nNumber a ");
        while(a!=null)
        {
            System.out.print(a.val);
            a=a.next;
        }
        System.out.print("\nNumber b ");
        while(b!=null)
        {
            System.out.print(b.val);
            b=b.next;
        }

        System.out.print("\nSum : ");
        while(uttar!=null)
        {
            System.out.print(uttar.val);
            uttar=uttar.next;
        }



    }
}
