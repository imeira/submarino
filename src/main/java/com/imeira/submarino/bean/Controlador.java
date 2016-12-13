package com.imeira.submarino.bean;

import com.imeira.submarino.constants.Coordenada;

public class Controlador {

    private int eixoX;
    private int eixoY;
    private int eixoZ;
    private Coordenada coordenada;

    public Controlador(int eixoX, int eixoY, int eixoZ, Coordenada coordenada) {
        this.coordenada = coordenada;
        this.eixoX = eixoX;
        this.eixoY = eixoY;
        this.eixoZ = eixoZ;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public int getEixoX() {
        return eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public int getEixoZ() {
        return eixoZ;
    }
    
    public void setEixoX(int eixoX) {
		this.eixoX = eixoX;
	}

	public void setEixoY(int eixoY) {
		this.eixoY = eixoY;
	}

	public void setEixoZ(int eixoZ) {
		this.eixoZ = eixoZ;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public Controlador somarEixoX(int valor) {
        eixoX = eixoX + valor;
        return this;
    }

    public Controlador somarEixoY(int valor) {
        eixoY = eixoY + valor;
        return this;
    }


    public Controlador somarEixoZ(int valor) {
    		eixoZ = eixoZ + valor;
    	if (eixoZ > 0) {
    		eixoZ = 0;
    	}
        return this;
    }

    public Controlador mudarCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
        return this;
    }

	@Override
	public String toString() {
		return eixoX + " " + eixoY + " " + eixoZ + " " + coordenada.getDescricao();
	}

    
    
}
