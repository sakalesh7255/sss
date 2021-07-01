/*
 * Classe responsavel por implementar regras de negocios de manejamento de usuarios 
 * usando os insumos (criados na package util)
*/
package com.mas.selenium.services;

import com.mas.selenium.exceptions.UsuarioNAutorizado;
import com.mas.selenium.model.Usuario;
import com.mas.selenium.util.SQLAutentica;

public class ControleUsuario{
	
	 /* Autenticacao de usuarios
	 */ 
	public static void autenticaUsuario(Usuario usuario) throws UsuarioNAutorizado {
		if (!SQLAutentica.doAutentica(usuario)) throw new UsuarioNAutorizado();
	}
	

}

