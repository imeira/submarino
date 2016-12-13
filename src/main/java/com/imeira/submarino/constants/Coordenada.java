package com.imeira.submarino.constants;

public enum Coordenada {
    NORTE("NORTE", 0, +1),
    LESTE("LESTE", +1, 0),
    SUL("SUL",0, -1),
    OESTE("OESTE", -1, 0);

    private String descricao;
    private int eixoX;
    private int eixoY;
    
    Coordenada(String descricao, int eixoX, int eixoY) {
    	this.descricao = descricao;
    	this.eixoX = eixoX;
        this.eixoY = eixoY;
    }

    public String getDescricao() {
        return descricao;
    }

	public int getEixoX() {
		return eixoX;
	}

	public int getEixoY() {
		return eixoY;
	}
    
}
