package com.javabotanist.model;

public class Temp {
	
	private int t;
	
	public Temp(int t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "[" + t + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + t;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (t != other.t)
			return false;
		return true;
	}

}
