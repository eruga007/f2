import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class test1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.add(new JLabel("ggEZ"));
        JButton btn = new JButton("btn1");
        btn.addActionListener(new MyActionListener());
        frame.add(btn);
        frame.setVisible(true);
    }
}
 
 class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("hello");
    } 
    
}