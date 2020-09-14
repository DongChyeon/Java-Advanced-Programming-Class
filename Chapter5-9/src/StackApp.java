import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int n = scanner.nextInt();

        StringStack stringStack = new StringStack(n);

        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = scanner.next();
            if(str.equals("그만"))
                break;
            if(!stringStack.push(str)) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int stackSize = stringStack.length();
        for(int i = 0; i < stackSize; i++) {
            System.out.print(stringStack.pop() + "  ");
        }
        scanner.close();
    }
}
