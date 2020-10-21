package dankook.sw.donghyeon;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFile {

    public static void readFile(String pathname) {
        try {
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] dataArr = data.split(",");
                for (int i = 0; i < dataArr.length; i++) {
                    System.out.printf("%-7s", dataArr[i]);
                }
                System.out.print("\n");
                float[] avg = new float[Integer.parseInt(dataArr[0])];
                int cnt = 0;

                while (scanner.hasNextLine()) {
                    data = scanner.nextLine();
                    dataArr = data.split(",");
                    for (int i = 0; i < dataArr.length; i++) {
                        System.out.printf("%-7s", dataArr[i]);
                        if (i != 0) {
                            avg[i - 1] += Integer.parseInt(dataArr[i]);
                        }
                    }
                    System.out.print("\n");
                    cnt++;
                }

                System.out.printf("%-7s", "평균");
                for (int i = 0; i < avg.length; i++) {
                    avg[i] = (float) (Math.round((avg[i] / cnt) * 100) / 100.0);
                    System.out.printf("%-7s", avg[i]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("src/data.txt");
    }
}
