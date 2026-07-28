import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        int edad, cantidad, respuesta;
        double suma, promedio;

        suma = 0;
        cantidad = 0;

        do {

            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona:"));

            suma = suma + edad;
            cantidad++;

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(
                    "¿Desea registrar otra persona?" +
                            "\n1. Sí" +
                            "\n2. No"));

        } while (respuesta == 1);

        promedio = suma / cantidad;

        JOptionPane.showMessageDialog(null,
                "Cantidad de personas: " + cantidad +
                        "\n" + "Suma de edades: " + suma +
                        "\n" + "Promedio de edades: " + promedio);

    }
}