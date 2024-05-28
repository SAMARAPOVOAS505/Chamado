package com.samara.chamado.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.extern.java.Log;

@Entity
@Data
public class chamados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        private String Chamado;
		private Date dataAtual;
		private String status;
        private String nome;
        private String local;
        private String desc;
        private String ip;
        private String coment;
        private String categ;
		private String dataUlt;
		private String LastID;
		private String chave;
		private String upload;
    
}
