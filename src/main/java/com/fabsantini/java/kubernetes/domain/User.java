package com.fabsantini.java.kubernetes.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id                                                     //Javax ID;
    @GeneratedValue(strategy = GenerationType.AUTO)         //Javax Generated Value;
    @NotNull                                                //Javax Validation NotNull;
    private Long id;                                        //ID não nulo
    @NotNull
    private String name;                                    //nome não nulo;
    @NotNull
    private LocalDate birthDate;                            //aniversario não nulo;

    public User() {
    }

    // usuário recebe nome e data de aniver);
    public User(@NotNull String name, @NotNull LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getter e Setter para retornar as variáveis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
