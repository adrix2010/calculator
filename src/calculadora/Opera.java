/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public  class Opera extends Operando implements Operaciones{
    
     double numA,numB,Res;

 

 
   
   
 


   
 @Override
    public double multi(double numA, double numB){
    Res= numA*numB;   
    return Res;  
    }
    
 @Override
    public double dividir(double numA, double numB){
        Res=  (numA/numB);
        return Res;
    }
    
 @Override
    public double restar(double numA, double numB){
        Res=numA-numB;
        return Res;
    }
    
 @Override
    public double potencia(double numA, double numB){
       Res=Math.pow(numA, numB);
       return  Res;
    }
    
 @Override
    public double raiz(double numA){
     Res=  Math.sqrt(numA);
        return Res;
    }
    
 @Override
    public double tangente(double numA){
        Res= Math.tan(numA);
        return Res;
    }
    

    
    
 @Override
   public double maximo(double numA, double numB){
       Res = Math.max(numA, numB);
       return Res;
   }
   
 @Override
   public double logaritmo(double numA){
    Res = Math.log10(numA);
    return Res;
    
   }
    
    @Override
    public double suma(double numA, double numB){
    Res= numA+numB;   
    return Res; 
    }
    
    @Override
    public double coseno (double numA){
        Res= Math.cos(numA);
        return Res;
    }

   


}
