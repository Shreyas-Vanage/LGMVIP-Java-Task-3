import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScientificCal {
    private JFrame fre;
    private JTextField TF;
    double f;
    double s;
    double r;
    String opr;

    /*
     * Here fre - Frame
     * TF - TextField
     * f - First
     * s - Second
     * r - result
     * opr - Operation
     */
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ScientificCal window = new ScientificCal();
                    window.fre.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ScientificCal() {
        initialize();
    }

    private void initialize() {
        fre = new JFrame();
        fre.setForeground(Color.WHITE);
        fre.getContentPane().setForeground(Color.BLACK);
        fre.setBounds(100, 100, 357, 539);
        fre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fre.getContentPane().setLayout(null);
        TF = new JTextField();
        TF.setFont(new Font("", Font.BOLD, 15));
        TF.setBounds(10, 39, 320, 63);
        fre.getContentPane().add(TF);
        TF.setColumns(10);
        JLabel lblNewLabel = new JLabel("Scientific Calculator");
        lblNewLabel.setBounds(10, 11, 320, 27);
        lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        fre.getContentPane().add(lblNewLabel);
        JButton bt2 = new JButton("2");
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt2.getText();
                TF.setText(number);
            }
        });
        bt2.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt2.setBounds(139, 398, 64, 50);
        fre.getContentPane().add(bt2);
        JButton bt5 = new JButton("5");
        bt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt5.getText();
                TF.setText(number);
            }
        });
        bt5.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt5.setBounds(139, 347, 64, 50);
        fre.getContentPane().add(bt5);
        JButton bt8 = new JButton("8");
        bt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt8.getText();
                TF.setText(number);
            }
        });
        bt8.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt8.setBounds(139, 295, 64, 50);
        fre.getContentPane().add(bt8);
        JButton btC = new JButton("C");
        btC.setFont(new Font("Helvetica", Font.PLAIN, 19));
        btC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TF.setText(null);
            }
        });
        btC.setBounds(139, 243, 64, 50);
        fre.getContentPane().add(btC);
        JButton btLn = new JButton("sinh");
        btLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sinh(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btLn.setFont(new Font("Helvetica", Font.PLAIN, 13));
        btLn.setBounds(139, 191, 64, 50);
        fre.getContentPane().add(btLn);
        JButton bt0 = new JButton("0");
        bt0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt0.getText();
                TF.setText(number);
            }
        });
        bt0.setFont(new Font("Helvetica", Font.BOLD, 21));
        bt0.setBounds(74, 449, 129, 50);
        fre.getContentPane().add(bt0);
        JButton btSin = new JButton("sin");
        btSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sin(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);

            }
        });
        btSin.setFont(new Font("Helvetica", Font.BOLD, 12));
        btSin.setBounds(139, 139, 64, 50);
        fre.getContentPane().add(btSin);

        JButton btDot = new JButton(".");
        btDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + btDot.getText();
                TF.setText(number);
            }
        });
        btDot.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btDot.setBounds(202, 449, 64, 50);
        fre.getContentPane().add(btDot);
        JButton btEqual = new JButton("=");
        btEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String answer;
                s = Double.parseDouble(TF.getText());
                if (opr == "+") {
                    r = f + s;
                    answer = String.format("%.2f", r);
                    TF.setText(answer);
                } else if (opr == "-") {
                    r = f - s;
                    answer = String.format("%.2f", r);
                    TF.setText(answer);
                } else if (opr == "*") {
                    r = f * s;
                    answer = String.format("%.2f", r);
                    TF.setText(answer);
                } else if (opr == "/") {
                    r = f / s;
                    answer = String.format("%.2f", r);
                    TF.setText(answer);
                } else if (opr == "%") {
                    r = f % s;
                    answer = String.format("%.2f", r);
                    TF.setText(answer);
                } else if (opr == "X^Y") {
                    double rt = 1;
                    for (int i = 0; i < s; i++) {
                        rt = f * rt;
                        answer = String.format("%.2f", rt);
                        TF.setText(answer);
                    }
                }

            }
        });
        btEqual.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btEqual.setBounds(266, 449, 64, 50);
        fre.getContentPane().add(btEqual);

        JButton btXrx = new JButton("X^Y");
        btXrx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f = Double.parseDouble(TF.getText());
                TF.setText("");
                opr = "xrx";
            }
        });
        btXrx.setFont(new Font("Helvetica", Font.BOLD, 12));
        btXrx.setBounds(10, 243, 64, 50);
        fre.getContentPane().add(btXrx);

        JButton btLog = new JButton("log");
        btLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.log(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btLog.setFont(new Font("Helvetica", Font.PLAIN, 12));
        btLog.setBounds(74, 192, 64, 50);
        fre.getContentPane().add(btLog);

        JButton btCe = new JButton("CE");
        btCe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TF.setText(null);
            }
        });
        btCe.setFont(new Font("Helvetica", Font.PLAIN, 19));
        btCe.setBounds(74, 243, 64, 50);
        fre.getContentPane().add(btCe);

        JButton bt7 = new JButton("7");
        bt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt7.getText();
                TF.setText(number);
            }
        });
        bt7.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt7.setBounds(74, 295, 64, 50);
        fre.getContentPane().add(bt7);

        JButton bt4 = new JButton("4");
        bt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt4.getText();
                TF.setText(number);
            }
        });
        bt4.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt4.setBounds(74, 347, 64, 50);
        fre.getContentPane().add(bt4);

        JButton bt1 = new JButton("1");
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt1.getText();
                TF.setText(number);
            }
        });
        bt1.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt1.setBounds(74, 398, 64, 50);
        fre.getContentPane().add(bt1);

        JButton btX = new JButton("x3");
        btX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(TF.getText()));
                a = a * a * a;
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btX.setFont(new Font("Helvetica", Font.BOLD, 12));
        btX.setBounds(10, 295, 64, 50);
        fre.getContentPane().add(btX);

        JButton btEx = new JButton("ex");
        btEx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.exp(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btEx.setFont(new Font("Helvetica", Font.PLAIN, 12));
        btEx.setBounds(74, 139, 64, 50);
        fre.getContentPane().add(btEx);
        JButton btx = new JButton("1/x");
        btx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = 1 / Math.sqrt(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btx.setFont(new Font("Helvetica", Font.BOLD, 12));
        btx.setBounds(9, 191, 64, 50);
        fre.getContentPane().add(btx);

        JButton btSqrt = new JButton("\u221A");
        btSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sqrt(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btSqrt.setFont(new Font("Helvetica", Font.PLAIN, 17));
        btSqrt.setBounds(10, 139, 64, 50);
        fre.getContentPane().add(btSqrt);

        JButton btCos = new JButton("cos");
        btCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cos(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btCos.setFont(new Font("Helvetica", Font.BOLD, 12));
        btCos.setBounds(202, 139, 64, 50);
        fre.getContentPane().add(btCos);
        JButton btCos_1 = new JButton("cosh");
        btCos_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.cosh(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btCos_1.setFont(new Font("Helvetica", Font.PLAIN, 13));
        btCos_1.setBounds(202, 191, 64, 50);
        fre.getContentPane().add(btCos_1);
        JButton btBackSpace = new JButton("B");
        btBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String backSpace = null;
                if (TF.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(TF.getText());
                    str.deleteCharAt(TF.getText().length() - 1);
                    backSpace = str.toString();
                    TF.setText(backSpace);
                }
            }
        });
        btBackSpace.setFont(new Font("Helvetica", Font.PLAIN, 19));
        btBackSpace.setBounds(202, 243, 64, 50);
        fre.getContentPane().add(btBackSpace);
        JButton bt9 = new JButton("9");
        bt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt9.getText();
                TF.setText(number);
            }
        });
        bt9.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt9.setBounds(202, 295, 64, 50);
        fre.getContentPane().add(bt9);
        JButton bt6 = new JButton("6");
        bt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt6.getText();
                TF.setText(number);
            }
        });
        bt6.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt6.setBounds(202, 347, 64, 50);
        fre.getContentPane().add(bt6);
        JButton bt3 = new JButton("3");
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number = TF.getText() + bt3.getText();
                TF.setText(number);
            }
        });
        bt3.setFont(new Font("Helvetica", Font.BOLD, 23));
        bt3.setBounds(202, 398, 64, 50);
        fre.getContentPane().add(bt3);
        JButton btTan = new JButton("tan");
        btTan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tan(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btTan.setFont(new Font("Helvetica", Font.BOLD, 12));
        btTan.setBounds(266, 139, 64, 50);
        fre.getContentPane().add(btTan);
        JButton btTan_1 = new JButton("tanh");
        btTan_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.tanh(Double.parseDouble(TF.getText()));
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btTan_1.setFont(new Font("Helvetica", Font.PLAIN, 13));
        btTan_1.setBounds(266, 191, 64, 50);
        fre.getContentPane().add(btTan_1);
        JButton btPlus = new JButton("+");
        btPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f = Double.parseDouble(TF.getText());
                TF.setText("");
                opr = "+";
            }
        });
        btPlus.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btPlus.setBounds(266, 243, 64, 50);
        fre.getContentPane().add(btPlus);
        JButton btSub = new JButton("-");
        btSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f = Double.parseDouble(TF.getText());
                TF.setText("");
                opr = "-";
            }
        });
        btSub.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btSub.setBounds(266, 295, 64, 50);
        fre.getContentPane().add(btSub);
        JButton btMul = new JButton("*");
        btMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f = Double.parseDouble(TF.getText());
                TF.setText("");
                opr = "*";
            }
        });
        btMul.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btMul.setBounds(266, 347, 64, 50);
        fre.getContentPane().add(btMul);
        JButton btDivide = new JButton("/");
        btDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                f = Double.parseDouble(TF.getText());
                TF.setText("");
                opr = "/";
            }
        });
        btDivide.setFont(new Font("Helvetica", Font.PLAIN, 21));
        btDivide.setBounds(266, 398, 64, 50);
        fre.getContentPane().add(btDivide);
        JButton btP_1 = new JButton("x2");
        btP_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(TF.getText()));
                a = a * a;
                TF.setText("");
                TF.setText(TF.getText() + a);
            }
        });
        btP_1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        btP_1.setBounds(10, 347, 64, 50);
        fre.getContentPane().add(btP_1);
        JButton btN = new JButton("n!");
        btN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = (Double.parseDouble(TF.getText()));
                double f = 1;
                while (a != 0) {
                    f = f * a;
                    a--;
                }
                TF.setText("");
                TF.setText(TF.getText() + f);
            }
        });
        btN.setFont(new Font("Helvetica", Font.PLAIN, 18));
        btN.setBounds(10, 398, 64, 50);
        fre.getContentPane().add(btN);
        JSeparator separator = new JSeparator();
        separator.setBounds(72, 291, 1, 2);
        fre.getContentPane().add(separator);
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(19, 191, 1, 2);
        fre.getContentPane().add(separator_1);
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 191, 320, 2);
        fre.getContentPane().add(separator_2);
        JRadioButton rdbtNewRadioButton = new JRadioButton("ON");
        rdbtNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                bt1.setEnabled(true);
                bt2.setEnabled(true);
                bt3.setEnabled(true);
                bt4.setEnabled(true);
                bt5.setEnabled(true);
                bt6.setEnabled(true);
                bt7.setEnabled(true);
                bt8.setEnabled(true);
                bt9.setEnabled(true);
            }
        });
        buttonGroup.add(rdbtNewRadioButton);
        rdbtNewRadioButton.setBounds(10, 109, 63, 23);
        fre.getContentPane().add(rdbtNewRadioButton);
        JRadioButton rdbtNewRadioButton_1 = new JRadioButton("OFF");
        rdbtNewRadioButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                bt1.setEnabled(false);
                bt2.setEnabled(false);
                bt3.setEnabled(false);
                bt4.setEnabled(false);
                bt5.setEnabled(false);
                bt6.setEnabled(false);
                bt7.setEnabled(false);
                bt8.setEnabled(false);
                bt9.setEnabled(false);
            }
        });
        buttonGroup.add(rdbtNewRadioButton_1);
        rdbtNewRadioButton_1.setBounds(74, 109, 64, 23);
        fre.getContentPane().add(rdbtNewRadioButton_1);
        JButton button = new JButton("+/-");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Double.parseDouble(String.valueOf(TF.getText()));
                a = a * (-1);
                TF.setText(String.valueOf(a));

            }
        });
        button.setFont(new Font("Helvetica", Font.PLAIN, 18));
        button.setBounds(10, 449, 64, 50);
        fre.getContentPane().add(button);
    }
}