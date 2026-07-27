import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial: "));
        double retiro;
        int opciones;


        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("opciones: " +
                    "\n" + "1. Retirar dinero."
                    + "\n" + "2. Consultar saldo."
                    + "\n" + "3. Salir."));

            if (opciones == 1) {
                retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuánto desea retirar: "));
                if (retiro <= saldoInicial) {
                    saldoInicial = saldoInicial - retiro;
                }else{
                    JOptionPane.showMessageDialog(null, "saldo insuficiente");
                }

            } else if (opciones == 2) {
                JOptionPane.showMessageDialog(null, saldoInicial);

            }

        }while (opciones != 3) ;

    }
}