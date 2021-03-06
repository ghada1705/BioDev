package RGFaune;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity (name= "CTA")
@Table (name="\"RG\".\"CTA\"")

@NamedQuery(name="CTA.find", query="SELECT c FROM  CTA c ")


	
public class CTA implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="\"ID\"")
	private int id; 

	
	@Column
	private String intitule; 
	private String description; 
	private String proprietaire; 
	private String brevet;
	private String region; 
	private String preparation;
    private boolean validee; 
    private String image;
    private String ingredients;
	
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isValidee() {
		return validee;
	}
	public void setValidee(boolean validee) {
		this.validee = validee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getBrevet() {
		return brevet;
	}
	public void setBrevet(String brevet) {
		this.brevet = brevet;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPreparation() {
		return preparation;
	}
	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}
	


}
