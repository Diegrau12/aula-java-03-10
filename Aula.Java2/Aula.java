import java.util.Scanner;
public class Aula{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu sexo: 1 para masculino, 2 para feminino");
        
       //String sexo = (scan.nextInt() == 1 ? "Masculino" : "Feminino"); //operador ternario

        int inputSexo = scan.nextInt();
        String sexo;

        switch (inputSexo) {
            case 1 : {
                sexo = "Masculino";
                break;
            }
            case 2 : {
                sexo = "Feminino";
                break;
            }
            default : sexo = "Outros";
        }

        System.out.println("O sexo escolhido é:"+sexo);




        // String nome = "Diego";
        // int idade = 18;
        // double valorA = 10.5;
        // double valorB = 10.8;

        // double soma = valorA + valorB;
        // System.out.println(soma);

        // double multiplicacao = valorA*valorB;
        // System.out.println(multiplicacao);

        // double n1 = 80;
        // double n2 = 70;
        // double n3 = 50;

    //     Scanner scan = new Scanner(System.in);

    //     System.out.println("DIGITE A N1");
    //     double n1 = scan.nextDouble();
    //     System.out.println("DIGITE A N2");
    //     double n2 = scan.nextDouble();
    //     System.out.println("DIGITE A N3");
    //     double n3 = scan.nextDouble();

    //     double total = n1 + n2 + n3;
    //     double media = total / 3;

    //     if (media == 70){} // igual
    //     if (media >= 70){} // maior ou igual
    //     if (media <= 70){} // menor ou igual
    //     if (media > 70){}  // menor
    //     if (media < 70){}  // maior
    //     if (media != 70){} // diferente

    //     if(media >= 70) {
    //         System.out.println("você foi aprovado!");          //  EXERCICIO PROVA
    //     }
    //     else{
    //         System.out.println("Você está de exame!");

    //         double exame = 100 - media;
    //         System.out.println("Você precisa tirar"+exame);
    //     }

    // }

// ___________________________________________________________________________________________________________
    
    
}
}