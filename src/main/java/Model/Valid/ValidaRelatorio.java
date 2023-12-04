/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Paciente;
import Model.exceptions.RelatorioException;
import Model.Relatorio;

/**
 *
 * @author gutei
 */
public class ValidaRelatorio {
    public Relatorio validaRelatorio(Paciente paciente, String protocolo, String justificativa){
        Relatorio novoRelatorio = new Relatorio();
        if(paciente == null) throw new RelatorioException("Nome do paciente inválido");
        novoRelatorio.setPaciente(paciente);
        if(protocolo.isEmpty()) throw new RelatorioException("Protocolo inválido");
        novoRelatorio.setProtocolo(protocolo);
        if(justificativa.isEmpty()) throw new RelatorioException("Justificativa inválida");
        novoRelatorio.setJustificativa(justificativa);
        return novoRelatorio;
    }
}
