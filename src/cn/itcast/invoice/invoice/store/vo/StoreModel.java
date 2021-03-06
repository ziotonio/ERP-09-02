package cn.itcast.invoice.invoice.store.vo;

import java.io.Serializable;

import cn.itcast.invoice.auth.emp.vo.EmpModel;

public class StoreModel implements Serializable{
	private Long uuid;
	private String name;
	private String address;
	
	private EmpModel em;
	
	public Long getUuid() {
		return uuid;
	}
	private void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	public EmpModel getEm() {
		return em;
	}
	private void setEm(EmpModel em) {
		this.em = em;
	}
	
}
