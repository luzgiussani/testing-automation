import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int ejecuciones = 0;
        while (ejecuciones < 5) {
            try {
                // Solicitar primer valor
                System.out.print("Primer valor: ");
                int primerValor = scanner.nextInt();

                // Solicitar segundo valor
                System.out.print("Segundo valor: ");
                int segundoValor = scanner.nextInt();

                // Solicitar operación
                System.out.print("Operación (+, -, *, /): ");
                String operacion = scanner.next();

                // Calcular y mostrar resultado
                double resultado;
                switch (operacion) {
                    case "+":
                        resultado = calculadora.suma(primerValor, segundoValor);
                        break;
                    case "-":
                        resultado = calculadora.resta(primerValor, segundoValor);
                        break;
                    case "*":
                        resultado = calculadora.multiplicacion(primerValor, segundoValor);
                        break;
                    case "/":
                        resultado = calculadora.division(primerValor, segundoValor);
                        break;
                    default:
                        System.out.println("Operación no válida");
                        continue;
                }

                // Mostrar el resultado
                System.out.println("Resultado: " + resultado);

                // Evaluar el resultado
                if (resultado < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo!");
                } else if (resultado >= 0 && resultado < 10000) {
                    System.out.println("Resultado dentro de los límites");
                } else {
                    System.out.println("Error, resultado muy grande");
                }

                ejecuciones++;
            } catch (ArithmeticException e) {
                // Manejo específico para división por cero
                System.out.println(e.getMessage()); // Muestra "División por cero no permitida"
            } catch (Exception e) {
                // Manejo genérico para otras excepciones
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        scanner.close();
    }
}
