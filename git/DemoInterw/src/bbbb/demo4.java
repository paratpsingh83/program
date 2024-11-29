package bbbb;

import java.util.*;

public class demo4 {
        public static void main (String args[]){
            String[] inpute={"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> groupByAnagram=groupAnagram(inpute);
            for(List<String> group:groupByAnagram ){
                System.out.println(group);
            }
        }
        public static List<List<String>> groupAnagram(String [] strs){
        Map<String,List<String>> anagramMap=new HashMap();
         for(String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey= new String(charArray);
            anagramMap.putIfAbsent(sortedKey,new ArrayList<>());
            anagramMap.get(sortedKey).add(str);

        }
        return new ArrayList<>(anagramMap.values());
    }
}

