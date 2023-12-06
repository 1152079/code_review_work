public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Невозможно делить на 0");
        }
    }
    public int times(int a, int b){
        return a * b;
    }
    public double[] solver(int a, int b, int c) {
        // Решение уравнения вида ax^2 + bx + c = 0
        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            throw new ArithmeticException("Уравнение не имеет действительных корней");
        } else if (discriminant == 0) {
            return new double[]{-b / (2.0 * a)};
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            // Возвращаем массив корней для упрощения
            return new double[]{root1, root2};
        }
    }

}
