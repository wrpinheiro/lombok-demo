import static java.util.Arrays.asList;

import java.util.List;

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

    public static Banda RUSH = criarBanda("Rush", Estilo.ROCK_N_ROLL,
            "Alex Lifeson", "Geddy Lee", "Neil Peart");

    public static Banda METALLICA = criarBanda("Metallica", Estilo.ROCK_N_ROLL,
            "James", "Kirk", "Lars", "Cliff The Eternal");

    public static Banda CREAM = criarBanda("Cream", Estilo.ROCK_N_ROLL,
            "Jack Bruce", "Eric Clapton", "Ginger Baker");

    public static Banda JUDAS_PRIEST = criarBanda("Judas Priest", Estilo.ROCK_N_ROLL,
            "Halford", "Hill", "Tipton", "Faulkner", "Travis");

    public static Banda MOLEJAO = criarBanda("Molejo", Estilo.PAGODAO,
            "Um cara", "Outro cara", "Mais um cara", "Mais um", "Mais um outro");

    public static List<Banda> TODAS = asList(RUSH, METALLICA, CREAM, JUDAS_PRIEST, MOLEJAO);
}
