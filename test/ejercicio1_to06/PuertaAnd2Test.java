package ejercicio1_to06;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Rosalía López Romero
 */
public class PuertaAnd2Test {
  
  public PuertaAnd2Test() {
  }

  /**
   * Test para el método Equals para ver si dos objetos son iguales.
   * En este caso se han elegido dos objetos iguales, por lo que el
   * test debe devolver true.
   */
  
  @Test
  public void testEqualsDebeDarTrue() {
    System.out.println("Test para comparar dos objetos cuando los dos son iguales.");
    PuertaAnd2 puertaAnd = new PuertaAnd2(true);
    PuertaAnd2 instance = new PuertaAnd2(true);
    boolean expResult = true;
    boolean result = instance.equals(puertaAnd);
    assertEquals(expResult, result);
  }
  
  /**
   * Test para el método Equals para ver si dos objetos son iguales.
   * En este caso se han elegido dos objetos diferentes, por lo que el
   * test debe devolver false.
   */
  
  @Test
  public void testEqualsDebeDarFalse() {
    System.out.println("Test para comparar dos objetos cuando no son iguales.");
    PuertaAnd2 puertaAnd = new PuertaAnd2(true);
    PuertaAnd2 instance = new PuertaAnd2(false);
    boolean expResult = false;
    boolean result = instance.equals(puertaAnd);
    assertEquals(expResult, result);
  }

  /**
   * Test para el método getSalida cuando las entradas son 00,
   * es decir, ambas falsas. Por tanto el test debe devolver false.
   */
  
  @Test
  public void testGetSalida00() {
    System.out.println("testGetSalida00");
    PuertaAnd2 instance = new PuertaAnd2(false, false);
    boolean expResult = false;
    boolean result = instance.getSalida();
    assertEquals(expResult, result);
  }
 
  /**
   * Test para el método getSalida cuando las entradas son 01,
   * es decir, una falsa y otra verdadera. Por tanto el test debe devolver false.
   */
  
  @Test
  public void testGetSalidaPara01() {
    System.out.println("testGetSalida01");
    PuertaAnd2 instance = new PuertaAnd2(false, true);
    boolean expResult = false;
    boolean result = instance.getSalida();
    assertEquals(expResult, result);
  }
  
  /**
   * Test para el método getSalida cuando las entradas son 10,
   * es decir, una falsa y otra verdadera. Por tanto el test debe devolver false.
   */
  
  @Test
  public void testGetSalidaPara10() {
    System.out.println("testGetSalida10");
    PuertaAnd2 instance = new PuertaAnd2(true, false);
    boolean expResult = false;
    boolean result = instance.getSalida();
    assertEquals(expResult, result);
  }

  /**
   * Test para el método getSalida cuando las entradas son 11,
   * es decir, ambas verdaderas. Por tanto el test debe devolver true.
   */
  
  @Test
  public void testGetSalidaPara11() {
    System.out.println("testGetSalida11");
    PuertaAnd2 instance = new PuertaAnd2(true, true);
    boolean expResult = true;
    boolean result = instance.getSalida();
    assertEquals(expResult, result);
  }
  
  /**
   * Test para el método toString. Se le ha aplicado el constructor sin parámetros, 
   * por lo que debe devolver un String con el nombre de la puerta y su valor,
   * en este caso, ambos false.
   */
  
  @Test
  public void testToString() {
    System.out.println("Test toString");
    PuertaAnd2 instance = new PuertaAnd2();
    String expResult = "A: false B: false";
    String result = instance.toString();
    assertEquals(expResult, result);
  }

}
