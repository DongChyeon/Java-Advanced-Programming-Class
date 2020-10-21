package dankook.sw.donghyeon;

public class Main {
    public static void main(String[] args) {
        /*
        Exception : Checked -> 컴파일러가 Exception 처리 확인
                    Unchecked -> 프로그램에서 Exception 처리
        Throwing Exception :
                    프로그램에서 대처하지 않으면 JVM에서 발생시킴
                    프로그램에서 throw Exception 가능
        Catching Exception : Exception 발생 시 프로그램에서 catch 대체
        Propagating Exception : Exception 발생 시 해당 메소드에서 핸들하지 않으면 caller로 파급됨
        Exception 도 클래스임. 객체 생성 가능. 상속 가능
         */
//        String s = "abc";
//        System.out.println(s.charAt(3));

        try {
            System.out.println(Division.divide(2, 0));
        } catch (BadNumberException e) {
            System.out.println(e.getMessage());
        }

        Division.callDivide();

        try {
            Division.callDivide2();
        } catch (BadNumberException e) {
            e.printStackTrace();
        }   // Checked Excpetion은 try-catch 필수

        FileIOTest fIO = new FileIOTest();
        fIO.openFile();
    }
}
