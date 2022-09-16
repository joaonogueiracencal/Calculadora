package calculator;


public class LeDados {
    
    public float valor1, valor2;
    
    public void leValores(){
        System.out.println("Insira um valor");
        valor1 = Calculator.ler.nextFloat();
        System.out.println("Insira outro valor");
        valor2 = Calculator.ler.nextFloat();
    }
}
