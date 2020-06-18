package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class controller {
	
	private String hola;
	
	public controller() {
		this.hola = "El bodoque esta bien preciso y es bien dramático";
	}
	
	public String hola() {
		return "hola";
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
	
	
	
	
	
	
	
	
}
