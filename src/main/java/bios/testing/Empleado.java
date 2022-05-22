package bios.testing;

import javax.swing.*;

public class Empleado {
    private double valorHora = 40;
    private double salario = 0;

    public Empleado() {
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double CantidadHorasExtras(double horasTrabajadas) {
        return horasTrabajadas - 40;
    }

    public double pagoHorasExtras(double horasTrabajadas) {
        double pago = 0;

        if (horasTrabajadas > 0 && horasTrabajadas <= 40) {
            pago = 0;
        } else if (horasTrabajadas > 40 && horasTrabajadas <= 48) {
            pago = ((horasTrabajadas - 40) * valorHora * 2);
        } else if (horasTrabajadas >= 49) {
            pago = ((horasTrabajadas - 40) * valorHora * 3);
        }

        return pago;
    }

    public double CalcularSalario(double horas) throws Exception {
        try {
            double horasExtras = horas - 40;

            if (horas > 0 && horas <= 40) {
                salario = horas * valorHora;
            } else if (horas > 40 && horas <= 48) {
                salario = ((horas - horasExtras) * valorHora) + ((horas - 40) * valorHora * 2);
            } else if (horas >= 49) {
                salario = ((horas - horasExtras) * valorHora) + ((horas - 40) * valorHora * 3);
            }
        } catch (Exception e) {
            throw new Exception("ERROR");
        }

        return salario;
    }

}
