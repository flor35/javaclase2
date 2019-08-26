package com.senati.ddw05;

import com.senati.ddw05.persona;

public class implementarpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona gerente1 = new persona();
		gerente1.id = 1;
		gerente1.nombre = "Pablo Santiago";
		gerente1.apellido ="Quispe Chaupi";
		gerente1.sexo = "M";
		gerente1.fnacimiento ="02/02/02";
		
		System.out.println("Datos Registrados");
		System.out.println(gerente1.toString());
		
		persona obrero1 = new persona();
		obrero1.id = 1;
		obrero1.nombre = "Juan Marco";
		obrero1.apellido = "Aurelio Mendoza";
		obrero1.sexo = "M";
		obrero1.fnacimiento ="25/10/1999";
		
		System.out.println("Datos Registrados");
		System.out.println(obrero1.toString());
		
		persona obrero2 = new persona(2,"Luis Francisco","Mendoza Santillan","M","15/01/1975");
		System.out.println("Datos Registrados");
		System.out.println(obrero2.toString());
		
		persona obrero3 = new persona(2,"Rodrigo Fernando","Perez Huata","M","06/05/2000");
		System.out.println("Datos Registrados");
		System.out.println(obrero3.toString());
		
		persona obrero4 = new persona(2,"Maria Estèr","Silvia Còrdoba","M","30/05/1988");
		System.out.println("Datos Registrados");
		System.out.println(obrero4.toString());
		
		persona obrero5 = new persona(2,"Alondra Carmen","Retuerto Bustos","M","01/11/1999");
		System.out.println("Datos Registrados");
		System.out.println(obrero5.toString());
		
		

	}

}
