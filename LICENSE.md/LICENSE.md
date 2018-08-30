package com.cg.asset.bean;

public class AssetIMBean {
  private int assetId;
  private String assetName;
  private String assetDesc;
  private int assetQuantity;
  private String assetStatus;
public int getAssetId() {
	return assetId;
}
public void setAssetId(int assetId) {
	this.assetId = assetId;
}
public String getAssetName() {
	return assetName;
}
public void setAssetName(String assetName) {
	this.assetName = assetName;
}
public String getAssetDesc() {
	return assetDesc;
}
public void setAssetDesc(String assetDesc) {
	this.assetDesc = assetDesc;
	
}
public int getAssetQuantity() {
	return assetQuantity;
}
public void setAssetQuantity(int assetQuantity) {
	this.assetQuantity = assetQuantity;
}
public String getAssetStatus() {
	return assetStatus;
}

public void setAssetStatus(String assetStatus) {
	this.assetStatus = assetStatus;
}
   
public AssetIMBean(String assetName, String adesc,
		int assetquantity, String assetStatus) {
	super();
	//this.assetId = assetId;
	this.assetName = assetName;
	this.assetDesc = adesc;
	this.assetQuantity = assetQuantity;
	this.assetStatus = assetStatus;
}
public AssetIMBean() {
	super();
	// TODO Auto-generated constructor stub
}
}
-----------------------------------------------------------------------------------------------------------------------------------------
package com.cg.asset.bean;

public class UserAuthenBean {

	
	private String userid;
	private String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public UserAuthenBean(String userid, String pwd) {
		super();
		this.userid = userid;
		this.pwd = pwd;
	}
	public UserAuthenBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
----------------------------------------------------------------------------------------------------------------------------------------
 
  
  
 
