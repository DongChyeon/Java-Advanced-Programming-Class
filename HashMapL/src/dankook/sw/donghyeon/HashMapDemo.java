package dankook.sw.donghyeon;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> sMap = new HashMap<>();
        sMap.put("임영웅", "lim@dankook.ac.kr");
        sMap.put("장민호", "chang@gmail.com");
        sMap.put("김희재", "kim@gmail.com");

        System.out.println(sMap.get("김희재"));
    }
}
