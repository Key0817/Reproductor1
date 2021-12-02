/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

/**
 *
 * @author Keylor, Allison,Johan y Leandro
 */
public class reproductor {
    
    //Atributos, elementos
  private int TOP; //Máximo
  private int Apunt[];
  private String INFO[];
  private int PTR;
  private Pila DISP;
  
  public reproductor(){
    TOP = 7;
    INFO = new String[TOP];
    Apunt = new int[TOP];
    PTR = 0;
    DISP = new Pila(TOP);
    inicializarPila();
  }//Fin constructor
  
  public void inicializarPila(){
    for( int i = 0; i < TOP; i++){ //Clase lista
      DISP.insertarElemento(i);
      
    }
  }//Fin método
  
  public void agregarElemento(String ruta){
     int temp = DISP.eliminarElemento();//saca elemento y disminuye el apunt 1
     INFO[temp]= ruta;
     Apunt[temp] = PTR;
     PTR = temp;    
  }//Fin método
  
  public String eliminarElemento(String cancion){
    int temp = PTR;
    cancion = INFO[temp];
    INFO[temp] = "";
    PTR = Apunt[temp];
    DISP.insertarElemento(temp);  
    Apunt[temp] = 0; //Dentro [] 0, vuelve a su elemento inicial
    return cancion;
  }//Fin método
  
    public String localizarElemento(String nombre){
    String cancion = "";
    for(int i = 0; i < INFO.length; i++){
      if(INFO[i] == nombre){
      cancion = nombre;
      }
    }
    return cancion;
  }//Fin método
  
  public String toString(){
    String salida = "";
    for( int i=1; i < TOP; i++){
      salida += "[" + INFO[i] + "]".substring(0, 27);
    }
      return salida;
    }//Fin método
  
  public String toString2(){
    String salida = "";
    for( int i = 0; i < INFO.length; i++){
      salida += INFO[i] + "\n";
    }
      return salida;
    }//Fin método
    
}
