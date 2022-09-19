
package calculator;


class IMC {

    static void calculaIMC() {
        float peso, altura, imc;
        LeDados r = new LeDados();
        r.leValores("Insira o seu peso em kg", "Insira a sua altura em metros");
        imc = r.valor1/(r.valor2*r.valor2);
        System.out.println("IMC: " + imc);
        
        if (imc <18.5)
            System.out.println("Abaixo do peso.");
        else if (imc <25)
            System.out.println("Peso normal.");
        else if (imc <30)
            System.out.println("Sobrepeso.");
        else if (imc <35)
            System.out.println("Obesidade grau 1");
        else if (imc <40)
            System.out.println("Obesidade grau 2.");
        else
            System.out.println("Obesidade grau 3 ou Mórbida.");
    }
    
}
