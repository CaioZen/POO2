package dominio;

public class Usuario {
    private int idUsr;
    private String nome;
    private String celular;
    private String email;
    private String cep;
    private String cidade; //Somente para testes
    private int numeroCasa;
    private String bairro;
    private String referencia;
    private String endereco;

    public Usuario(int idUsr, String nome, String celular, String email, String cep, String cidade, int numeroCasa, String bairro, String referencia) {
        this.idUsr = idUsr;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.referencia = referencia;
    }

    public Usuario(String nome, String celular, String email, String cep, String cidade, int numeroCasa, String bairro, String referencia) {
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.referencia = referencia;
        this.endereco = "Bairro "+bairro+", número "+numeroCasa+" "+referencia;
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
    
}
