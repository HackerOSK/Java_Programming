package Programs.Questions;

import java.util.*;

public class Sort_Array_by_Increasin_Frequency {
    public static void main(String[] args) {
        int nums[] = {-1,1,-6,4,5,-6,1,4,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        fillTheMap(map,nums);
        map = sortArr(map,nums);
        System.out.println(map);
        int k=0;
        for(int i : map.keySet())
        {
            for(int j=0;j<map.get(i);j++)
            {
                nums[k]=i;
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }


    private static HashMap<Integer,Integer> sortArr(HashMap<Integer, Integer> map, int[] nums) {
        List<Map .Entry<Integer,Integer>> mapList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(mapList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int stat = o1.getValue().compareTo(o2.getValue());
                if(stat==0)
                {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return stat;
            }
        });
        HashMap<Integer,Integer> temp = new LinkedHashMap<Integer,Integer>();
        for(Map.Entry<Integer,Integer> entry : mapList)
        {
            temp.put(entry.getKey(),entry.getValue());
        }
        return temp;


    }

    private static void fillTheMap(HashMap<Integer, Integer> map, int[] nums) {
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
    }

}
