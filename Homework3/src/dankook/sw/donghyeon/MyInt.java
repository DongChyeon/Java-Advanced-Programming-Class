package dankook.sw.donghyeon;

public class MyInt {
    private int num;
    private int radix;

    public MyInt() {
        // 기본 생성자
    }

    public MyInt(String val) {
        if (isBinaryString(val)) {
            String binaryString = val.substring(2);
            num = Integer.parseInt(binaryString, 2);
            radix = 2;
        } else if (isOctalString(val)) {
            String OctalString = val.substring(1);
            num = Integer.parseInt(OctalString, 8);
            radix = 8;
        } else if (isHexString(val)) {
            String HexString = val.substring(2);
            num = Integer.parseInt(HexString, 16);
            radix = 16;
        } else {
            num = Integer.parseInt(val, 10);
            radix = 10;
        }
    }

    public MyInt add(MyInt myInt) {
        MyInt temp = new MyInt();
        temp.radix = radix;
        temp.num = num + myInt.num;
        return temp;
    }

    public MyInt subtract(MyInt myInt) {
        MyInt temp = new MyInt();
        temp.radix = radix;
        temp.num = num - myInt.num;
        return temp;
    }

    public String toString() {
        String s;
        switch (radix) {
            case 2:
                s = "0b" + Integer.toBinaryString(num);
                break;
            case 8:
                s = "0" + Integer.toOctalString(num);
                break;
            case 10:
                s = Integer.toString(num);
                break;
            case 16:
                s = "0x"+ Integer.toHexString(num).toUpperCase();
                break;
            default:
                s = "진법 오류 발생";
                break;
        }
        return s;
    }

    public String toString(int radix) {
        String s;
        switch (radix) {
            case 2:
                s = "0b" + Integer.toBinaryString(num);
                break;
            case 8:
                s = "0" + Integer.toOctalString(num);
                break;
            case 10:
                s = Integer.toString(num);
                break;
            case 16:
                s = "0x"+ Integer.toHexString(num).toUpperCase();
                break;
            default:
                s = "진법 오류 발생";
                break;
        }
        return s;
    }

    public boolean isBinaryString(String val) {
        if (val.length() < 3) return false;
        return val.charAt(0) == '0' && val.charAt(1) == 'b';
    }

    public boolean isOctalString(String val) {
        if (val.length() < 2) return false;
        return val.charAt(0) == '0' && val.charAt(1) != 'b' && val.charAt(1) != 'x';
    }

    public boolean isHexString(String val) {
        if (val.length() < 3) return false;
        return val.charAt(0) == '0' && val.charAt(1) == 'x';
    }
}
