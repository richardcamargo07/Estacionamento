/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;


public class Teste {
    public static void main(String[] args) {
        Connection conn = Conection.abrirConexao();
        
        CarroBean cb = new CarroBean(); 
 
        CarroDAO cd = new CarroDAO(conn);
 
        //Testando método inserir 
        /*cb.setPlaca("TKL3897"); 
        cb.setCor("Vermelho"); 
        cb.setDescricao("Carro 1"); 
 
        System.out.println(cd.inserir(cb));*/
        
        /*cb.setPlaca("JKL2897"); 
        cb.setCor("Amarelo");         
        cb.setDescricao("Carro 3");         
        System.out.println(cd.alterar(cb));*/
        
        /*cb.setPlaca("JKL2897");
        System.out.println(cd.excluir(cb));*/
        
        List<CarroBean> lista = cd.listarTodos(); 
 
        if(lista != null){ 
            for(CarroBean carro : lista){ 
                System.out.println("Placa: "+carro.getPlaca()); 
                System.out.println("Cor: "+carro.getCor()); 
                System.out.println("Descrição: "+carro.getDescricao());
    }
        }
}
}