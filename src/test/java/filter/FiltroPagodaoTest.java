package filter;

import static dadosteste.DadosTeste.MOLEJAO;
import static dadosteste.DadosTeste.TODAS;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import model.Banda;

public class FiltroPagodaoTest {

    private FiltroPagodao filterPagodao;

    @Before
    public void setup() {
        this.filterPagodao = new FiltroPagodao();
    }

    @Test
    public void
    deve_retornar_somente_bandas_de_pagode() {
        List<Banda> pagodeiros = filterPagodao.filtrar(TODAS);

        assertThat(pagodeiros, Matchers.contains(MOLEJAO));
    }
}
