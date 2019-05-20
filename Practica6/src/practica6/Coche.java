package practica6;

public class Coche {
	String matricula;
	String atrib;
	String modelo;
	String fabricante;

	//Incluir los get y set, es decir encapsular atributos
	
	public Coche() {
		matricula = "";
		atrib = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		//Se repite resultado y la matricula en todos los if, es decir duplicidad de codigo
		//Caso con switch? 
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
	}
}
