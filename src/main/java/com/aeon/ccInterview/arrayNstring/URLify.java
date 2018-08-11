package com.aeon.ccInterview.arrayNstring;

/**
 * Created by roshane on 7/22/18.
 */
public class URLify {

    public static void main(String[] args) {
        String key = "Mr John Smith    ";
        int len = 13;
        System.out.println(urilify(key, len));
    }

    static String urilify(String input, int length) {

        char[] letters = new char[input.length()];
        String key = "%20";

        for (int i = length - 1, c = input.length() - 1; i >= 0 && c >= 0; i--) {
            if (input.charAt(i) == ' ') {
                int keyLen = key.length() - 1;
                while (keyLen >= 0) {
                    letters[c--] = key.charAt(keyLen);
                    keyLen--;
                }
            } else {
                letters[c] = input.charAt(i);
                c--;
            }
//            System.out.println(String.format("i %d c %d",i,c));
//            System.out.println(new String(letters));
        }
        return new String(letters);
    }
}
