/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Endereco;
import Model.Paciente;
import Model.exceptions.EnderecoException;

/**
 *
 * @author gutei
 */
public class ValidaEndereco {
    public Endereco validaCamposEntrada(String estado, String cidade, String rua, String numero, Paciente id_paciente){
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
        if(id_paciente == null) throw new EnderecoException("Erro - Paciente inválido");
        novoEndereco.setPaciente(id_paciente);
        return novoEndereco;
    }
}
