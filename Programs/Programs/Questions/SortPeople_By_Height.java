package Programs.Questions;

import java.util.*;

public class SortPeople_By_Height {
    public static void main(String[] args) {
        String[] people = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i< people.length;i++)
        {
            map.put(heights[i],people[i]);
        }

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for(int i=(people.length-1);i>=0;i--)
        {
            people[(people.length-i-1)] = map.get(keys.get(i));
        }

        System.out.println(Arrays.toString(people));


    }
}
