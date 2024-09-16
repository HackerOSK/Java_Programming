package Programs.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int value)
    {
        this.val = value;
        this.next = null;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveZeroSumConsecutiveNodesfromLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ListNode head = null;

        boolean loop = true;
        int count=0;

        while (loop)
        {

            System.out.println("\n1)Create_List\n2)Insert_Element\n3)Display_List\n4)ConvertToArray\n6)Exit\n");
            System.out.println("Enter Your Choice : ");
            int input =  in.nextInt();
            switch (input)
            {
                case 1:
                    if(head==null)
                    {
                        System.out.println("Enter the value in Node : ");
                        int num = in.nextInt();
                        ListNode temp = new ListNode(num);
                        head = temp;
                        count++;
                    }
                    else
                    {
                        System.out.println("List Already Created!Please Insert New Node!");
                    }
                    break;
                case 2:
                    if(head==null)
                    {
                        System.out.println("List is Not Created !");
                    }
                    else
                    {
                        ListNode q = head;
                        System.out.println("Enter the value in Node : ");
                        int num = in.nextInt();
                        ListNode temp = new ListNode(num);
                        while(q.next!=null)
                        {
                            q=q.next;
                        }
                        q.next=temp;
                        count++;
                    }
                    break;
                case 3:
                    if(head==null)
                    {
                        System.out.println("List is Not Created !");
                    }
                    else
                    {
                        ListNode q = head;
                        while (q!=null)
                        {
                            System.out.print(q.val+" ");
                            q=q.next;
                        }
                    }
                    break;
                case 4:
                    int[] arr = new int[count];
                    if(head==null)
                    {
                        System.out.println("List is Not Created !");
                    }
                    else {
                        int i = 0;
                        ListNode q = head;
                        while (q != null) {
                            arr[i] = q.val;
                            i++;
                            q = q.next;
                        }
                        System.out.println("Converted Into Array!");
                        System.out.println("Array : " + Arrays.toString(arr));

                        int[] freq = new int[1000];
                        for(int j=0;j<arr.length;j++)
                        {
                            if(arr[j]<0)
                            {

                            }

                        }
                    }
                    break;


                case 5:
                    System.out.println("Thank You!Visit Again!");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalide Input!Enter Again!");

            }
        }

    }
}
