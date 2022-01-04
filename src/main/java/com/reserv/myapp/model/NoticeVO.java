package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

//¡¡ªªò±ªéª»

@Entity
@Table(name="notice")
public class NoticeVO {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long no;
		
	private String title;
	private String contents;
	private String deleteFlg;
	private Date createdAt;
	private Date updatedAt;
	private int buildCd;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getBuildCd() {
		return buildCd;
	}
	public void setBuildCd(int buildCd) {
		this.buildCd = buildCd;
	}
	
	

}
