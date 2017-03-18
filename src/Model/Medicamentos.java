/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucas
 */
public class Medicamentos {
    
    public Medicamentos(){
        
    }//fecha construtor
    
    private int codMed;
    private String nome;
    private String descricao;
    
    //SET
    
    public void setCodMed(int codMed){
        this.codMed = codMed;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void serDescricao(String descricao){
        this.descricao = descricao;
    }
    
    //FECHA SET
    
    //GET
    
    public int getCodMed(){
        return this.codMed;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    //fecha GET
    
    //toString
    
    public String toString(){
        return    "\nCodigo: " + getCodMed()
                + "\nNome: " + getNome()
                + "\nDescricao: " + getDescricao();
    }//fecha toString
}//fecha classe

