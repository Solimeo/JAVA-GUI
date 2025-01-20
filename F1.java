import javax.swing.*;
import java.awt.*;

public class F1 extends JFrame{
    private JTextField tf;
    private JTextArea ta;
    private JPanel p1;
    private JButton b1;

    public F1(String titolo){
        super(titolo);
        tf=new JTextField();
        ta=new JTextArea();
        p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        b1=new JButton("Inserisci");
        p1.add(b1);
        add(tf, BorderLayout.NORTH);
        add(ta, BorderLayout.CENTER);
        add(p1, BorderLayout.SOUTH);
        setSize(200,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
