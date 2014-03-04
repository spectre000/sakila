package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Language implements Serializable{
	
	private static final long serialVersionUID = -7968966551254483196L;
	
	private long languageId;
	private String name;
	private Date lastUpdate;
	
	public long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
