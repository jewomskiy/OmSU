package com.company;

public class StringProcessor {
    public static String multiStr(String s, int n) {
        String res = new String();
        res = "";
        if (s == null || n < 0)
            throw new IllegalArgumentException("Wrong values, string equal null or number of iterations less than zero");
        for (int i = 0; i < n; i++) {
            res += s;
        }
        return res;
    }

    public static int numberOfEnterStrToStr(String first, String sec) {
        if (sec == null || sec == "") throw new IllegalArgumentException("Second string is null or empty");
        int res = 0;
        res = first.split(sec, -1).length - 1;
        return res;
    }

    public static String replaceNumbersStr(String temp) {
        temp = temp.replaceAll("1", "One");
        temp = temp.replaceAll("2", "Two");
        temp = temp.replaceAll("3", "Three");
        return temp;
    }

    public static StringBuilder deleteSymbolStr(StringBuilder temp) {
        int f = 1;
        for (int i = 0; i < temp.length(); i++) {
            if ((i + f) % 2 != 0) {
                temp = temp.replace(i + 1, i + 2, "");
                f = 0;
            }
            if (i % 2 != 0) f = 1;
        }
        return temp;
    }

    public static String sixteenTranslateStr(String temp){
        int numb = 0;
        String[] sixtNumb = new String[temp.length()];
        sixtNumb = temp.split(" ");
        int indexTemp = temp.indexOf("0x");
        for (int i = 0; i < sixtNumb.length; i++){
            if (sixtNumb[i].indexOf("0x") != -1){
                numb = Integer.parseInt(sixtNumb[i].replace("0x", ""), 16);
            }
        }
        StringBuilder test = new StringBuilder(temp);
        test = test.replace(indexTemp, indexTemp + 10, Integer.toString(numb));
        temp = test.toString();
        return temp;
    }

}
