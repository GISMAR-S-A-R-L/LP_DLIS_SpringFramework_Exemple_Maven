package fr.iutv.spring_framework.exemple_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Voiture {

	String marque;

	String modele;

	String plaque;

	@Autowired
	Conducteur conducteur;

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getPlaque() {
		return this.plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

	public Conducteur getConducteur() {
		return conducteur;
	}

	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	public String info() {
		return "Plaque:" + this.plaque + ", Marque:" + this.marque + ", Modele: " + this.modele + ", Conducteur:[ "
				+ this.conducteur.info() + "]";
	}

}
