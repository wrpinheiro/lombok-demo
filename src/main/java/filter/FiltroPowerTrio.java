package filter;

import static model.Estilo.ROCK_N_ROLL;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Banda;

@Slf4j
public class FiltroPowerTrio implements FiltroBanda {
    private static final Logger LOG = LoggerFactory.getLogger(FiltroPowerTrio.class);

    private static boolean isPowerTrio(Banda banda) {
        return banda.getEstilo() == ROCK_N_ROLL &&
                banda.getIntegrantes().size() == 3;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        log.info("Filtrando power trios...");
        return filterByPredicate(bandas, FiltroPowerTrio::isPowerTrio);
    }
}
