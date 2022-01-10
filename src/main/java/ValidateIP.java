import java.util.HashMap;

public class ValidateIP {
    public String validIPAddress(String queryIp) {
        if(countLetters(queryIp, '.') == 3){
            if(queryIp.endsWith(".")){
                return "Neither";
            }
            for(String token : queryIp.split("\\.")){
                for(char c : token.toCharArray()){
                    if(!Character.isDigit(c)) return "Neither";
                }

                if(token.startsWith("0") && token.length() > 1){
                    return "Neither";
                }

                if(token.length() > 3 || token.length() == 0 ){
                    return "Neither";
                }

                if(Integer.parseInt(token) > 255 || Integer.parseInt(token) < 0) {
                    return "Neither";
                }
            }
            return "IPV4";
        } else if(countLetters(queryIp, ':') == 7){
            String hex = "0123456789abcdefABCDEF";
            if(queryIp.split(":").length != 8) return "Neither";
            if(queryIp.endsWith(":")) return "Neither";
            for(String token : queryIp.split(":")){
                if(token.length() > 4 || token.length() == 0) return "Neither";
                for(char ch: token.toCharArray()){
                    if(hex.indexOf(ch) == -1){
                        return "Neither";
                    }
                }
            }
            return "IPV6";
        }

        return "Neither";

    }

    public int countLetters(String s, Character c){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
        }
        System.out.println(map.get(c));
        return map.get(c);
    }

    public static void main(String[] args) {
        ValidateIP validateIP = new ValidateIP();
        System.out.println(validateIP.validIPAddress("256.256.256.256"));
    }
}