package bios.testing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double salario;
        double cantHorasExtras;
        double pagoHorasExtras;
        double horas;
        Empleado emp = new Empleado();

        int salida = 0;

        while (salida == 0) {
            try {
                horas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cantidad de horas trabajadas: "));
                cantHorasExtras = emp.CantidadHorasExtras(horas);
                pagoHorasExtras = emp.pagoHorasExtras(horas);
                salario = emp.CalcularSalario(horas);

                JOptionPane.showMessageDialog(null, "Las horas extras hechas son: " + cantHorasExtras + "\nEl pago por las horas extras es: " + pagoHorasExtras + "\nEl salario total es: " + salario);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            String[] opcion = {"SI", "NO"};
            salida = JOptionPane.showOptionDialog(null, "Presione SI para continuar o NO para salir",
                    "Salida...", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[0]);
        }
    }
}