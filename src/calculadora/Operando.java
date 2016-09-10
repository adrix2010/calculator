 
package calculadora;

public abstract class Operando implements Operaciones {
 double numA,numB,Res;

 

 
   
   
 
    public abstract double suma(double numA, double numB);

   
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
    
    public abstract double coseno (double numA);
    
    
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
}


