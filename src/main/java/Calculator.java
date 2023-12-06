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
    public double solver(double a, double b) {
        if (a != 0) {
            return -b / a;
        } else {
            throw new IllegalArgumentException("Уравнение не является линейным");
        }
    }

}
