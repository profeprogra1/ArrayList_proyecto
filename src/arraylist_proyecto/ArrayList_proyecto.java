/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_proyecto;

import java.util.ArrayList;
public class ArrayList_proyecto {
    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        lista.add("JUANITO");
        lista.add("PEDRITO");
        lista.add("CARLITOS");
        //OBTENER CANTIDAD DE ELEMENTOS
        //System.out.println("TOTAL:"+lista.size());
        //OBTENER ELEMENTO DE POSICION 1
       // System.out.println("POS 1:"+lista.get(1));
        for(int i=0;i<lista.size();i++){
            System.out.println("LISTA"+lista.get(i));
        }
        
        
    }
}
