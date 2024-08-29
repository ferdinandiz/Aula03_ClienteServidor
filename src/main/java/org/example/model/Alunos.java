package org.example.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alunos {
    Long matricula;
    String nome;
    String telefone;
    boolean maioridade;
    Cursos curso;
    String sexo;
}
