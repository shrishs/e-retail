package com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the service_category database table.
 * 
 */
@Entity
@Table(name="service_category")
public class ServiceCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="pkgenerator",table="config_sequence",pkColumnName="pk_name",pkColumnValue="cat_id",valueColumnName="pk_value",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="pkgenerator")
	@Column(name="cat_id")
	private int catId;

	@Column(name="cat_description")
	private String catDescription;

	@Column(name="cat_name")
	private String catName;

	private String isParentCategory;

    public ServiceCategory() {
    }

	public int getCatId() {
		return this.catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatDescription() {
		return this.catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getIsParentCategory() {
		return this.isParentCategory;
	}

	public void setIsParentCategory(String isParentCategory) {
		this.isParentCategory = isParentCategory;
	}

}