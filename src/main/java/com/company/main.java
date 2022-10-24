package com.company;

public class main {
    public static void main(String[] args) {
//        String numbers = "1234567890";
//        StringBuilder sb = new StringBuilder(numbers);
//        sb = StringProcessor.deleteSymbolStr(sb);
//        System.out.println(sb);
//        s = "Васе 0x00000013 лет";
//        s = StringProcessor.sixteenTranslateStr(s);
//        System.out.println(s);

        Payment a = new Payment("Ivanov Ivan Alekseevich", 28, 12, 2002, 1000000);
        Payment b = new Payment("Ivanesenko Ivan Alekseevich", 28, 12, 2002, 1000000);
        System.out.println(a.toString());
    }
}
