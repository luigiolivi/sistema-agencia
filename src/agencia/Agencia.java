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
            float pacoteValor = entrada.nextFloat();
            pacote1.setTransporte(transporte1);
            pacote1.setHospedagem(hospedagem1);
            pacote1.setDestino(pacoteDestino);
            pacote1.setQuantidadeDias(pacoteQuantidadeDias);
            
            System.out.println("\n\nPacote criado com sucesso! \nO transporte será " + transporte1.getTipo() + ", com valor de $" + transporte1.getValor() + ".\nDescrição da hospedagem: '" + hospedagem1.getDescricao() + ".' O valor da diária: $" + hospedagem1.getDiaria() + ". A terá uma duração de " + pacote1.getQuantidadeDias() + " dias, com destino a(`) " + pacote1.getDestino() + ".\nO valor total, sem margem de lucro incluída, será de $" + pacote1.calcularTotal() + ". \nPor favor, informe agora a porcentagem (%) de margem de lucro: ");
            int pacoteMargemPorcentagem = entrada.nextInt();
    }
}
