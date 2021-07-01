/*
 * HelloWorld! Classe para testar apenas. 
 * 
*/
package com.mas.selenium.controller;

import java.util.List;

import org.hibernate.Session;

import com.mas.selenium.model.Usuario;
import com.mas.selenium.util.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends BaseAction{
	
	public String execute(){
		System.out.println("Teste");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Teste");
		
		HibernateUtil.persist(usuario);
		
		
		return "success";
	}

}
