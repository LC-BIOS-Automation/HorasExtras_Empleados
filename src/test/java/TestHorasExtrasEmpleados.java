import bios.testing.Empleado;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class TestHorasExtrasEmpleados {
    @Test
    public void TestCalculoSalario_20Horas() throws Exception {
        Empleado empleado = new Empleado();
        double salario = empleado.CalcularSalario(20);
        double valorEsperado = 800;
        assertEquals(valorEsperado, salario);
    }
    @Test
    public void TestCalculoSalario_43Horas() throws Exception {
        Empleado empleado = new Empleado();
        double salario = empleado.CalcularSalario(43);
        double valorEsperado = 1840;
        assertEquals(valorEsperado, salario);
    }

    @Test
    public void TestCalculoSalario_ExceptionPorTexto(){
        Empleado empleado = new Empleado();
        assertThrows(Exception.class, () -> empleado.CalcularSalario(Double.parseDouble("48a")));
    }

}
