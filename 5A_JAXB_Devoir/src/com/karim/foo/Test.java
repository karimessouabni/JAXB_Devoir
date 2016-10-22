package com.karim.foo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance("com.karim.foo");
		Unmarshaller u = context.createUnmarshaller();
		Foo f = (Foo) u.unmarshal(new File("foo2.xml"));
		for (int i = 0; i < f.bidule.size(); i++) {
			System.out.println("Les bidules de foo  " + f.bidule.get(i));
		}

		for (Truc t : f.bar) {
			
			System.out.println("les trucs de ce Bar sont :");

			for (int i = 0; i < t.truc.size(); i++) {
				System.out.println(t.truc.get(i).toString());
			}

		}

	}

}
