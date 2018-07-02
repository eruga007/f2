import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {
    private String S;
  public GUI() {
    setSize(600, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    JLabel firstnumber = new JLabel("firstnumber: ");
    JLabel seccondnumber = new JLabel("seccondnumber: ");
    JLabel result = new JLabel("result");
    JTextField textField1 = new JTextField(5);
    JTextField textField2 = new JTextField(5);
    JButton btn = new JButton("Calculate");
    JTextArea result2 = new JTextArea(2,5);
    
    S = "";
    getContentPane().add(firstnumber);
    getContentPane().add(textField1);
    getContentPane().add(seccondnumber);
    getContentPane().add(textField2);
    getContentPane().add(result);

    btn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            
            try{
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            S = S + (num1%num2);
            result2.setText(S);
            }catch(ArithmeticException e1){

            }

        }
    });
    getContentPane().add(result2);
    getContentPane().add(btn);
  }
  
  public static void main(String[] args) {
    new GUI().setVisible(true);
  }
}