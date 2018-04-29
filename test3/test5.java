import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class test5{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("MyApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
class MyFrame extends JFrame{
	private JLabel label;
    private Counter counter;    
    public MyFrame(String name){
       super(name);
       this.getContentPane().setLayout(new BorderLayout());
       
       counter = new Counter();

       label = new JLabel("" + counter.getValue());
       this.add(label,BorderLayout.PAGE_START);

       JButton btn = new JButton("Click Me");
       btn.addActionListener(new MyActionListener());
       this.add(btn,BorderLayout.PAGE_END);
    }
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            counter.count();
            label.setText("" + counter.getValue());        }
    }
}