/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 * Esta clase implementa una lista simplemente ligada
 * @author IngridNiño
 *
 */
public class ListaSimplementeLigada<T> {
    private Nodo<T> inicio;
    public ListaSimplementeLigada(){
        inicio=null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    
    public void inserta_inicio(T dato){
        Nodo<T> aux = new Nodo<T>(dato);
		aux.setSiguiente(inicio);
		inicio = aux;
    }
    
    public void inserta_final(T dato){
         Nodo <T> nuevo = new Nodo <T> (dato);
            if(inicio == null){
                inicio = nuevo;
            }else{
         Nodo <T> aux = inicio;
        while(aux.getSiguiente()!=null){
              aux = aux.getSiguiente();
        }
             aux.setSiguiente(nuevo);
        }
    }
    
    public T elimina_primero(){
        Nodo <T> aux = inicio;
        if (inicio == null){
           System.out.println ("Lista vacía.");
        }else{
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);  
        }
        return aux.getDato();

    }
    
    public T elimina_ultimo(){
         if (inicio == null){
           System.out.println ("Lista vacía.");
        } else 
        if (inicio.getSiguiente() == null){
            inicio = null;
            return inicio.getDato();
        }
        Nodo <T> aux = inicio;
        Nodo <T> aux2;
        while(aux.getSiguiente() != null){
            aux2 = aux;
            aux = aux.getSiguiente();
            if (aux.getSiguiente() == null){
                aux2.setSiguiente(null);
            }
        }
        return aux.getDato();
    }
    
    public String recorreIterativo(){
        String s=" ";
        Nodo aux;
        aux=inicio;
        while(aux!=null){
            s+= aux.getDato() + " ";
            aux=aux.getSiguiente();
        }
        return s;
    }
}

