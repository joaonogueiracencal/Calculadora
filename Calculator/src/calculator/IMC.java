
package calculator;


class IMC {

    static void calculaIMC() {
        float peso, altura, imc;
        System.out.println("Insira peso");
        peso = Calculator.ler.nextFloat();
        System.out.println("Insira altura");
        altura = Calculator.ler.nextFloat();
        imc = peso/(altura*altura);
        System.out.println("IMC: " + imc);
        
        if (imc <18.5)
            System.out.println("Abaixo do peso.");
        else if (imc <24.9)
            System.out.println("Peso normal.");
        else if (imc <29.9)
            System.out.println("Sobrepeso.");
        else if (imc <34.9)
            System.out.println("Obesidade grau 1");
        else if (imc <39.9)
            System.out.println("Obesidade grau 2.");
        else
            System.out.println("Obesidade grau 3 ou Mórbida.");
    }
    
}
