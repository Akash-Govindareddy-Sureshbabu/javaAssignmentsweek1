import java.util.*;

public class StringFormat {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put( ch,count+1);
            }
            else{
                map.put( ch,1);
            }
        }

        for (char s : map.keySet()) {
            System.out.print(s + "" + map.get(s));
        }

    }
}
