import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

    private JPanel panel2;
    private JRadioButton ch2;
    private JRadioButton ch3;
    private JRadioButton ch4;
    private JRadioButton ch1;
    public Menu(){
        super("Transacción a realizar");
        setContentPane(panel2);


        ch4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Muchas gracias");
            }
        });
    }
}
