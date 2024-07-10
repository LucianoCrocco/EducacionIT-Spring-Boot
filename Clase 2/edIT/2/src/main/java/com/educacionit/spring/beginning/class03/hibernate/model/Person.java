
package com.educacionit.spring.beginning.class03.hibernate.model;
//CREATE TABLE `cafe`.`person` (
//`id` INT NOT NULL,
//`name` VARCHAR(45) NULL,
//`country` VARCHAR(45) NULL,
//PRIMARY KEY (`id`));
//ALTER TABLE `cafe`.`person` 
//CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"PERSON\"", schema="cafe")
public class Person {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString(){
		return "id="+id+", name="+name+", country="+country;
	}
}
