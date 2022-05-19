import bios.testing.Empleado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHorasExtrasEmpleados {
    @Test
    public void TestCalculoSalario_01() throws Exception {
        Empleado empleado = new Empleado();
        double salario = empleado.CalcularSalario(40);
        double valorEsperado = 1600;
        assertEquals(valorEsperado, salario);
    }
    @Test
    public void TestCalculoSalario_02() throws Exception {
        Empleado empleado = new Empleado();
        double salario = empleado.CalcularSalario(42);
        double valorEsperado = 1760;
        assertEquals(valorEsperado, salario);
    }
}
