package com.reserv.myapp.model;


import java.util.Date;
import javax.persistence.*;

@Entity
public class ConsultationEntity {

	@Id
	@GeneratedValue
	private int no;
		
	private int grno;
	private int grgrod;
	private int depth;
	private String title;
	private String contents;
	private String passwd;
	private String lockFlg;
	private String deleteFlg;
	private Date createdAt;
	private Date updatedAt;
	private int buildCd;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getGrno() {
		return grno;
	}
	public void setGrno(int grno) {
		this.grno = grno;
	}
	public int getGrgrod() {
		return grgrod;
	}
	public void setGrgrod(int grgrod) {
		this.grgrod = grgrod;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
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
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getLockFlg() {
		return lockFlg;
	}
	public void setLockFlg(String lockFlg) {
		this.lockFlg = lockFlg;
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
