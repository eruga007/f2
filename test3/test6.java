import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import sun.management.counter.Counter;
import sun.management.counter.Units;
import sun.management.counter.Variability;

public class test6{
    public static void main(String[] args) {
        
    }
}
class MyFrame extends JFrame {
    private Counter count;
    private JLabel label;
    public MyFrame(String tittle){
        super(title);
        this.getContentPane().setLayout(new BorderLayout());

        label = new JLabel("" + count.getValue())
        this.add(label, BorderLayout.PAGE_START);

        count = new Counter();
        
        JButton btn = new JButton("CLick");
        this.add(btn, BorderLayout.PAGE_END);
        btn.addActionListener(new MyActionListener(){
            public void actionPerformed(ActionEvent e){
                counter.count();
                label.setText("" + count.getValue);
            }
        });

    }
}