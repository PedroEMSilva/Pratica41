/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Cliente
 */
public class Circulo extends Elipse {
    
    public Circulo(double r,double s){
           super(r,r);
}
    public Circulo (double r){
        super(r,r);
        
    }
    @Override
    public double getPerimetro(){
        return Math.PI*getR()*2;
        }
    
    
    
    
}
