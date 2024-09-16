package Programs.Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Minimum_Number_of_Pushes_to_Type_Word2 {
    public static void main(String[] args) {
        String str = "abcde";
        HashMap<Character,Integer>map = new HashMap<>();
        for(char i : str.toCharArray())
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

//        Sorting map by value
        LinkedHashMap<Character,Integer> sortedmap = map.entrySet().stream().sorted((e1,e2)->{
            return e2.getValue().compareTo(e1.getValue());
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap :: new ));

        System.out.println(sortedmap);
        int j=1;
        int count=0;
        int ans=0;

        for(char i : sortedmap.keySet())
        {
            count++;
            if(count>j*8)
            {
                j++;
            }ans+=sortedmap.get(i)*j;

        }

        System.out.println(ans);


    }
}
