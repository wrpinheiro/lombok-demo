package filter;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;

import model.Banda;

public interface FiltroBanda {
    List<Banda> filtrar(List<Banda> bandas);

    default List<Banda> filterByPredicate(List<Banda> bandas, Predicate<Banda> predicate) {
        return bandas.stream().filter(predicate).collect(toList());
    }
}
