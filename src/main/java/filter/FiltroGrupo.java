package filter;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

import model.Banda;

@Slf4j
public class FiltroGrupo implements FiltroBanda {

    private static boolean isGrupo(Banda banda) {
        return banda.getIntegrantes().size() > 3;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        log.info("Filtrando grupos...");
        return filterByPredicate(bandas, FiltroGrupo::isGrupo);
    }
}
