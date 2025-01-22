import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiaFinestra extends JFrame implements ActionListener{
    private JTextField tf;
    private JTextArea ta;
    private JPanel p1;
    private JButton b1;

    public MiaFinestra(String titolo){
        super(titolo);
        //Istanzio i widgets
        tf=new JTextField();
        ta=new JTextArea();
        p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        b1=new JButton("Inserisci");
        //Posiziono gli elementi
        add(tf, BorderLayout.NORTH);
        add(ta, BorderLayout.CENTER);
        p1.add(b1);
        add(p1, BorderLayout.SOUTH);
        //registrazione listener
        
        b1.addActionListener(this);
       
        //Operazioni finali
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
     //Registrazione Listener
        //b1.addActionListener(this);
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1)
                ta.append(tf.getText()+"\n");
       //     if(e.getSource()==b2)
        //        ta.setText(" ");
        }
}