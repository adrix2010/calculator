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
public interface Operaciones {
    public double multi(double numA, double numB);
    public double dividir(double numA, double numB);
    public double restar(double numA, double numB);
    public double raiz(double numA);
    public double potencia(double numA, double numB);
    public double tangente(double numA);
    public double logaritmo(double numA);
    public double maximo(double numA,double numB);
}
