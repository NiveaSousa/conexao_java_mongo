package com.br.prova.model;

import java.util.ArrayList;

public class Projetos {
	private String nome;
	private String tarefas;
	private String status; 
	private float tempo;
	
	
	public Projetos(String nome, String tarefas, String status, float tempo) {
		super();
		this.nome = nome;
		this.tarefas = tarefas;
		this.tempo = tempo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTarefas() {
		return tarefas;
	}


	public void setTarefas(String tarefas) {
		this.tarefas = tarefas;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public float getTempo() {
		return tempo;
	}


	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
	


}
