/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 631520359
 */
public class Pacientes {
    
    private String nome;
    private int RG;
    private String dataNasc;
    
    
    //SET
    
    public void setNome(String nome){
        this.nome = nome;
    }//fecha setNome
    public void setRG(int RG){
        this.RG = RG;
    }//fecha setRG
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }//fecha setDataNasc
    
    //GET
    
    public String getNome(){
        return this.nome;
    }//fecha getNome
    public int getRG(){
        return this.RG;
    }//fecha getNome
    public String getDataNasc(){
        return this.dataNasc;
    }//fecha getNome
    
    public String toString(){
        return    "\nNome: " + getNome()
                + "\nRG: " + getRG()
                + "\nData de Nascimento: " + getDataNasc();
    }//fecha toString
}//fecha classe
