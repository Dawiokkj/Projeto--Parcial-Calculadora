package Calculadora;

public class Calcular {
    public static void main(String[] args) {
        Calculadora SOMA = new Calculadora();
        Calculadora SUB = new Sub();
        Calculadora MULT = new Mult();
        Calculadora DIV = new Div();

        int somaInt = SOMA.Calcula(10, 50);
        double somaDouble = SOMA.Calcula(5.5, 20.32);

        int subInt = SUB.Calcula(100, 50);
        double subDouble = SUB.Calcula(20.32, 5.32);

        int multInt = MULT.Calcula(10, 10);
        double multDouble = MULT.Calcula(5.5, 9.0);

        int divInt = DIV.Calcula(10, 5);
        double divDouble = DIV.Calcula(20.5, 5.0);

        System.out.println("Soma Int: " + somaInt);
        System.out.println("Soma Double: " + somaDouble);
        System.out.println("Sub Int: " + subInt);
        System.out.println("Sub Double: " + subDouble);
        System.out.println("Mult Int: " + multInt);
        System.out.println("Mult Double: " + multDouble);
        System.out.println("Div Int: " + divInt);
        System.out.println("Div Double: " + divDouble);

    }
}
