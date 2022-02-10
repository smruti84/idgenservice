package com.skp.IdGeneration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Generated_Id")
public class GeneratedID {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long generated_id ;
	@Column
	private String request_id ;
	@Column
	private String created_date;
	@Column
	private String updated_date ;
	@Column
	private String type;
	public long getGenerated_id() {
		return generated_id;
	}
	public void setGenerated_id(long generated_id) {
		this.generated_id = generated_id;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 


}
