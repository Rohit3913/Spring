package com.depenncies.injection.SpringDI;

import java.util.Random;

public class RandomText {

	String texts[]={"Hi Dude","Hi Pagal", "Hi Pablo"};
	
	public String getText(){
		
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
	
}
