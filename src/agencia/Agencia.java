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
            
            Pacote pacote1 = new Pacote();
            System.out.println("\n\nDigite o destino: ");
            String pacoteDestino = entrada.next();
            System.out.println("\nDigite a quantidade de dias: ");
            int pacoteQuantidadeDias = entrada.nextInt();
            System.out.println("\nDigite a porcentagem da margem de lucro: ");
            int pacoteMargemPorcentagem = entrada.nextInt();
            System.out.println("\nDigite o valor para o cálculo da margem de lucro: ");
            float pacoteValor = entrada.nextFloat();
            System.out.println("\nDigite o valor de taxas adicionais: ");
            float pacoteTaxa = entrada.nextFloat();
            pacote1.setTransporte(transporte1);
            pacote1.setHospedagem(hospedagem1);
            pacote1.setDestino(pacoteDestino);
            pacote1.setQuantidadeDias(pacoteQuantidadeDias);
            pacote1.setMargemPorcentagem(pacoteMargemPorcentagem);
            pacote1.setValor(pacoteValor);
            pacote1.setTaxa(pacoteTaxa);
    }
}
