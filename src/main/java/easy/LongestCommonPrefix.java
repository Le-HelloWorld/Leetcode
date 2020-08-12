package easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String target = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (;j < target.length() && j < strs[i].length(); j++) {
                if (target.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            target = target.substring(0, j);
        }
        return target;
    }
}
