import bios.testing.Empleado;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_HorasExtrasEmpleados {

    @Test//(expected = Exception.class)
    public void TestCalculoSalario() throws Exception {
        Empleado empleado = new Empleado();
        double salario = empleado.CalcularSalario(42);
        double valorEsperado = 1760;
        assertEquals(valorEsperado, salario);
    }
}
