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
        return hashmapMethod(s);
    }

    /**
     * Hashmap 解决对应关系
     * @param s
     * @return
     */
    private int hashmapMethod(String s) {
        HashMap<Character, Integer> matrix = new HashMap<>();
        matrix.put('I', 1);
        matrix.put('V', 5);
        matrix.put('X', 10);
        matrix.put('L', 50);
        matrix.put('C', 100);
        matrix.put('D', 500);
        matrix.put('M', 1000);
        int rs = 0;
        int preNum = matrix.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = matrix.get(s.charAt(i));
            if (preNum < num) {
                rs -= preNum;
            } else {
                rs += preNum;
            }
            preNum = num;
        }
        rs += preNum;
        return rs;
    }

    private int switchMethod(String s) {
        int rs = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                rs -= preNum;
            } else {
                rs += preNum;
            }
            preNum = num;
        }
        rs += preNum;
        return rs;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
