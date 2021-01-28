package com.mediatheque.app.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Support {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Collection<Oeuvre> oeuvres;
}
