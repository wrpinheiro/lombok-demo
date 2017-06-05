package filter;

import static model.Estilo.PAGODAO;

import java.util.List;

import model.Banda;

public class FiltroPagodao implements FiltroBanda {

    private static boolean isPagodao(Banda banda) {
        return banda.getEstilo() == PAGODAO;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroPagodao::isPagodao);
    }
}
