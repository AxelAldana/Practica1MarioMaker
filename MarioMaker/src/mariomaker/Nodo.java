/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariomaker;

/**
 *
 * @author axel
 */
public class Nodo {
    private Nodo anterior;
    private int direccion;
    private Nodo siguiente;
    
    public Nodo (){
    }
    
    public Nodo(Nodo ant, int dir, Nodo sig)
    {
        this.anterior = ant;
        this.direccion = dir;
        this.siguiente = sig;
        
    }
    
    public Nodo getAnterior()
    {
        return anterior;
    }
    
    public void setAnterior (Nodo ant)
    {
        this.anterior = ant;
    }
    
    public int getDireccion()
    {
        return direccion;
    }
    
    public void setDireccion (int dir)
    {
        this.direccion = dir;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    
    public void setSiguiente(Nodo sig)
    {
        this.siguiente = sig;
    }
    
    public boolean haysiguiente()
    {
        return siguiente != null;
    }
    
    public boolean hayanterior()
    {
        return anterior != null;
    }
}
