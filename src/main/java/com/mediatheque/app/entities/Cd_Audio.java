package com.mediatheque.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Cd_Audio extends SupportElectronique {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String interprete;
}
