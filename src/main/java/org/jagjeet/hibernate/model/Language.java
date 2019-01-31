package org.jagjeet.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LANGUAGE_TABLE")
public class Language {

	@Id
	@GeneratedValue
	private int languageId;
	private String langageName;

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getLangageName() {
		return langageName;
	}

	public void setLangageName(String langageName) {
		this.langageName = langageName;
	}

}
