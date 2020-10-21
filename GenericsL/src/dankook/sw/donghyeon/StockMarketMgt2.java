package dankook.sw.donghyeon;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StockMarketMgt2 {
    private int count;
    private ArrayList<String> companyNames;
    private ArrayList<Integer> companyCodes;

    public StockMarketMgt2() {
        count = 0;
        companyNames = new ArrayList<>();
        companyCodes = new ArrayList<>();
    }

    public boolean getDataFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName);
             Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(",");
                companyNames.add(line[0]);
                companyCodes.add(Integer.parseInt(line[1]));
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public int search(String cName) {
        for (int i = 0; i < count; i++) {
            if (cName.equals(companyNames.get(i)))
                return companyCodes.get(i);
        }
        return -1;
    }

    public int search2(String cName) {
        int temp = companyNames.indexOf(cName);
        if (temp == -1) return -1;
        return companyCodes.get(temp);
    }
}
