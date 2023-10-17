package facade;

import facade.subsistema2.crm.CrmService;
import facade.subsistema1.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep,cidade,estado);
    }
}
