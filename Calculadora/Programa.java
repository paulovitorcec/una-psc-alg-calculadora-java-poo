import java.util.Scanner;

public class Programa {
    static final String SOMAR = "1";
    static final String SUBTRAIR = "2";
    static final String MULTIPLICAR = "3";
    static final String DIVIDIR = "4";
    static final String RAIZ_QUADRADA = "5";
    static final String POTENCIACAO = "6";
    static final String SAIR = "q";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ultimoComandoDoUsuario = "";
        double primeiroNumero, segundoNumero;
        System.out.println("Calculadora (versão 1.0)");
        do {
            primeiroNumero = 0;
            segundoNumero = 0;
            imprimirOperacoes();
            System.out.println(""); 
            ultimoComandoDoUsuario = scanner.nextLine();
            switch (ultimoComandoDoUsuario.toLowerCase()) {
                case SOMAR:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Informe outro número");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A soma entre " + primeiroNumero + " e " + segundoNumero + " é: "
                            + CalculadoraFuncoes.adicionar(primeiroNumero, segundoNumero));
                    break;
                case SUBTRAIR:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Informe outro número");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A subtração entre " + primeiroNumero + " e " + segundoNumero + " é: "
                            + CalculadoraFuncoes.subtrair(primeiroNumero, segundoNumero));
                    break;
                case MULTIPLICAR:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Informe outro número");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A multiplicação entre " + primeiroNumero + " e " + segundoNumero + " é: "
                            + CalculadoraFuncoes.multiplicar(primeiroNumero, segundoNumero));
                    break;
                case DIVIDIR:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Informe outro número");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A divisão entre " + primeiroNumero + " e " + segundoNumero + " é: "
                            + CalculadoraFuncoes.dividir(primeiroNumero, segundoNumero));
                    break;
                case POTENCIACAO:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println("Informe outro número");
                    segundoNumero = scanner.nextDouble();
                    System.out.println("A potência entre " + primeiroNumero + " e " + segundoNumero + " é: "
                            + CalculadoraFuncoes.potencia(primeiroNumero, segundoNumero));
                    break;
                case RAIZ_QUADRADA:
                    System.out.println("Informe um número");
                    primeiroNumero = scanner.nextDouble();
                    System.out.println(
                            "A raiz quadrada de " + primeiroNumero + " é: " + CalculadoraFuncoes.raizQuadrada(primeiroNumero));
                    break;
                case SAIR:
                    System.out.println("Fechando programa");
                    break;
                default:
                    System.out.println("Comando não reconhecido");
            }

        } while (!ultimoComandoDoUsuario.toLowerCase().equals(SAIR));
        scanner.close();
    }

    public static void imprimirOperacoes() {
        System.out.println("Operações Disponíveis");
        System.out.printf("%s - Somar \n", SOMAR);
        System.out.printf("%s - Subtrair \n", SUBTRAIR);
        System.out.printf("%s - Multiplicar \n", MULTIPLICAR);
        System.out.printf("%s - Dividir \n", DIVIDIR);
        System.out.printf("%s - Potenciação \n", POTENCIACAO);
        System.out.printf("%s - Raiz Quadrada \n", RAIZ_QUADRADA);
        System.out.print("Qual operação deseja realizar? ");
    }
}