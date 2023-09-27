/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.exceptions.RelatorioException;
import Model.Relatorio;

/**
 *
 * @author gutei
 */
public class ValidaRelatorio {
    public Relatorio validaRelatorio(String nomePaciente, String protocolo, String justificativa, String medicoResponsavel){
        Relatorio novoRelatorio = new Relatorio();
        if(nomePaciente.isEmpty()) throw new RelatorioException("Nome do paciente inválido");
        novoRelatorio.setNomePaciente(nomePaciente);
        if(protocolo.isEmpty()) throw new RelatorioException("Protocolo inválido");
        novoRelatorio.setProtocolo(protocolo);
        if(justificativa.isEmpty()) throw new RelatorioException("Justificativa inválida");
        novoRelatorio.setJustificativa(justificativa);
        if(medicoResponsavel.isEmpty()) throw new RelatorioException("Medico invalido");
        novoRelatorio.setMedicoResponsavel(medicoResponsavel);
        return novoRelatorio;
    }
}
