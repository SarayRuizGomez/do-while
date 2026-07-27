import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        double notas, suma, promedio;
        int cantidad, respuesta, i;

        suma = 0;
        cantidad = 0;

        do {
            notas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota: "));
            suma = suma + notas;
            cantidad++;

            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Desea registrar la nota 1 = si o 2 = no: "));

        } while (respuesta == 1);

        promedio = suma / cantidad;

        JOptionPane.showMessageDialog(null,
                "Cantidad de notas: " + cantidad +
                        "\n" + "Promedio: " + promedio);
    }
}

