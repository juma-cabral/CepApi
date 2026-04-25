package ongaplicacao.dto.servico;

import com.fasterxml.jackson.databind.ObjectMapper;
import ongaplicacao.dto.EnderecoDto;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiServico {
    EnderecoDto enderecoDto = new EnderecoDto();

    public EnderecoDto getEndereco(String cep) {
        try (HttpClient client = HttpClient.newHttpClient()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new ObjectMapper().readValue(response.body(), EnderecoDto.class);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}