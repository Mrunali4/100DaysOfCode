import java.util.*;
public class Hashing {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    // public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
    // }
    public static String sortString(String str){
        char[] charArray= str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
    public static void main(String[] args) {
        String[] inputString=new String[]{"cat","god","tac","dog"};
        HashMap<String,Integer> phash= new HashMap<>();
        ArrayList<ArrayList<Integer>>result = new ArrayList<>();
        int k=0;

        while(k<inputString.length){
            String str= sortString(inputString[k]);
            ArrayList<Integer> list = new ArrayList<>();
            if(phash.containsKey(str)){
                list.add(phash.get(str));
                list.add(k);
                result.add(list);
            }
            phash.put(str,k);
            k++;
           
        }
        
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
}
}

