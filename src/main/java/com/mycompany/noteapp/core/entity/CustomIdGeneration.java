package com.mycompany.noteapp.core.entity;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

public class CustomIdGeneration extends IdentityGenerator {

    public CustomIdGeneration() {
        super();
    }
}
