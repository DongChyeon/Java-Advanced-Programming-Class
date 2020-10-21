package dankook.sw.donghyeon;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StockMarketMgt {
    private HashMap<String, Integer> companies;
    private int count;

    public StockMarketMgt() {
        count = 0;
        companies = new HashMap<>();
    }

    public boolean getDataFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                companies.put(line[0], Integer.parseInt(line[1]));
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Integer search(String key) {
        return companies.get(key);
    }
}
