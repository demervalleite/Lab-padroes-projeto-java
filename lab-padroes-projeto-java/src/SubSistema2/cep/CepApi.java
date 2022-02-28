package SubSistema2.cep;

import one.digitalinovation.gof.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "araraquara";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }

}
