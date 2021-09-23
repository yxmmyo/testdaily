import java.util.HashMap;
import java.util.Map;

public class Solution2_0923 {
    //JZ54 字符流中第一个不重复的字符
    String str = "";
    Map<Character,Integer> map = new HashMap<>();
    public void Insert(char ch)
    {
        str += ch;
        int count = map.getOrDefault(ch,0);
        map.put(ch,count+1);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char c:str.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return '#';
    }
}
