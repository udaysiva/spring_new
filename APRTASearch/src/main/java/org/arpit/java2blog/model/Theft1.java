package org.arpit.java2blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "IIW_MOT_PUBLIC_SEARCH_1718_2")
//@SecondaryTable(name="IIW_MOT_PUBLIC_SEARCH_1718_2")

public class Theft1 {

	//String SENT_TO_RTA;
	@Column(name = "TXT_INSURER")
	String TXT_INSURER;
	@Column(name = "TXT_REG_NUMBER_VEHICLE")
	String TXT_REG_NUMBER_VEHICLE;
	@Column(name = "TXT_CHASSIS_NUMBER")
	String TXT_CHASSIS_NUMBER;
	@Column(name = "TXT_ENGINE_NUMBER")
	String TXT_ENGINE_NUMBER;
	@Column(name = "POLICY_START_DATE")
	String POLICY_START_DATE;
	@Column(name = "POLICY_END_DATE")
	String POLICY_END_DATE;
	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "COUNTRY_SEQ")
	int ID;
	
	
	public Theft1() {
		super();
	}

	public Theft1(String insurer_code, String regnumber, String startdate,String enddate ,int i,String chasis,String eng) {
		super();
	
		this.TXT_REG_NUMBER_VEHICLE = regnumber;
		
		this.ID = i;
		this.TXT_CHASSIS_NUMBER=chasis;
		this.TXT_ENGINE_NUMBER=eng;
		this.POLICY_END_DATE=enddate;
		this.POLICY_START_DATE=startdate;
	}
	public String getTXT_INSURER() {
		return TXT_INSURER;
	}
	public void setTXT_INSURER(String tXT_INSURER) {
		TXT_INSURER = tXT_INSURER;
	}
	public String getTXT_REG_NUMBER_VEHICLE() {
		return TXT_REG_NUMBER_VEHICLE;
	}
	public void setTXT_REG_NUMBER_VEHICLE(String tXT_REG_NUMBER_VEHICLE) {
		TXT_REG_NUMBER_VEHICLE = tXT_REG_NUMBER_VEHICLE;
	}
	public String getTXT_CHASSIS_NUMBER() {
		return TXT_CHASSIS_NUMBER;
	}
	public void setTXT_CHASSIS_NUMBER(String tXT_CHASSIS_NUMBER) {
		TXT_CHASSIS_NUMBER = tXT_CHASSIS_NUMBER;
	}
	public String getTXT_ENGINE_NUMBER() {
		return TXT_ENGINE_NUMBER;
	}
	public void setTXT_ENGINE_NUMBER(String tXT_ENGINE_NUMBER) {
		TXT_ENGINE_NUMBER = tXT_ENGINE_NUMBER;
	}
	public String getPOLICY_START_DATE() {
		return POLICY_START_DATE;
	}
	public void setPOLICY_START_DATE(String pOLICY_START_DATE) {
		POLICY_START_DATE = pOLICY_START_DATE;
	}
	public String getPOLICY_END_DATE() {
		return POLICY_END_DATE;
	}
	public void setPOLICY_END_DATE(String pOLICY_END_DATE) {
		POLICY_END_DATE = pOLICY_END_DATE;
	}
	@JsonIgnore
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	

}
