package ongaplicacao.dto.servico;

import ongaplicacao.dto.EnderecoDto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ApiServico apiServico = new ApiServico();

        System.out.print("Digite o seu CEP: ");
        String cep = input.nextLine();

        try {
            EnderecoDto dadosEndereco = apiServico.getEndereco(cep);
            System.out.println("\nENDEREÇO");
            System.out.println("Logradouro: " + dadosEndereco.getLogradouro());
            System.out.println("Cidade:     " + dadosEndereco.getLocalidade());
            System.out.println("Estado:     " + dadosEndereco.getUf());
            System.out.println("Bairro: " + dadosEndereco.getBairro());
            System.out.println("uf: " + dadosEndereco.getUf());
            System.out.println("Numero: " + dadosEndereco.getDdd());


        } catch (Exception e) {
            System.out.println("Erro ao buscar o CEP: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}