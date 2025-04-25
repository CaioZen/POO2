package dominio;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Historia {
    private int idHis;
    private String nome;
    private String descricao;
    private int status;
    private Usuario mestre;

    public Historia(String nome, String descricao, int status, Usuario mestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
    }
}
