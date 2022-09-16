
package calculator;


class Expoente {

    static void potencia() {
     LeDados r = new LeDados();
     r.leValores();
     System.out.println("Potência: " + Math.pow(r.valor1, r.valor2) );
             
             
    }
    
}
