/*
 
 */
package eva1_20_static_2;


public class FormulasGeometría {
   
    public static final double pi=3.1415;
//------------------------------------------------------------------------------    
     public static double areaT(double base, double altura){
        return (base*altura)/2;
    } //Área 
 //------------------------------------------------------------------------------   
    public static double areaC(double radio){
        return pi *radio*radio;
    } //Área
  //------------------------------------------------------------------------------  
    public static double perC(double radio){
        return pi*(radio*2);    
    } //Perímetro
  //------------------------------------------------------------------------------  
    public static double volE(double rad){
        return (4.0/3.0)*pi*(rad*rad*rad);
    } //Volumen
 //------------------------------------------------------------------------------   
    
    
    
    

    
}
