package service;

import javax.ejb.Stateless;

@Stateless
public class CalculadoraIMC {
	public String calcularIMC(Integer idade, Double altura, Double peso) {
		String retorno = "";
		Double imc = peso / (altura * altura);
		if( imc > 30 )

			retorno = "Obesidade";

			else if (imc > 25)

				retorno = "Acima do peso normal";

			else if (imc > 18.5)

				retorno = "Peso normal";

			else

				retorno = "Abaixo do peso normal";
		return retorno;
	}
}
