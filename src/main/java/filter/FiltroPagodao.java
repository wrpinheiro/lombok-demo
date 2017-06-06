package filter;

import static model.Estilo.PAGODAO;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

import model.Banda;

@Slf4j
public class FiltroPagodao implements FiltroBanda {

    private static boolean isPagodao(Banda banda) {
        return banda.getEstilo() == PAGODAO;
    }

    @Override
    public List<Banda> filtrar(List<Banda> bandas) {
        log.info("Filtrando pagodao...");
        return filterByPredicate(bandas, FiltroPagodao::isPagodao);
    }
}
