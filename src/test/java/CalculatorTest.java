import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(8, 3);
        assertEquals(5, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(10, 2);
        assertEquals(5, result);

        assertThrows(ArithmeticException.class, () -> {
            calculator.div(5, 0); // division by zero should throw ArithmeticException
        });
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(4, 6);
        assertEquals(24, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();

        // Тест для линейного уравнения ax + b = 0
        double a = 2;
        double b = -6;
        double result = calculator.solver(a, b);
        assertEquals(3.0, result, 0.0001);  // Проверяем, что результат равен 3 с погрешностью 0.0001
    }
}