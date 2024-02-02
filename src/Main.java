import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Ingreso inicio = new Ingreso();
            inicio.iniciar();
        });

    }
    public void redirect(){

    }
}