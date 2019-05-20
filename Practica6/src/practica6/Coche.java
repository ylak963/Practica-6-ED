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
		case"H�brido":
			resultado += metodoc(modelo, fabricante);
			break;
		
		default:
			resultado = "El coche no incluye matricula " + matricula + " ";
			
			break;
		}
		
		
		
		
		/*
		if (atrib == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (atrib == "Diesel") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoB(modelo, fabricante);
		} else if (atrib == "H�brido") {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += metodoC(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " ";
			resultado += "no dispone de informaci�n";
		}
		
		return resultado;
	}*/
}
