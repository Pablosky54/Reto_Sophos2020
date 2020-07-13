package com.sophos.www.models;

public enum Product {
	
	PRODUCT("Naranja Tangelo Costa sin Pepa Malla 2Kg");
	
	private String date;

	Product(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return date;
	}

}
