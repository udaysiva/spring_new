package iib.gov.in.eo;

import java.util.Date;

@javax.persistence.Entity(name = "IIB_VIOLATION_QUERY_DETAILS")
@org.hibernate.annotations.Entity(dynamicInsert = true)
public class ServiceReequestEO {
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID")
	private int Id;
	@javax.persistence.Column(name = "USER_ID")
	private String userId;
	@javax.persistence.Column(name = "SEARCH_DETAILS")
	private String searchDetails;
	@javax.persistence.Column(name = "SEARCH_RESULT")
	private String searchresult;
	@javax.persistence.Column(name = "INSERTED_DATE")
	private Date insertedDate;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSearchDetails() {
		return searchDetails;
	}

	public void setSearchDetails(String searchDetails) {
		this.searchDetails = searchDetails;
	}

	public String getSearchresult() {
		return searchresult;
	}

	public void setSearchresult(String searchresult) {
		this.searchresult = searchresult;
	}

	public Date getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}

	public ServiceReequestEO(String userId, String searchDetails) {
		this.userId = userId;
		this.searchDetails = searchDetails;
	}

	public ServiceReequestEO() {
	}
}
