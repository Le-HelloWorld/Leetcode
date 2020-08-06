package easy;

import java.util.HashMap;
// 字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> matrix = new HashMap<>();
        matrix.put('I', 1);
        matrix.put('V', 5);
        matrix.put('X', 10);
        matrix.put('L', 50);
        matrix.put('C', 100);
        matrix.put('D', 500);
        matrix.put('M', 1000);
        int rs = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (i + 1 < cs.length) {
                if (cs[i] =='I' && (cs[i + 1] == 'V' || cs[i + 1] == 'X')) {
                    rs = rs + matrix.get(cs[i + 1]) - matrix.get(cs[i]);
                    i = i + 1;
                    continue;
                }

                if (cs[i] =='X' && (cs[i + 1] == 'L' || cs[i + 1] == 'C')) {
                    rs = rs + matrix.get(cs[i + 1]) - matrix.get(cs[i]);
                    i = i + 1;
                    continue;
                }

                if (cs[i] =='C' && (cs[i + 1] == 'D' || cs[i + 1] == 'M')) {
                    rs = rs + matrix.get(cs[i + 1]) - matrix.get(cs[i]);
                    i = i + 1;
                    continue;
                }
            }
            rs = rs + matrix.get(cs[i]);
        }
        return rs;
    }
}
