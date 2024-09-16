package Programs.Questions;

import java.util.Arrays;

public class Sort_The_People
{
    public static void main(String[] args) {
        String people[] = {"Alice","Bob","Bob"};
        int heights[] = {155,185,150};
        mergeSort(heights,people,0,heights.length-1);
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(people));

    }

    private static void mergeSort(int[] heights, String[] people, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(heights,people,low,mid);
        mergeSort(heights,people,mid+1,high);
        merge(heights,people,low,mid,high);
    }

    private static void merge(int[] heights, String[] people, int low, int mid, int high) {
        int ans[] = new int[high-low+1];
        String name[] = new String[high-low+1];
        int ptr1 = low;
        int ptr2 = mid+1;
        int i = 0;

        while(ptr1<=mid && ptr2<=high)
        {
            if(heights[ptr1]<heights[ptr2])
            {
                ans[i] = heights[ptr2];
                name[i] = people[ptr2];
                ptr2++;
            }else {
                ans[i] = heights[ptr1];
                name[i] = people[ptr1];
                ptr1++;
            }
            i++;
        }

        while(ptr1<=mid)
        {
            ans[i] = heights[ptr1];
            name[i] = people[ptr1];
            ptr1++;
            i++;
        }

        while(ptr2<=high)
        {
            ans[i] = heights[ptr2];
            name[i] = people[ptr2];
            ptr2++;
            i++;
        }
       for(int k = low;k<=high;k++)
       {
           heights[k] = ans[k-low];
       }
        for(int k = low;k<=high;k++)
        {
            people[k] = name[k-low];
        }
    }
}
