package beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import service.CalculadoraIMC;

@Named("myBean")
@SessionScoped
public class ManageBean implements Serializable{
	
	@Inject
	private CalculadoraIMC calculadora;
	
	private Integer idade;
	private Double altura;
	private Double peso;
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getResult() {
		if(getIdade() == null || getAltura() == null || getPeso() == null) {
			return "Preencha os dados";
		}
		return calculadora.calcularIMC(getIdade(),getAltura(),getPeso());
	}
	
}
