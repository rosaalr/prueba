package ejercicio1_to06;
/**
 *
 * @author Rosalía López Romero
 */

public class PuertaAnd2 {

  /**
   * @param a. Representa una de las entradas.
   */
  private boolean a;
  
  /**
   * @param b. Representa una de las entradas.
   */
  private boolean b;
  
  //CONSTRUCTORES
  public PuertaAnd2(){
    a = false;
    b = false;  
  }
  
  /**
   * @param in Entrada de la puerta lógica.
   */
  public PuertaAnd2(boolean in){
    a = in;
    b = in;
  } 
  
  /**
   * @param a valor que se le da a la entrada de la puerta lógica.
   * @param b valor que se le da a la entrada de la puerta lógica.
   */
  public PuertaAnd2(boolean a, boolean b){
    this.a = a;
    this.b = b;
  }
  
  //GETTER
  public boolean getA() {
    return a;
  }

  public boolean getB() {
    return b;
  }  
  
  //SETTER
  /**
   * @param a Valor al cual se va a cambiar el valor de la entrada.
   */
  public void setA(boolean a) {
    this.a = a;
  }

  /**
   * @param b  Valor al cual se va a cambiar el valor de la entrada.
   */ 
  public void setB(boolean b) {
    this.b = b;
  } 
  
  //MÉTODO PARA COMPARAR
  
  /**
   * @param o Objeto a comparar.
   * @return devuelve verdadero o falso en función del resultado de la comparación.
   */
 @Override
  public boolean equals (Object o){
    if (o instanceof PuertaAnd2) {
      PuertaAnd2 puertaAnd = (PuertaAnd2) o;
   // (PuertaAnd2) es un casting de tipo para obligar a que sea objeto de la clase
      return a == puertaAnd.getA() && b == puertaAnd.getB();
    }
   return false;
  }
  
//MÉTODO SALIDA
  
  /**
   * @return devuele el valor de la salida.
   */
  public boolean getSalida(){
    return getA() && getB();
  }

//MÉTODO TO STRING 
  
  /**
   * @return devuelve un String con el valor de cada puerta.
   */
  @Override
  public String toString(){
    return "A: " + getA() +" B: " + getB();
  }
}
