import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        double precio, totalVentas, promedio;
        int cantidad, respuesta;

        totalVentas = 0;
        cantidad = 0;

        do {

            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));

            totalVentas = totalVentas + precio;
            cantidad++;

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(
                    "¿Desea registrar otro producto?" +
                            "\n1. Sí" +
                            "\n2. No"));

        } while (respuesta == 1);

        promedio = totalVentas / cantidad;

        JOptionPane.showMessageDialog(null,
                "Cantidad de productos: " + cantidad +
                        "\nTotal de ventas: $" + totalVentas +
                        "\nPromedio por producto: $" + promedio);

    }
}