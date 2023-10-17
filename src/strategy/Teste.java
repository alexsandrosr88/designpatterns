package strategy;

public class Teste {
    public static void main(String[] args){

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        System.out.println();

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);

        System.out.println();

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);

        System.out.println();

        robo.mover();
        robo.mover();

    }
}
