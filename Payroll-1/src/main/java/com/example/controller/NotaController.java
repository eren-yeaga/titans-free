package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repository.NotaRepository;

public class NotaController {
	
	@Autowired
	NotaRepository notaRepository;
	
	public void test() {
		System.out.println("funonzia");
	}
}
