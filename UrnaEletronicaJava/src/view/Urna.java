
package view;

import java.util.ArrayList;


public class Urna {
    
    private String cpf;
    private String numero;

    public Urna() {
    }

    public Urna(String campoCpf, String campoNumero) {
        this.cpf = campoCpf;
        this.numero = campoNumero;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
        ArrayList numerodeVotos = new ArrayList();
        
        
        public void SomandoVotos(Urna votos){
            numerodeVotos.add(cpf);
            numerodeVotos.add(numero);
        }
        
        public String numerodevotos(){
            return numerodeVotos.size()+"";
        }
        
        
        
        }
        
    
    
    
    

