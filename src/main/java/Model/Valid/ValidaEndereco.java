/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Endereco;
import Model.exceptions.EnderecoException;

/**
 *
 * @author gutei
 */
public class ValidaEndereco {
    public Endereco validaCamposEntrada(String estado, String cidade, String rua, String numero){
        Endereco novoEndereco = new Endereco();
        if(estado.isEmpty()){
            throw new EnderecoException("Erro - Estado vazio");
        }
        novoEndereco.setEstado(estado);
        if(cidade.isEmpty()){
            throw new EnderecoException("Erro - Cidade vazio");
        }
        novoEndereco.setCidade(cidade);
        if(rua.isEmpty()) throw new EnderecoException("Erro - Rua vazia");
        novoEndereco.setRua(rua);
        if(numero.isEmpty()) throw new EnderecoException("Erro - Numero vazio");
        novoEndereco.setNumero(numero);
        return novoEndereco;
    }
}
