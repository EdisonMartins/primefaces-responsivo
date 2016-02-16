package com.algaworks.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@RequestScoped
@ManagedBean
public class MenuBean {
	public String getItemCssClass(String viewId) {
		FacesContext context = FacesContext.getCurrentInstance();
		String currentViewId = context.getViewRoot().getViewId();
		
		
		if(currentViewId != null){
			if(currentViewId.equals("/CadastroCliente.xhtml")){
				currentViewId = "/PesquisaClientes.xhtml";
			}
		}
		
		viewId = "/" + viewId + ".xhtml";
		System.out.println("CurrentViewId: " + currentViewId);
		System.out.println("ViewId: " + viewId);

		return currentViewId.equals(viewId) ? "is-selected" : null;
	}
}
