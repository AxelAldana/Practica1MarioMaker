/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariomaker;
import mariomaker.Nodo;

/**
 *
 * @author axel
 */
public class ListaD {
    
    Nodo inicio;
    int tamaño;
    
    public boolean agregar(int direccion)
    {
        if (inicio==null)
        {
            inicio = new Nodo (null, direccion, null);
            tamaño ++;
            return true;
        } else{
            Nodo temp=inicio;
            while(temp.haysiguiente()){
                temp=temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(temp,direccion,null));
            tamaño++;
            return true;
        }
    }
    
    
    public void insertarInicio(Integer direccion){
            Nodo nuevo = new Nodo(null, direccion, null);
            if(inicio==null){
            inicio=nuevo;
            }else{
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
            }
            }
    
    
    
    public void insertarFinal(Integer direccion){
            Nodo nuevo = new Nodo(null,direccion, null);
            if(inicio == null){
            inicio = nuevo;
            }else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
           
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

            }
           
            }
    
    /*ELIMINAR*/
    
    public void eliminaValor(Integer valor){
                        if (inicio != null){
                                   Nodo aux = inicio;
                                   Nodo ant = null;
                                   while (aux != null){
                                               if (aux.getDireccion() == valor ){
                                                           if (ant == null){
                                                                       inicio = inicio.getSiguiente();
                                                                       aux.setSiguiente(null);
                                                                       aux= inicio;
                                                          
                                                           }else {
                                                                       ant.setSiguiente(aux.getSiguiente());
                                                                       aux.setSiguiente(null);
                                                                       aux = ant.getSiguiente();
                                                           }                                             
                                                           }else{
                                                                       ant = aux;
                                                                       aux = aux.getSiguiente();
                                                           }
                                               }
                                   }
                                  
                        }
    
    
    
    /*******************                      BUSCAR                    ***********************/
    
                public void buscar(Integer valor){
                        if (inicio != null){
                                   Nodo aux = inicio;
                                  
                                   int cont = 0;
                                   while (aux != null){
                                               if (aux.getDireccion()== valor ){
                                                           cont++;
                                                           aux = aux.getSiguiente();
                                                          
                                               }
                                  
                                   }                     
                                  
                                              
                       
                        }
                       
                        }
    
    
    
    
    
    
    
    public int contarizquierda(int direcciondelnodo)
    {
        Nodo aux = inicio;
        int izquierda = 0;
        
        while(aux != null)
        {
            if (aux.getDireccion()!=direcciondelnodo)
            {
                aux = aux.getSiguiente();
            } else if( aux.getDireccion()== direcciondelnodo)
            {
                while(aux.getAnterior()!= null)
                {
                    izquierda++;
                    aux = aux.getAnterior();
                }
                return izquierda;
            }
            
        }
        return -1;
    }
    
    
    public int contarderecha(int direcciondelnodo)
    {
        Nodo aux = inicio;
        int derecha = 0;
        
        while(aux != null)
        {
            if (aux.getDireccion()!=direcciondelnodo)
            {
                aux = aux.getSiguiente();
            } else if( aux.getDireccion()== direcciondelnodo)
            {
                while(aux.getSiguiente()!= null)
                {
                    derecha++;
                    aux = aux.getSiguiente();
                }
                return derecha;
            }
            
        }
        return -1;
    }
    
}
