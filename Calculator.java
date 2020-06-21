import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private double total1=0.0;
    private double total2=0.0;
    private char mathOperator;

    private JPanel Calculator;
    private JTextField textField1;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button10;
    private JButton Button11;
    private JButton Button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JMenuBar TrigMenu;
    private JMenuBar gMenu;
    private JMenu gateMenu;
    private JMenuBar lMenu;
    private JMenu logicMenu;
    private JMenuItem Sine;
    private JMenuItem Cosine;
    private JMenuItem Tan;
    private JMenuItem Cosecant;
    private JMenuItem Secant;
    private JMenuItem Cotangent;
    private JMenuItem AND;
    private JMenuItem NAND;
    private JMenuItem OR;
    private JMenuItem NOR;
    private JMenuItem NOT;
    private JMenuItem XOR;
    private JMenuItem Decimal;
    private JMenuItem Binary;
    private JMenuItem Hexadecimal;
    private JMenuItem Octal;

    private void getOperator (String ButtonText) {
        mathOperator = ButtonText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public Calculator() {

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button1Text = textField1.getText() + Button1.getText();
                textField1.setText(Button1Text);
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button2Text = textField1.getText() + Button2.getText();
                textField1.setText(Button2Text);
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button3Text = textField1.getText() + Button3.getText();
                textField1.setText(Button3Text);
            }
        });

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Button5Text = textField1.getText() + Button5.getText();
                textField1.setText(Button5Text);
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button6Text = textField1.getText() + Button6.getText();
                textField1.setText(Button6Text);
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button7Text = textField1.getText() + Button7.getText();
                textField1.setText(Button7Text);
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button8Text = textField1.getText() + Button8.getText();
                textField1.setText(Button8Text);
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button9Text = textField1.getText() + Button9.getText();
                textField1.setText(Button9Text);
            }
        });
        Button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button10Text = textField1.getText() + Button10.getText();
                textField1.setText(Button10Text);
            }
        });
        Button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button11Text = textField1.getText() + Button11.getText();
                textField1.setText(Button11Text);
            }
        });
        Button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });


        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text =button16.getText();
                getOperator(button_Text);
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator){

                    case '+' :
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;

                    case '-' :
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;

                    case '÷' :
                        total2 = total1 / Double.parseDouble(textField1.getText());
                        break;

                    case '×' :
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                }

                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });


        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String Button4Text = textField1.getText() + Button4.getText();
                    textField1.setText(Button4Text);

                    if (textField1.getText().equals("")){
                        textField1.setText("0.");}

                    else if (textField1.getText().contains(".")){
                        Button4.setEnabled(false);}

                    else
                    {String button4Text = textField1.getText() + Button4.getText();
                        textField1.setText(Button4Text);}

                        Button4.setEnabled(true);

            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text =button15.getText();
                getOperator(button_Text);
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text =button13.getText();
                getOperator(button_Text);
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_Text =button14.getText();
                getOperator(button_Text);
            }
        });

        Sine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double degrees=Double.parseDouble(textField1.getText());
                degrees = Math.toRadians(degrees);
                degrees = Math.sin(degrees);
                textField1.setText("\n" + degrees);
                JOptionPane.showMessageDialog(Sine, "The entered degree is converted to radians");

            }
        });

        Cosecant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double degrees=Double.parseDouble(textField1.getText());
                degrees = Math.toRadians(degrees);
                degrees = Math.sin(degrees);
                double csc =  1/Math.sin(degrees);
                textField1.setText(String.valueOf(degrees));
                System.out.println("Cosecant = " + csc);

        Tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double degrees=Double.parseDouble(textField1.getText());
                degrees = Math.toRadians(degrees);
                degrees = Math.tan(degrees);
                textField1.setText(String.valueOf(degrees));
                JOptionPane.showMessageDialog(Tan, "The entered degree is converted to radians");

            }
        });

        Cotangent.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double degrees=Double.parseDouble(textField1.getText());
                        degrees = Math.toRadians(degrees);
                        degrees = Math.tan(degrees);
                        double cot =  1/Math.tan(degrees);
                        textField1.setText(String.valueOf(degrees));
                        System.out.println("Cotangent = " + cot);
                    }
                });


        Cosine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double degrees=Double.parseDouble(textField1.getText());
                degrees = Math.toRadians(degrees);
                degrees = Math.cos(degrees);
                textField1.setText(String.valueOf(degrees));
                JOptionPane.showMessageDialog(Cosine, "The entered degree is converted to radians");
            }
        });

        Secant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double degrees=Double.parseDouble(textField1.getText());
                    degrees = Math.toRadians(degrees);
                    degrees = Math.cos(degrees);
                    double sec =  1/Math.cos(degrees);
                    textField1.setText(String.valueOf(degrees));
                    System.out.println("Secant = " + sec);
            }
        });


            }
        });
    }}

