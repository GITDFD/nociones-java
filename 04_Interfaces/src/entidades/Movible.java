package entidades;

/* una interfaz tiene que estar bien definida y muy bien documentada.
 * 
 * TODOS los metodos son ABSTRACTOS y PUBLICOS se ponga o no en los metodos que declaremos.
 *
 * una interfaz no implementa NADA, solo delaran metodos.
 * 
 * NO se pueden declarar atributos, si se hace deben ser constantes.
 * 
 */

/**
 * @author 	Domingo.
 * @version 1.00
 * @since	24/04/2019
 *
 * Interfaz que hace que los objetos puedan moverse, cada uno como corresponda
 * objetos: coche y persona
 * 
 */

public interface Movible {

/**
 * 	moverse lento hace que el objeto se mueva de manera lenta
 */
	public void moverseLento();
	
/**
 * 	el obeto se movera de forma rapida.
 */
	public void moverseRapido();
	
/**
 * este metodo hace que se mueva una cantidad de metros 
 * @param metros: representa el avance que tendra el objeto
 * @return representa la posicion en la que esta al final el objeto.  
 */
	public int moverse(int metros);
	
}
