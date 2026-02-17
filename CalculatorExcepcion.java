public class CalculatorExcepcion {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java CalculatorExcepcion operando1 operador operando2");
            System.exit(1);
        }

        int result = 0;

        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[2]);

            switch (args[1].charAt(0)) {
                case '+': result = op1 + op2; break;
                case '-': result = op1 - op2; break;
                case '.': result = op1 * op2; break;
                case '/': result = op1 / op2; break;
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

        } catch (NumberFormatException e) {
            if (!esNumerico(args[0])) {
                System.out.println("Entrada incorrecta: " + args[0]);
            } else {
                System.out.println("Entrada incorrecta: " + args[2]);
            }
        }
    }

    private static boolean esNumerico(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}