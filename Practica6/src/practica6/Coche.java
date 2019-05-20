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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAtrib() {
		return atrib;
	}

	public void setAtrib(String atrib) {
		this.atrib = atrib;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		atrib = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		
		//Se repite resultado y la matricula en todos los if, es decir duplicidad de codigo
		//Caso con switch? 
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
			
		/*
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

	private String metodoC(String modelo, String fabricante) {
		String resultado ="es un" + fabricante + " "+ modelo+ " y no necesita combustible";
		return resultado;
	}

	private String metodoB(String modelo, String fabricante) {
		String resultado ="es un " + fabricante + " "+ modelo+ " y gasta 1,052 euros por litros";
		return resultado;
	}

	private String metodoA(String modelo, String fabricante) {
		String resultado ="es un " + fabricante + " "+ modelo+ " y gasta 1,337 euros por litros";
		return resultado;
	}
}
