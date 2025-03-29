package dominio;

import java.util.List;

public class Historia {
    private int idHis;
    private String nome;
    private String descricao;
    private int status;
    private String mestre; //Sem banco]
    private List<String> personagens;

    public Historia(int idHis, String nome, String descricao, int status, String mestre) {
        this.idHis = idHis;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
    }

    public Historia(String nome, String descricao, int status, String mestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
    }

    public Historia(String nome, String descricao, int status, String mestre, List<String> personagens) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.mestre = mestre;
        this.personagens = personagens;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMestre() {
        return mestre;
    }

    public void setMestre(String mestre) {
        this.mestre = mestre;
    }
    
}
