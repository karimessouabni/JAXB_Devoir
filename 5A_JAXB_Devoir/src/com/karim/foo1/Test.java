package com.karim.foo1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Test {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance("com.karim.foo1");
		Unmarshaller u = context.createUnmarshaller();
		Foo f = (Foo) u.unmarshal(new File("foo1.xml"));
		for (int i = 0; i < f.bar.size(); i++) {
			System.out.println("Le bar =  " + f.bar.get(i));
		}

	}

}
