package agencia;

import java.util.Scanner;

public class Agencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o tipo de transporte: ");
            String transporteTipo = entrada.next();
            System.out.println("\nDigite o valor do transporte: ");
            float transporteValor = entrada.nextFloat();
            Transporte transporte1 = new Transporte(transporteTipo, transporteValor);
            
            System.out.println("\n\nDigite a descrição da hospedagem: ");
            String hospedagemDescricao = entrada.next();
            System.out.println("Digite o valor da diária: ");
            float hospedagemDiaria = entrada.nextFloat();
            Hospedagem hospedagem1 = new Hospedagem(hospedagemDescricao, hospedagemDiaria);
    }
}
