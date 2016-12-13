package com.imeira.submarino.constants;

public enum Movimento {
	MOVER("M");

    private String comando;

    Movimento(String comando) {
        this.comando = comando;
    }
    
    public String getComando() {
        return comando;
    }
    
}
