
package calculator;


class Soma {

    static void somar() {
        LeDados r = new LeDados();
        r.leValores("Insira valor", "Insira valor para somar");
        System.out.println("Soma: "+(r.valor1+r.valor2));
  }
    
}
