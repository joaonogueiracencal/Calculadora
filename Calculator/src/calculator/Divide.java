package calculator;


class Divide {

    static void dividir() {
    LeDados r = new LeDados();
    r.leValores("Insira valor", "Insira valor para dividir");
    System.out.println("Divisão: " + (r.valor1/r.valor2));
}
    
}
