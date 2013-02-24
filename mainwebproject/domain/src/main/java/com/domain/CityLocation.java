package com.domain;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the city_locations database table.
 * 
 */
@Entity
@Table(name="city_locations")
public class CityLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="loc_id")
	private int locId;

	@Column(name="loc_name")
	private String locName;

	@Column(name="loc_pin")
	private int locPin;

	//bi-directional many-to-one association to City
    @ManyToOne
	@JoinColumn(name="city_id")
	private City city;

    public CityLocation() {
    }

	public int getLocId() {
		return this.locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}

	public String getLocName() {
		return this.locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public int getLocPin() {
		return this.locPin;
	}

	public void setLocPin(int locPin) {
		this.locPin = locPin;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}