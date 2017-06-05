import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Test;

public class FiltroBandaTest {
    @Test public void
    deve_retornar_lista_vazia_quando_nao_encontrou_trios() {
        List<Banda> bandas = asList(DadosTeste.METALLICA, DadosTeste.JUDAS_PRIEST, DadosTeste.MOLEJAO);

        List<Banda> powerTrios = FiltroBanda.powerTrios(bandas);

        assertThat(powerTrios, is(notNullValue()));
        assertThat(powerTrios, empty());
    }

    @Test public void
    deve_retornar_somente_bandas_com_mais_de_tres_integrantes() {
        List<Banda> powerTrios = FiltroBanda.powerTrios(DadosTeste.TODAS);

        assertThat(powerTrios, Matchers.contains(DadosTeste.RUSH, DadosTeste.CREAM));
    }

    @Test public void
    deve_retornar_somente_bandas_de_pagode() {
        List<Banda> pagodeiros = FiltroBanda.pagodao(DadosTeste.TODAS);

        assertThat(pagodeiros, Matchers.contains(DadosTeste.MOLEJAO));
    }
}
