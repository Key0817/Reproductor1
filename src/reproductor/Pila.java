package reproductor;

public class Pila{
  private int pila[];
  private int TOP;
  private int apunt;
  
  public Pila(){
    pila = new int[101];
    TOP = 100;
    apunt = 0;
  }
  
  public Pila(int tamano){
    pila = new int[tamano +1];
    TOP = tamano;
    apunt = 0;
  }
  
  //condiciones
  public boolean pilaLlena(){
    return apunt == TOP;
  }
  
  public boolean pilaVacia(){
    return apunt == 0;
  }
  
  //Insertar elemento de la pila
  public void insertarElemento(int elemento){
    if(!pilaLlena()){
      apunt++;
      pila[apunt] = elemento;
    }
  }//Fin clase
  
  //Eliminar elemento de la pila
  public int eliminarElemento(){
    int elemento = -1;
    if(!pilaVacia()){
      elemento = pila[apunt--];
    }
    return elemento;
  }
  
  public int getTop(){
    return TOP;
  }//Fin clase
  
  public String mensaje(){
    if(pilaLlena()){
      return "Lo siento, elemento no ingresado. PILA EST� LLENA";
    }else{
      return "Hay casillas disponibles, ingrese el elemento";
    }
  }
  
  public String toString(){
    String sal = "{";
    for(int i = 1; i < apunt; i++){
      sal += pila[i] + ", ";
    }
    sal += "}";
    return sal;
  }
  
  public String toString2()
  {
    String salida="\n";
    for(int i=pila.length-1;i>0;i--){
      salida+=i+"["+pila[i]+"]";
      if(i==pila.length-1){
        salida+="<==TOP";
      }
      if(i==apunt){
        salida+="<==Apunt";
      }
      
      salida+="\n";
    }
    salida+="Apunt="+apunt+"\n";    
    return salida;
  }//fin del metodo toString2
  
}//Fin clase