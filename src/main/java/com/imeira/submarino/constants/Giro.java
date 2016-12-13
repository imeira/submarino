package com.imeira.submarino.constants;

public enum Giro {
	ESQUERDA("L"), DIREITA("R");

    private String comando;

    Giro(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }
}
