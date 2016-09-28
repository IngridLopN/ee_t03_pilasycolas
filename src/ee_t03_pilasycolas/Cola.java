/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author IngridNiño
 */
public class Cola<T> {
    ListaSimplementeLigada cola;
    
    public Cola(){
        cola = new ListaSimplementeLigada();
    }
    
    public void insertar(T dato){
        cola.inserta_final(dato);
        System.out.println(dato);
    }
    
    public T eliminar(){
        return (T) cola.elimina_primero();
    }
}
