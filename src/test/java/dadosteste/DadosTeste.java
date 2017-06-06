package dadosteste;

import static java.util.Arrays.asList;
import static model.Estilo.PAGODAO;
import static model.Estilo.ROCK_N_ROLL;

import java.util.List;

import model.Banda;

public final class DadosTeste {
    private DadosTeste() {
    }

    public static Banda RUSH = Banda.builder()
            .nome("Rush").estilo(ROCK_N_ROLL)
            .integrante("Alex Lifeson")
            .integrante("Geddy Lee")
            .integrante("Neil Peart")
            .build();

    public static Banda METALLICA = Banda.builder()
            .nome("Metallica").estilo(ROCK_N_ROLL)
            .integrante("James")
            .integrante("Kirk")
            .integrante("Lars")
            .integrante("Cliff The Eternal")
            .build();

    public static Banda CREAM = Banda.builder()
            .nome("Cream").estilo(ROCK_N_ROLL)
            .integrante("Jack Bruce")
            .integrante("Eric Clapton")
            .integrante("Ginger Baker")
            .build();

    public static Banda JUDAS_PRIEST = Banda.builder()
            .nome("Judas Priest").estilo(ROCK_N_ROLL)
            .integrante("Halford")
            .integrante("Hill")
            .integrante("Tipton")
            .integrante("Faulkner")
            .integrante("Travis")
            .build();

    public static Banda MOLEJAO = Banda.builder()
            .nome("Molejo").estilo(PAGODAO)
            .integrante("Um cara")
            .integrante("Outro cara")
            .integrante("Mais um cara")
            .integrante("Mais um")
            .integrante("Mais um outro")
            .build();

    public static List<Banda> TODAS = asList(RUSH, METALLICA, CREAM, JUDAS_PRIEST, MOLEJAO);
}
