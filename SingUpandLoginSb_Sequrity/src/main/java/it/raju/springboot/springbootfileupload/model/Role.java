package it.raju.springboot.springbootfileupload.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Role {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(length = 60)
	    private String name;
}
