import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        String contraseñaCorrecta, contraseñaIngresada;

        contraseñaCorrecta = JOptionPane.showInputDialog("Ingrese una contraseña segura: ");

        do{
            contraseñaIngresada = JOptionPane.showInputDialog("Ingrese la contraseña: ");
             if (contraseñaIngresada.equals(contraseñaCorrecta)){
                 JOptionPane.showMessageDialog(null, "Acceso concedido");
             }else {
                 JOptionPane.showMessageDialog(null, " Acceso denegado");
             }




        }while(!contraseñaIngresada.equals(contraseñaCorrecta));
    }
}
