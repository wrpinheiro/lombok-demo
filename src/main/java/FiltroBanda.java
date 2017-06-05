import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;

public final class FiltroBanda {
    private FiltroBanda() {
    }

    private static boolean isPowerTrio(Banda banda) {
        return banda.getEstilo() == Estilo.ROCK_N_ROLL &&
                banda.getIntegrantes().size() == 3;
    }

    private static boolean isGrupo(Banda banda) {
        return banda.getIntegrantes().size() > 3;
    }

    private static boolean isPagodao(Banda banda) {
        return banda.getEstilo() == Estilo.PAGODAO;
    }

    private static List<Banda> filterByPredicate(List<Banda> bandas, Predicate<Banda> predicate) {
        return bandas.stream().filter(predicate).collect(toList());
    }

    public static final List<Banda> powerTrios(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroBanda::isPowerTrio);
    }

    public static final List<Banda> grupos(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroBanda::isGrupo);
    }

    public static final List<Banda> pagodao(List<Banda> bandas) {
        return filterByPredicate(bandas, FiltroBanda::isPagodao);
    }
}
