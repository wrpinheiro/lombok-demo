package filter;

import static model.Estilo.ROCK_N_ROLL;

import java.util.List;

import model.Banda;

public class FiltroPowerTrio implements FiltroBanda {

    private static boolean isPowerTrio(Banda banda) {
        return banda.getEstilo() == ROCK_N_ROLL &&
                banda.getIntegrantes().size() == 3;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroPowerTrio::isPowerTrio);
    }
}
