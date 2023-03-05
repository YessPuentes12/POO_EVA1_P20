/*

 */
package eva1_20_static_2;


public class EVA1_20_static_2 {


    public static void main(String[] args) {
             final int x;
        
        FormulasGeometría for1=new FormulasGeometría();      
        x=20;
        
        System.out.println("Valor de pi: "+FormulasGeometría.pi);
        System.out.println("Area de triangulo: "+FormulasGeometría.areaT(5.0, 5.0));
        System.out.println("Perímetro círculo: "+FormulasGeometría.perC(8));
        System.out.println("Volumen de esfera: "+FormulasGeometría.volE(10.0));
    }
    
}
