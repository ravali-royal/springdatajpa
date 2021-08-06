package info.ravali.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class StudentEntity {
	@Id
	@Column(name="SId")
	@GeneratedValue
	private Integer SId;
	@Column(name="SName")
	private String Sname;
	@Column(name="SEmail")
	private String SEmail;
	@Column(name="SRank")
	private Integer Srank;
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSEmail() {
		return SEmail;
	}
	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}
	public Integer getSrank() {
		return Srank;
	}
	public void setSrank(Integer srank) {
		Srank = srank;
	}
	@Override
	public String toString() {
		return "StudentEntity [SId=" + SId + ", Sname=" + Sname + ", SEmail=" + SEmail + ", Srank=" + Srank + "]";
	}
	
	
	
}
