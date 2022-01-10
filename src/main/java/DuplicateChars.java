import java.util.HashMap;

public class DuplicateChars {
    public static void printDuplicateChars(){
        String  test = "malayalamxz";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : test.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);

        }

       for(Character ch: map.keySet()){
           if(map.get(ch) == 1){
               System.out.println(ch + "  " + map.get(ch));
           }
       }
    }

    public static void main(String[] args) {
        printDuplicateChars();
    }
}
