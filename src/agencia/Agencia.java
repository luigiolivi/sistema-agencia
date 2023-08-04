package agencia;

import java.util.Scanner;

public class Agencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("Digite o tipo de transporte: ");
            String transporteTipo = entrada.next();
            System.out.println("\nDigite o valor do transporte: ");
            float transporteValor = entrada.nextFloat();
            entrada.nextLine();
            Transporte transporte1 = new Transporte(transporteTipo, transporteValor);
            
            System.out.println("\n\nDigite a descrição da hospedagem: ");
            String hospedagemDescricao = entrada.next();
            System.out.println("\nDigite o valor da diária: ");
            float hospedagemDiaria = entrada.nextFloat();
            entrada.nextLine();
            Hospedagem hospedagem1 = new Hospedagem(hospedagemDescricao, hospedagemDiaria);
            
            Pacote pacote1 = new Pacote();
            System.out.println("\n\nDigite o destino: ");
            String pacoteDestino = entrada.nextLine();
            System.out.println("\nDigite a quantidade de dias: ");
            int pacoteQuantidadeDias = entrada.nextInt();
            pacote1.setTransporte(transporte1);
            pacote1.setHospedagem(hospedagem1);
            pacote1.setDestino(pacoteDestino);
            pacote1.setQuantidadeDias(pacoteQuantidadeDias);
            float valorPacoteCriado = pacote1.calcularTotal();
            
            System.out.println("\n\nPacote criado com sucesso! \nO transporte será " + transporte1.getTipo() + ", com valor de $" + transporte1.getValor() + ".\nDescrição da hospedagem: '" + hospedagem1.getDescricao() + ".' Valor da diária: $" + hospedagem1.getDiaria() + ". A viagem terá uma duração de " + pacote1.getQuantidadeDias() + " dias, com destino a(`) " + pacote1.getDestino() + ".\nO valor total, sem margem de lucro incluída, será de $" + valorPacoteCriado + ". \nPor favor, informe agora a porcentagem (%) de margem de lucro: ");
            int pacoteMargemPorcentagem = entrada.nextInt();
            
            float valorPacoteMargem = pacote1.calcularLucro(pacoteMargemPorcentagem);
            pacote1.setValorPacote(valorPacoteMargem);
            System.out.println("\nO valor do pacote com margem de lucro de " + pacoteMargemPorcentagem + "% será $" + valorPacoteMargem);
            
            Venda venda1 = new Venda();
            System.out.println("\n\nDigite o nome do cliente: ");
            String vendaCliente = entrada.next();
            System.out.println("\nDigite a forma de pagamento: ");
            String vendaFormaPagamento = entrada.next();
            System.out.println("\nInforme, por favor, o valor do dólar: ");
            float vendaDolar = entrada.nextFloat();
            venda1.setCliente(vendaCliente);
            venda1.setFormaPagamento(vendaFormaPagamento);
            venda1.setPacote(pacote1);
            venda1.setDolar(vendaDolar);
            
            System.out.println("\n\nVenda criada com sucesso! \nO nome do(a) cliente é " + venda1.getCliente() + " e a forma de pagamento será " + venda1.getFormaPagamento());
            venda1.mostrarTotalPacote();
    }
}
