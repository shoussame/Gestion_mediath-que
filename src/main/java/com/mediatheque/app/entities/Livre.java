package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Livre extends SupportPapier{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String isbn;
	private String titreOriginal;

	public Livre(String isbn) {
		super();
		super.setType("LIVRE");
		this.isbn = isbn;
	}
	
}
