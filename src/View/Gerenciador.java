/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Medicamentos;
import Model.Pacientes;
import java.util.ArrayList;
import java.util.List;
import util.Menu;
import util.Opcao;

/**
 *
 * @author lucas
 */
public class Gerenciador {
    public static void main(String[] args) {
        
        
       List<Pacientes> listaPaciente = new ArrayList<>();
       List<Medicamentos> listaMedicamento = new ArrayList<>();

       
       Opcao cadPac = new Opcao("Cadastrar Paciente");
       Opcao cadMedicam = new Opcao("Cadastrar Medicamento");
       
       Menu menu = new Menu();
       menu.addOption(cadPac);
       menu.addOption(cadMedicam);

       
       
       
       switch(menu.getOption()){
           case 1:
               
               break;
           case 2:
               
               break;
           default:
               System.out.println("Opcao Invalida!!!");
               break;
           
           
       }
    }//fecha main
}//fecha classe
