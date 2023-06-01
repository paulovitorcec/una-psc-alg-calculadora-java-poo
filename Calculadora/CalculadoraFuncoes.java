class CalculadoraFuncoes {
    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0)
            System.out.println("Impossível realizar uma divisão por zero.");
        return a / b;
    }

    public static double potencia(double a, double b) {
        if (a == 0 || b == 0)
            System.out.println("Todo número elevado a zero será igual a 1.");
        return Math.pow(a, b);
    }

    public static double raizQuadrada(double a) {
        if (a < 0)
            System.out.println("Não existe raiz de número negativo.");
        return Math.sqrt(a);
    }
}