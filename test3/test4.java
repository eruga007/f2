import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class test4{
    public static void main(String[] args) {
        MYFRAME frame = new MYFRAME("My App");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
    }
}
class MYFRAME extends JFrame{
    public MYFRAME(String name){
        super(name);
        this.getContentPane().setLayout(new BorderLayout());
        
        Counter counter = new Counter();

        JLabel label = new JLabel("" + counter.getValue());
        this.add(label,BorderLayout.PAGE_START);

        JButton btn = new JButton("btn");
        btn.addActionListener(new MyActionListener(counter,label));
        this.add(btn,BorderLayout.PAGE_END);
        
        
    }
}
class MyActionListener implements ActionListener{
    private Counter counter;
    private JLabel label;

    public MyActionListener(Counter counter, JLabel label){
        this.counter = counter;
        this.label = label;
    }
    public void actionPerformed(ActionEvent e){
        counter.count();
        label.setText("" + counter.getValue());
    }
}