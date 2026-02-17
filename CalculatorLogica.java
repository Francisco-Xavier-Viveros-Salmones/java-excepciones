public class CalculatorLogica {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java CalculatorLogica operando1 operador operando2");
            System.exit(1);
        }

        if (!isDigitString(args[0])) {
            System.out.println("Entrada incorrecta: " + args[0]);
            System.exit(2);
        }
        if (!isDigitString(args[2])) {
            System.out.println("Entrada incorrecta: " + args[2]);
            System.exit(3);
        }

        int result = 0;
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[2]);

        switch (args[1].charAt(0)) {
            case '+': result = op1 + op2; break;
            case '-': result = op1 - op2; break;
            case '.': result = op1 * op2; break;
            case '/': result = op1 / op2; break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    public static boolean isDigitString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}