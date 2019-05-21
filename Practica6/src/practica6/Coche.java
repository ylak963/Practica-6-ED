package practica6;
/**
 * 
 * @author kaly
 *@version 1.3
 */
public class Coche {
	
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	
	
	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}
	/**
	 * 
	 * @return Devuelve el nombre de la matricula
	 */
	public String getMatricula() {
		/**
		 * 
		 */
		return matricula;
	}
/**
 * 
 * @param matricula Cadena matricula que recibe
 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * 
	 * @return Devuelve el tipo de combustible
	 */
	public String getAtrib() {
		return atrib;
	}
	/**
	 * 
	 * @param atrib El parametro atrib indica que tipo de combustible es.
	 */
	public void setAtrib(String atrib) {
		this.atrib = atrib;
	}
	/**
	 * 
	 * @return Devuelve el nombre del modelo
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * 
	 * @param modelo Devuelve el nombre del modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * 
	 * @return Devuelve el nombre del fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	
	/**
	 * 
	 * @param fabricante Indica que el nombre del fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * 
	 * @param m parámetro matricular a inicializar
	 * @param c parámetro atributo a inicializar
	 * @param mo parámetro modelo a inicializar
	 * @param f parámetro fabricante a inicializar
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * 
	 * @return Devuelve el resultado con el modelo y fabricante, dependiendo del tipo de combustible. 
	 */
	public String metodo2() {
		
		
		String resultado = "El coche con matricula " + matricula + " ";
		switch(atrib)
		{
		case"Gasolina":
			resultado += metodoA(modelo, fabricante);
			break;
		
		case"Diesel":
			resultado += metodoB(modelo, fabricante);
			break;
		case"Híbrido":
			resultado += metodoC(modelo, fabricante);
			break;
		
		default:
			resultado = "El coche no incluye matricula " + matricula + " ";
			
			break;
		}
		return resultado;
			
		/**
		 * @deprecated Métodos que no se deben utilizar
		 * 
		 public String metodo1(){
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "Híbrido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de información";
		}
		
		return resultado;
	}*/
	}
	/**
	 * 
	 * @param  modelo es el nombre del modelo
	 * @param fabricante es el nombre del fabricante
	 * @return Muestra por pantalla un mensaje establecido sobre el modelo y fabricante.
	 */
	private String metodoC(String modelo, String fabricante) {
		String resultado ="es un" + fabricante + " "+ modelo+ " y no necesita combustible";
		return resultado;
	}
	/**
	 * 
	 * @param modelo es el nombre del modelo 
	 * @param fabricante es el nombre del fabricante
	 * @return Muestra por pantalla un mensaje establecido sobre el modelo y fabricante.
	 */
	private String metodoB(String modelo, String fabricante) {
		String resultado ="es un " + fabricante + " "+ modelo+ " y gasta 1,052 euros por litros";
		return resultado;
	}
	/**
	 * 
	 * @param modelo es el nombre del modelo
	 * @param fabricante es el nombre del fabricante
	 * @return Muestra por pantalla un mensaje establecido sobre el modelo y fabricante.
	 */
	private String metodoA(String modelo, String fabricante) {
		String resultado ="es un " + fabricante + " "+ modelo+ " y gasta 1,337 euros por litros";
		return resultado;
	}
}
