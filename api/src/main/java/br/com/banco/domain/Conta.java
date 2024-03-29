package br.com.banco.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;
}