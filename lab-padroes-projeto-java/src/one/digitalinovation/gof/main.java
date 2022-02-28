package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.strategy.Robo;

public class main {
    public static void main(String[] args) {


        /**Testes relacionados ao design pattern Singleton**/
        SingletonLazy lazy  = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager  = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder  = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        /** Strategy **/
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        /**Facade**/
        Facade facade = new Facade();
        facade.migrarCliente("Demerval","1234567");







    }
}
