/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_proyecto;

import com.ricardo.negocio.Usuario;
import java.util.ArrayList;

public class ArrayList_proyecto {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        /*lista.add("JUANITO");
         lista.add("PEDRITO");
         lista.add("CARLITOS");*/
        //OBTENER CANTIDAD DE ELEMENTOS
        //System.out.println("TOTAL:"+lista.size());
        //OBTENER ELEMENTO DE POSICION 1
        // System.out.println("POS 1:"+lista.get(1));
        Usuario u = new Usuario();
        u.setId(1);
        u.setNombre("JUAN");
        u.setApellido("PEREZ");
        lista.add(u);
        /*for (int i = 0; i < lista.size(); i++) {
            System.out.println("LISTA" + lista.get(i).getId());
            System.out.println("LISTA" + lista.get(i).getNombre());
            System.out.println("LISTA" + lista.get(i).getApellido());

        }*/
        for(Usuario user:lista){
            System.out.println("USUARIO:"+user.getId());
            System.out.println("USUARIO:"+user.getNombre());
            System.out.println("USUARIO:"+user.getApellido());
        }
        
        //ELIMINAR ELEMENTO PEDRITO
        //lista.remove(1);

    }
}
