public class Calculator {
    double num1;
    double num2;
    char op;

    public void setExpr(String n1, char oper, String n2) {
        num1 = Double.parseDouble(n1);
        op = oper;
        num2 = Double.parseDouble(n2);
    }

    public double compute() {
        switch(op) {
            case '+' : return num1 + num2;
            case '-' : return num1 - num2;
            case '*' : return num1 * num2;
            case '/' : return num1 / num2;
            default : return Double.NaN;
        }
    }
}
