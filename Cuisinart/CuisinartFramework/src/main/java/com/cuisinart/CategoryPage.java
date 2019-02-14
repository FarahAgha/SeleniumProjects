package com.cuisinart;

public abstract class CategoryPage {
	
	public abstract void goTo();
	public abstract String categoryName();
	public boolean isAtCategory(String categoryName) {
		
		return categoryName().equals(categoryName);
	}

}
