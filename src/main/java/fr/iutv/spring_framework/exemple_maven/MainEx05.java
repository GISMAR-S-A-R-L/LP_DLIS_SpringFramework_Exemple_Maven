package fr.iutv.spring_framework.exemple_maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEx05 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context_05.xml");
		Voiture voiture = (Voiture) applicationContext.getBean(Voiture.class);
		voiture.setPlaque("AX-480-ZR");
		System.out.println(voiture.info());

		voiture.getConducteur().setPrenom("Alexandre");
		System.out.println(voiture.info());

	}

}
