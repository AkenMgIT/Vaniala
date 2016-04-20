package net.akensync.vaniala.model.obj;

import java.util.ArrayList;
import java.util.List;

public class Centre {
	private int id;
	private String code;
	private String label;
	private List<Article> listeArticles;
	
	public Centre(){
		this.listeArticles = new ArrayList<Article>();
	}
	
	public Centre(int id, String code, String label) {
		super();
		this.id = id;
		this.code = code;
		this.label = label;
		this.listeArticles = new ArrayList<Article>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<Article> getListeArticles() {
		return listeArticles;
	}
	public void setListeArticles(List<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}
}
