/**
 * 
 * Esta clase nos indicará la medida total de la circunferencia, su radio y su diametro
 * @author David García Reviejo
 * @version 05/02/2020/A
 */
package Practica;
/**
 * 
 * Constructor de la clase y sus parámetros declarados.
 */
public class Circulo implements Diametro {
	double centroX;
	double centroY;
	double radio;
	
	
	/**
	 * 
	 * @param cx El parámetro cx define donde estará el centroX en el circulo
	 * @param cy El parámetro cy indicará donde se encuentra el centroY en el circulo
	 * @param r Este parámetro nos dirá el radio del circulo 
	 */
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
		}
	
	
	/**
	 *
	 * @return Con este método podremos saber lo que mide la circunferencia
	 */
	public double getCircunferencia() {
		return 2 * 3.14159 * radio;
		}
	
	
	/**
	 * 
	 * @return Este método nos devuelve el area del circulo
	 */
	public double getArea() {
		
		return 3.14159 * radio * radio;
		}
	
	
	/**
	 * 
	 * @return El método nos devolverá el diametro de la circunferencia
	 */
	public double getDiametro() {
		return 2 * radio;
		}
	
	
	/**
	 * 
	 * @param deltaX Con este parámetro podemos mover X
	 * @param deltaY Con este parámetro podemos mover Y
	 */
	public void mover(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
		}
	
	
	/**
	 * 
	 * @param s Para hacer más grande la escala del circulo se multiplica por el parámetro s
	 */
	public void escalar(double s) {
		radio = radio * s;
		}
	
}