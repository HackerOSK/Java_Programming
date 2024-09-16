package ImportantQues;

//You are required to input the size of the matrix then the elements of matrix,
// then you have to divide the main matrix in two sub matrices (even and odd)
// in such a way that element at 0 index will be considered as even and
// element at 1st index will be considered as odd and so on.
// then you have sort the even and odd matrices in ascending order then print the
// sum of second largest number from both the matrices

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ElementsOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array  : ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        ArrayList<Integer>odd = new ArrayList<>();
        ArrayList<Integer>even = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the element at index : "+i);
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++)
        {
            if(i%2==0)
            {
                even.add(list.get(i));
            }else{
                odd.add(list.get(i));
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even);
        System.out.println(odd);
        System.out.println((even.get(even.size() - 2)) + (odd.get(odd.size() - 2)));


    }
}
