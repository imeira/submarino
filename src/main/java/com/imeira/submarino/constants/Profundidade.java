package com.imeira.submarino.constants;

public enum Profundidade {
	SUBIR("U", +1), DESCER("D", -1);

    private String comando;
    private int eixoZ;

    Profundidade(String comando,int eixoZ) {
        this.comando = comando;
        this.eixoZ = eixoZ;
    }
    
    public String getComando() {
        return comando;
    }
    
    public int getEixoZ() {
		return eixoZ;
	}
}
