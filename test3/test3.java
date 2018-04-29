import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test3{
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.getContentPane().setLayout(new BorderLayout());

        Counter counter = new Counter();

        JLabel label = new JLabel("" + counter.getValue());
        frame.add(label,BorderLayout.PAGE_START);

        JButton btn = new JButton("Done");
        btn.addActionListener(new MyActionListener(counter, label));
        frame.add(btn , BorderLayout.PAGE_END);

        frame.setVisible(true);
    }
}
class MyActionListener implements ActionListener{
    private Counter counter;
    private JLabel label;

    public MyActionListener(Counter counter,JLabel label){
        this.counter = counter;
        this.label = label;
    }
    public void actionPerformed(ActionEvent e){
        counter.count();
        label.setText(""+counter.getValue());
    }
}
