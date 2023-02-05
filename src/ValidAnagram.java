/*
* https://leetcode.com/problems/valid-anagram/
* input: s = "anagram", t = "nagaram"
* output: true
* explanation: "anagram" and "nagaram" are consisted of same set of characters
* */

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] alphabets = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabets[c - 'a'] += 1;
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            alphabets[c - 'a'] -= 1;
        }
        for (int k : alphabets) {
            if (k > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "rat";
        String t1 = "car";
        boolean res = isAnagram(s, t);
        boolean res1 = isAnagram(s1, t1);
        System.out.println(res);
        System.out.println(res1);
    }
}
