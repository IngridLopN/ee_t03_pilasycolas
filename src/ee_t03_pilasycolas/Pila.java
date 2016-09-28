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
public class Pila<T> {
    ListaSimplementeLigada pila;
    
    public Pila(){
        pila = new ListaSimplementeLigada();
    }
    
    public void push(T dato){
        pila.inserta_inicio(dato);
    }
    
    public void peek(){
        System.out.println(pila.getInicio());
    }
    
    public T pop(){
        return (T) pila.elimina_primero();
    }

}
