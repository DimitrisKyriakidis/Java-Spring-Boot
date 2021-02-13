package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String firstName;
	
	@Column(name="user_surname")
	private String lastName;

	@Column(name="user_date")
	private  Date date;

   
	@Column(name="user_homeAdress")
	private String homeAdress;
   
   
	@Column(name="user_workAdress")
	private String workAdress;


	public User() {
		
	}
	
	
	public User(Integer id, String firstName, String lastName, Date date, String homeAdress, String workAdress) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.homeAdress = homeAdress;
		this.workAdress = workAdress;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getHomeAdress() {
		return homeAdress;
	}


	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}


	public String getWorkAdress() {
		return workAdress;
	}


	public void setWorkAdress(String workAdress) {
		this.workAdress = workAdress;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
				+ ", homeAdress=" + homeAdress + ", workAdress=" + workAdress + "]";
	}











}