package com.dh.meli.exerciciospring.repository;

import com.dh.meli.exerciciospring.model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepo {

    private final String linkFile = "src/main/resources/dados.json";


    public Veiculo getVeiculo(String placa){
        try{
            List<Veiculo> lista = this.getAll();
            for(Veiculo v:lista){
                if(v.getPlaca().equals(placa)){
                    return v;
                }
            }

        }catch (Exception ex){

        }
        return null;
    }

    public List<Veiculo> getAll(){
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> listaVeiculos = null;
        try{
            listaVeiculos = Arrays.asList(mapper.readValue(new File(linkFile),Veiculo[].class));

        } catch(Exception ex){
            System.out.println("Não deu certo");
        }
        return listaVeiculos;
    }


    public void saveVeiculo(Veiculo veiculo){
        ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);;


        try{
            List<Veiculo> listaRecebida = this.getAll();
            List<Veiculo> listaAtulizada = new ArrayList<>(listaRecebida);
            listaAtulizada.add(veiculo);
            mapper.writeValue(new File(linkFile), listaAtulizada);

        } catch (Exception ex){
            System.out.println("Erro");
        }

    }

}
