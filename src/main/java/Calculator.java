public class Calculator implements ArithmeticOperations {

    /**
     * Calculator Klasse implementiert Addition - Interface
     * Frage: Nur ein Interface für alle Operationen erstellen
     * oder für je eine Operation ein Interface erstellen?
     * Java Doc
     */

    public Calculator(int a, int b) {
    }


    @Override
    public int addition(int a, int b) {
        return a + b;
       // System.out.println("Summe ist: " + summand1 + summand2);


    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }


}
