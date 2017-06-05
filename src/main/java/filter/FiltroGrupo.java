package filter;

import java.util.List;

import model.Banda;

public class FiltroGrupo implements FiltroBanda {

    private static boolean isGrupo(Banda banda) {
        return banda.getIntegrantes().size() > 3;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroGrupo::isGrupo);
    }
}
