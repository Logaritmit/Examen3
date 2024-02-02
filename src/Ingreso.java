import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingreso extends JFrame {
    private JPasswordField tx1;
    private JButton bt3;
    private JButton bt2;
    private JButton bt1;
    private JButton bt6;
    private JButton bt5;
    private JButton bt4;
    private JButton bt9;
    private JButton bt8;
    private JButton bt7;
    private JButton btenter;
    private JButton bt0;
    private JPanel panel1;


    public Ingreso() {
        super("Bienvenido al Banco del Búho");
        setContentPane(panel1);


        btenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String contraseñaCorrecta = "123";
                char[] contraseñaIngresada = tx1.getPassword();

                if (contraseñaCorrecta.equals(new String(contraseñaIngresada))) {
                    Menu opera = new Menu();
                    opera.setSize(450, 450);
                    opera.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null,"Intentar otra vez");
                }
                dispose();
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = 1;
                String numeroComoTexto = String.valueOf(numero1);



            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
