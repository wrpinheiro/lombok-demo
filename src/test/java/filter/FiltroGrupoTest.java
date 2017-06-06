package filter;

import static dadosteste.DadosTeste.JUDAS_PRIEST;
import static dadosteste.DadosTeste.METALLICA;
import static dadosteste.DadosTeste.MOLEJAO;
import static dadosteste.DadosTeste.TODAS;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import model.Banda;

public class FiltroGrupoTest {

    private FiltroGrupo filterGrupo;

    @Before
    public void setup() {
        this.filterGrupo = new FiltroGrupo();
    }

    @Test
    public void
    deve_retornar_somente_bandas_de_pagode() {
        List<Banda> pagodeiros = filterGrupo.filtrar(TODAS);

        assertThat(pagodeiros, Matchers.contains(METALLICA, JUDAS_PRIEST, MOLEJAO));
    }
}
