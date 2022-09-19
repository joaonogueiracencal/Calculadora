package calculator;


class Subtrai {

    static void subtrair() {
     LeDados r = new LeDados();
     r.leValores("Insira valor", "Insira valor a subtrair");
     System.out.println("Subtração: " + (r.valor1 / r.valor2));
}
    
}
