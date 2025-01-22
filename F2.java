import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class F2 extends JFrame{
    private JPanel p1,p2,p3,p4;
    private JButton b1;
    private JTextField tf1, tf2;
    private JLabel l1, l2;

    public F2(String titolo){
        super(titolo);

        //Istanzio i widgets
        p1=new JPanel(new GridLayout(2,0));
        p2=new JPanel(new GridLayout(2,0));
        p3=new JPanel(new BorderLayout());
        p4=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        b1=new JButton("Converti");
        tf1=new JTextField();
        tf2=new JTextField();
        l1=new JLabel("Lire");
        l2=new JLabel("Euro");

        //posizionamento
        setLayout(new BorderLayout());

        //NORTH
        p2.add(tf1);
        p2.add(tf2);
        p1.add(l1);
        p1.add(l2);
        p3.add(p1, BorderLayout.WEST);
        p3.add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.NORTH);

        //SOUTH
        p4.add(b1);
        add(p4, BorderLayout.SOUTH);

        //Operazioni finali
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}