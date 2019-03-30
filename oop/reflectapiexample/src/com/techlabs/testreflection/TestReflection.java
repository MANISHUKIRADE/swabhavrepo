package com.techlabs.testreflection;

import com.techlabs.reflectrectangle.Rectangle;;

public class TestReflection {
	public static void main(String[] args) throws ClassNotFoundException {
		Rectangle rect1 = new Rectangle();
		Reflection ref = new Reflection(rect1.getClass());
		ref.printMetaDataClass();
		ref.printMetaDataField();
		ref.printMetaDataDeclaredfield();
		ref.printMetaDataMethod();
		ref.printMetaDataMethodChild();
		
				

	}

}
