import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test2{
    private static final String[] FACE = new String[]{"1","2","3","4","5","6","7","8","9","#","0","#"}; 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel facesPanel = new JPanel();
        GridLayout layout = new GridLayout(0,2);
        layout.setHgap(5);
        layout.setVgap(2);
        facesPanel.setLayout(layout);
        for(String f : FACE){
            facesPanel.add(new JButton(f));
        }
        JTextField field = new JTextField();
        field.setFont(field.getFont().deriveFont(20.0f));
        frame.add(field,BorderLayout.PAGE_START);
        frame.add(facesPanel,BorderLayout.CENTER);

        JButton done = new JButton("Done!!");
        frame.add(done,BorderLayout.PAGE_END);
        frame.setVisible(true);
    }
}