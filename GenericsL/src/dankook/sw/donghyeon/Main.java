package dankook.sw.donghyeon;

public class Main {
    public static void main(String[] args) {
        StockMarketMgt stMgt = new StockMarketMgt();
        boolean isOk1 = stMgt.getDataFromFile("./src/data.txt");

        StockMarketMgt2 stMgt2 = new StockMarketMgt2();
        boolean isOK2 = stMgt2.getDataFromFile("./src/data.txt");

        long start = System.nanoTime();
        System.out.println(stMgt.search("사조대림"));
        long finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));

        start = System.nanoTime();
        System.out.println(stMgt2.search("사조대림"));
        finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));

        start = System.nanoTime();
        System.out.println(stMgt2.search2("사조대림"));
        finish = System.nanoTime();
        System.out.println("execution time for Search method is " + (finish - start));
    }
}
