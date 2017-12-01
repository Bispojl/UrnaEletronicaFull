package view;

import java.util.ArrayList;

public class Eleitor {

    private String nome;
    private String cpf;
    private String cep;
    private String rua;
    private String bairro;
    private String nr;

    public Eleitor() {
    }

    public Eleitor(String campoNome,String campoCpf,String campoCep,String campoRua,String campoBairro,String campoNr) {
        this.nome = campoNome;
        this.cpf = campoCpf;
        this.cep = campoCep;
        this.rua = campoRua;
        this.bairro = campoBairro;
        this.nr = campoNr;
    }
    
   

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    ArrayList<String> Eleitores = new ArrayList();
    
    public void CadastrarEleitores(Eleitor eleitores){
        Eleitores.add(nome);
        Eleitores.add(cpf);
        Eleitores.add(cep);
        Eleitores.add(rua);
        Eleitores.add(bairro);
        Eleitores.add(nr);
    }

}
