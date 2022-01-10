import java.util.HashMap;

public class CharacterCount {
    public static void getCharacterCount(String s){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c: s.toCharArray()){
            if(charCount.containsKey(c))
                charCount.put(c, charCount.get(c)+1);
            else{
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount.toString());
    }

    public static void main(String[] args) {
        getCharacterCount("apple");
    }
}
