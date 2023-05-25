package model;

import java.io.Serializable;

public final class TrianguloBean implements Serializable {
   
    private float base;
    private float altura;
    private float area;
 
    public TrianguloBean()
    {
        
    }
   
    public float getBase(){
        return base;
    }
   
    public void setBase(float base){
        this.base = base;
    }
   
    public float getAltura(){
        return altura;
    }
   
     public void setAltura(float altura){
        this.altura = altura;
    }
     
     public float getArea(){
        return area;
    }
   
     public void setArea(float area){
        this.area = area;
    }
 
}