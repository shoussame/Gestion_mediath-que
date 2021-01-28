package com.mediatheque.app.entities;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import lombok.Data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Pret {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date dateEmprunt;
	private Oeuvre oeuvre;
}
