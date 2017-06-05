package filter;

import static dadosteste.DadosTeste.CREAM;
import static dadosteste.DadosTeste.JUDAS_PRIEST;
import static dadosteste.DadosTeste.METALLICA;
import static dadosteste.DadosTeste.MOLEJAO;
import static dadosteste.DadosTeste.RUSH;
import static dadosteste.DadosTeste.TODAS;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.io.FileNotFoundException;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import model.Banda;

public class FiltroPowerTrioTest {
    private FiltroPowerTrio filterPowerTrio;

    @Before
    public void setup() {
        this.filterPowerTrio = new FiltroPowerTrio();
    }

    @Test
    public void
    deve_retornar_lista_vazia_quando_nao_encontrou_trios() throws FileNotFoundException {
        List<Banda> bandas = asList(METALLICA, JUDAS_PRIEST, MOLEJAO);

        List<Banda> powerTrios = filterPowerTrio.filtrar(bandas);

        assertThat(powerTrios, is(notNullValue()));
        assertThat(powerTrios, empty());
    }

    @Test
    public void
    deve_retornar_somente_bandas_com_mais_de_tres_integrantes() {
        List<Banda> powerTrios = filterPowerTrio.filtrar(TODAS);

        assertThat(powerTrios, Matchers.contains(RUSH, CREAM));
    }
}
