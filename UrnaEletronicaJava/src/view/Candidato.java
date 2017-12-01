
package view;

import java.util.ArrayList;


public class Candidato {
    
    
    
    
    private String nome;
    private String partido;
    private String numero;

    public Candidato() {
    }

    public Candidato(String campoNome, String campoPartido, String campoNumero) {
        this.nome = campoNome;
        this.partido = campoPartido;
        this.numero = campoNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String Partido) {
        this.partido = Partido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    ArrayList candidato = new ArrayList();
    
    public void CadastrarCandidato(Candidato candidatos){
       candidato.add(nome);
       candidato.add(partido);
       candidato.add(numero);
    
    
}}

