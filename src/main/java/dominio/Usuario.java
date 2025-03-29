package dominio;

public class Usuario {
    private int idUsr;
    private String nome;
    private String celular;
    private String email;
    private String cep;
    private String cidade; //Sem banco
    private String uf; //Sem banco
    private int numeroCasa;
    private String rua;
    private String bairro;
    private String referencia;
    private String endereco;

    public Usuario(int idUsr, String nome, String celular, String email, String cep, String cidade, String uf, int numeroCasa, String rua, String bairro, String referencia) {
        this.idUsr = idUsr;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numeroCasa = numeroCasa;
        this.rua = rua;
        this.bairro = bairro;
        this.referencia = referencia;
    }

    public Usuario(String nome, String celular, String email, String cep, String cidade, String uf, int numeroCasa, String rua, String bairro, String referencia) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.numeroCasa = numeroCasa;
        this.rua = rua;
        this.bairro = bairro;
        this.referencia = referencia;
        this.endereco = "Rua "+rua+", Número "+numeroCasa;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public int getIdUsr() {
        return idUsr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + '}';
    }
    
}
