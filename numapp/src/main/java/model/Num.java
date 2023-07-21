package model;

import java.io.Serializable;

public class Num implements Serializable{
	private String org;
	private int size;
	private int max;
	private int min;
	private int sum;
	public Num() {}
	public Num(String org) {
		this.org=org;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public int getSize() {
	return size;
	}
	public void setSize(int size) {
		this.size = size;

	}
	public int getMax() {
		return max;
	}
	public void setMax(int Max) {
		this.max = max;
	}
	public int setMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int setSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}
