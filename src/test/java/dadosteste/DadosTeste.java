package dadosteste;

import static java.util.Arrays.asList;
import static model.Estilo.PAGODAO;
import static model.Estilo.ROCK_N_ROLL;

import java.util.List;

import model.Banda;
import model.Estilo;

public final class DadosTeste {
    private DadosTeste() {
    }

    private static Banda criarBanda(String nome, Estilo estilo,
                                    String ... integrantes) {

        Banda banda = new Banda();
        banda.setNome(nome);
        banda.setEstilo(estilo);

        banda.setIntegrantes(asList(integrantes));

        return banda;
    }

    public static Banda RUSH = criarBanda("Rush", ROCK_N_ROLL,
            "Alex Lifeson", "Geddy Lee", "Neil Peart");

    public static Banda METALLICA = criarBanda("Metallica", ROCK_N_ROLL,
            "James", "Kirk", "Lars", "Cliff The Eternal");

    public static Banda CREAM = criarBanda("Cream", ROCK_N_ROLL,
            "Jack Bruce", "Eric Clapton", "Ginger Baker");

    public static Banda JUDAS_PRIEST = criarBanda("Judas Priest", ROCK_N_ROLL,
            "Halford", "Hill", "Tipton", "Faulkner", "Travis");

    public static Banda MOLEJAO = criarBanda("Molejo", PAGODAO,
            "Um cara", "Outro cara", "Mais um cara", "Mais um", "Mais um outro");

    public static List<Banda> TODAS = asList(RUSH, METALLICA, CREAM, JUDAS_PRIEST, MOLEJAO);
}
