package com.mas.selenium.util;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.mas.selenium.model.Usuario;

public class SQLAutentica {

	public static boolean doAutentica(Usuario usuario){

		Session session = HibernateUtil.getSession();
		Usuario consulta = null;
		try{
		consulta = (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", usuario.getLogin()))
				.add(Restrictions.eq("senha", usuario.getSenha()))
				.uniqueResult();
		}
		
		finally{
			session.close();
		}
		if (consulta != null) return true;
		else return false;

	}
	
	

}
