package sw.donghyeon.dankook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal_GUI extends JFrame {
    final int txtWidth = 70, lblWidth = 20, height = 20;
    final int btnWidth = 60, btnExtWidth = 90;

    JTextField txtNum1, txtNum2, txtResult;
    JLabel lblOp, lblEqual;
    JButton btnAdd, btnSub, btnMul, btnDiv, btnComp, btnReset;

    Container c;

    private void txt_lbl_Layout() {
        txtNum1 = new JTextField("",15);
        txtNum1.setLocation(10, 10);
        txtNum1.setSize(txtWidth, height);
        txtNum1.setHorizontalAlignment(JTextField.RIGHT);

        lblOp = new JLabel("?");
        lblOp.setLocation(85,10);
        lblOp.setSize(lblWidth, height);

        txtNum2 = new JTextField("",15);
        txtNum2.setLocation(100, 10);
        txtNum2.setSize(txtWidth, height);
        txtNum2.setHorizontalAlignment(JTextField.RIGHT);

        lblEqual = new JLabel("=");
        lblEqual.setLocation(180, 10);
        lblEqual.setSize(lblWidth, height);

        txtResult = new JTextField("0", 10);
        txtResult.setLocation(200, 10);
        txtResult.setSize(txtWidth, height);
        txtResult.setHorizontalAlignment(JTextField.RIGHT);
    }

    private void btn_Layout() {
        OperatorListener listener = new OperatorListener();

        btnAdd = new JButton("+");
        btnAdd.setLocation(10, 40);
        btnAdd.setSize(btnWidth, height);
        btnAdd.addActionListener(listener);

        btnSub = new JButton("-");
        btnSub.setLocation(80, 40);
        btnSub.setSize(btnWidth,height);
        btnSub.addActionListener(listener);

        btnMul = new JButton("*");
        btnMul.setLocation(150, 40);
        btnMul.setSize(btnWidth,height);
        btnMul.addActionListener(listener);

        btnDiv = new JButton("/");
        btnDiv.setLocation(220, 40);
        btnDiv.setSize(btnWidth,height);
        btnDiv.addActionListener(listener);

        btnReset = new JButton("Reset");
        btnReset.setLocation(50, 70);
        btnReset.setSize(btnExtWidth,height);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        btnComp = new JButton("Compute");
        btnComp.setLocation(150, 70);
        btnComp.setSize(btnExtWidth,height);
        btnComp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }

    private void reset() {
        lblOp.setText("?");
        txtNum1.setText("");
        txtNum2.setText("");
        txtResult.setText("0");
    }

    private void compute() {
        String operator = lblOp.getText();
        int num1, num2;

        switch (operator) {
            case "+":
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                txtResult.setText(num1 + num2 + "");
                break;
            case "-":
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                txtResult.setText(num1 - num2 + "");
                break;
            case "*":
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                txtResult.setText(num1 * num2 + "");
                break;
            case "/":
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                txtResult.setText(num1 / num2 + "");
                break;
        }
    }

    private void GUI_Setup() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt_lbl_Layout();
        btn_Layout();

        c = getContentPane();
        c.setLayout(null);

        c.add(txtNum1);
        c.add(lblOp);
        c.add(txtNum2);
        c.add(lblEqual);
        c.add(txtResult);

        c.add(btnAdd);
        c.add(btnSub);
        c.add(btnMul);
        c.add(btnDiv);

        c.add(btnReset);
        c.add(btnComp);

        setSize(300, 150);
        setVisible(true);
    }

    public Cal_GUI() {
        GUI_Setup();
    }

    public static void main(String[] args) {
        new Cal_GUI();
    }

    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String operator = e.getActionCommand();
            lblOp.setText(operator);
        }
    }
}
