package iib.gov.in.model;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "IIB_TRTA_VIOLATION_DATA_BKP")
@JsonPropertyOrder({"Vehicle Number","Driving License Number","Type of Offence","Date of Offence","points"})
public class Voilation {
	@Column(name= "REGISTRATION_NUMBER")
	String REGISTRATION_NUMBER;
	@Column(name= "DL_NUMBER")
	String DL_NUMBER;
	public String getREGISTRATION_NUMBER() {
		return REGISTRATION_NUMBER;
	}
	public String getDL_NUMBER() {
		return DL_NUMBER;
	}
	public String getVIOLATION_TYPE() {
		return VIOLATION_TYPE;
	}
	public String getPROCESS_DATE() {
		return PROCESS_DATE;
	}
	public String getNUMBER_OF_POINTS() {
		return NUMBER_OF_POINTS;
	}
	public int getSLNO() {
		return SLNO;
	}
	@JsonProperty(value="Vehicle Number")
	public void setREGISTRATION_NUMBER(String rEGISTRATION_NUMBER) {
		REGISTRATION_NUMBER = rEGISTRATION_NUMBER;
	}
	@JsonProperty(value="Driving License Number")
	public void setDL_NUMBER(String dL_NUMBER) {
		DL_NUMBER = dL_NUMBER;
	}
	@JsonProperty(value="Type of Offence")
	public void setVIOLATION_TYPE(String vIOLATION_TYPE) {
		VIOLATION_TYPE = vIOLATION_TYPE;
	}
	@JsonProperty(value="Date of Offence")
	public void setPROCESS_DATE(String pROCESS_DATE) {
		PROCESS_DATE = pROCESS_DATE;
	}
	@JsonProperty(value="points")
	public void setNUMBER_OF_POINTS(String nUMBER_OF_POINTS) {
		NUMBER_OF_POINTS = nUMBER_OF_POINTS;
	}
	@JsonIgnore
	public void setSLNO(int sLNO) {
		SLNO = sLNO;
	}
	@Column(name= "VIOLATION_TYPE")
	String VIOLATION_TYPE;
	@Column(name= "PROCESS_DATE")
	String PROCESS_DATE;
	@Column(name= "NUMBER_OF_POINTS")
	String NUMBER_OF_POINTS;
	@Id
	@Column(name = "SLNO")
	@GeneratedValue(generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "COUNTRY_SEQ")
	int SLNO;
	public Voilation()
	{
		super();
	}
	public Voilation(String regnumber,String dlnumber,String voilatiotype,String processeddate,String numberofpoints,int slno)
	{
		super();
		this.REGISTRATION_NUMBER=regnumber;
		this.DL_NUMBER=dlnumber;
		this.VIOLATION_TYPE=voilatiotype;
		this.PROCESS_DATE=processeddate;
		this.NUMBER_OF_POINTS=numberofpoints;
		this.SLNO=slno;
	}
}
