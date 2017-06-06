package model;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Banda {
    private String nome;
    private Estilo estilo;

    @Singular
    private List<String> integrantes;
}
