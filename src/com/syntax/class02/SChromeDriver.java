package com.syntax.class02;

public class SChromeDriver implements SWebDriver {

	public SChromeDriver() {
		System.out.println("Opening Chrome Web Driver");
	}
	@Override
	public void get(String url) {
		System.out.println("Launch the url: :  "+url);
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("REtrieving Current Url");
		
	}

	@Override
	public void close() {
		System.out.println();
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
