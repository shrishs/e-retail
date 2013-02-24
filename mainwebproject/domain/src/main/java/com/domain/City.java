package com.domain;


import com.domain.CityLocation;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: City
 *
 */
@Entity
@Table(name="cities")
@NamedQueries({
	@NamedQuery(name = "Cities.findAll", query = "SELECT cities FROM City cities"),
 @NamedQuery(name = "Cities.findById",query = "SELECT city FROM City city WHERE city.cityid = :cityid")
})

public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	public City() {
		super();
	}

		
@Id
//@SequenceGenerator(name = "CITY_ID_GENERATOR", sequenceName = "SEQ_CITY_ID")
//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CITY_ID_GENERATOR")
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="city_id",nullable=false,unique=true)	
private int cityid;


@Column(name="city_name")
private String cityName;


//bi-directional many-to-one association to CityLocation
@OneToMany(mappedBy="city", fetch=FetchType.EAGER)
private Set<CityLocation> cityLocations;

public int getCityid() {
	return cityid;
}

public void setCityid(int cityid) {
	this.cityid = cityid;
}



	public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}


public Set<CityLocation> getCityLocations() {
	return this.cityLocations;
}

public void setCityLocations(Set<CityLocation> cityLocations) {
	this.cityLocations = cityLocations;
}

   
}
