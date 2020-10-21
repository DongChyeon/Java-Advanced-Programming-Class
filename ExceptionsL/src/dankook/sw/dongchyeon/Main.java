package dankook.sw.dongchyeon;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        ExceptionExample ex = new ExceptionExample();
//        ex.test1();

        // try-with-resource statement
//        try (FileReader reader = new FileReader("file.txt")){
//            int value = reader.read();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("프로그램 정상 종료");
        Account ac = new Account();
        try {
            ac.deposit(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}   // call stack