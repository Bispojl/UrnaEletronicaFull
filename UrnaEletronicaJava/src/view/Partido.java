
package view;

import java.util.ArrayList;

public class Partido {
    
    private String nome;

    public Partido() {
    }

    public Partido(String campoNome) {
        this.nome = campoNome;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    ArrayList Partidos = new ArrayList();
    
    public void CadastrarPartido(Partido partidos){
       Partidos.add(nome);
       
    
    
    
    
}}
