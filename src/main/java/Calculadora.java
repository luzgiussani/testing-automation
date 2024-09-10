public class Calculadora {

    // Método para sumar dos números
    public int suma(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int resta(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return (double) a / b;
    }
}

