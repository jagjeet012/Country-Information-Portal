package org.jagjeet.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_TABLE")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	private String countryName;
	@OneToMany
	@JoinTable(name = "COUNTRY_LANGUAGE", joinColumns = @JoinColumn(name = "LANGUAGE_NAME"))
	private Collection<Language> langauge = new ArrayList<Language>();
	@OneToMany
	@JoinTable(name = "COUNTRY_SPORT", joinColumns = @JoinColumn(name = "SPORT_NAME"))
	private Collection<Sport> sport = new ArrayList<Sport>();

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Collection<Language> getLangauge() {
		return langauge;
	}

	public void setLangauge(Collection<Language> langauge) {
		this.langauge = langauge;
	}

	public Collection<Sport> getSport() {
		return sport;
	}

	public void setSport(Collection<Sport> sport) {
		this.sport = sport;
	}

}
