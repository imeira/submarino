package com.imeira.submarino.bean;

import com.imeira.submarino.constants.Coordenada;
import com.imeira.submarino.constants.Giro;
import com.imeira.submarino.constants.Movimento;
import com.imeira.submarino.constants.Profundidade;

import static com.imeira.submarino.constants.Coordenada.*;

public class Submarino {

    private Controlador controlador;

    public Submarino() {
        this(0, 0, 0, NORTE);
    }

    public Submarino(int eixoX, int eixoY, int eixoZ, Coordenada direcao) {
        controlador = new Controlador(eixoX, eixoY, eixoZ, direcao);
    }


    public String executarComando(String comando) {
        for (char caracter : comando.toCharArray()) {
        	String letra = String.valueOf(caracter);
        	
        	if (letra.equals(Giro.ESQUERDA.getComando())) {
        		girar(Giro.ESQUERDA);
            	continue;
        	}
        	
        	if (letra.equals(Giro.DIREITA.getComando())) {
        		girar(Giro.DIREITA);
            	continue;
        	}
        	
            if (letra.equals(Profundidade.SUBIR.getComando())) {
            	submergir(Profundidade.SUBIR);
                continue;
            }

            if (letra.equals(Profundidade.DESCER.getComando())) {
            	submergir(Profundidade.DESCER);
                continue;
            }
            if (letra.equals(Movimento.MOVER.getComando())) {
            	movimentar();
                continue;
            }
        }
        return controlador.toString();
    }

    public Controlador getControlador() {
        return controlador;
    }

    private void submergir(Profundidade profundidade) {
        switch (profundidade) {
            case SUBIR:
            	controlador.somarEixoZ(Profundidade.SUBIR.getEixoZ());
                break;
            case DESCER:
            	controlador.somarEixoZ(Profundidade.DESCER.getEixoZ());
                break;
        }
    }
    
    private void movimentar() {
        Coordenada atual = controlador.getCoordenada();
        switch (atual) {
            case NORTE:
            	controlador.somarEixoY(NORTE.getEixoY());
                break;
            case SUL:
            	controlador.somarEixoY(SUL.getEixoY());
                break;
            case LESTE:
            	controlador.somarEixoX(LESTE.getEixoX());
                break;
            case OESTE:
            	controlador.somarEixoX(OESTE.getEixoX());
                break;
        }
    }
    
    private void girar(Giro giro) {
        Coordenada atual = controlador.getCoordenada();
        switch (atual) {
            case NORTE:
            	controlador.mudarCoordenada(giro.equals(Giro.DIREITA)? LESTE : OESTE);
                break;
            case LESTE:
            	controlador.mudarCoordenada(giro.equals(Giro.DIREITA)? SUL : NORTE);
                break;
            case SUL:
            	controlador.mudarCoordenada(giro.equals(Giro.DIREITA)? OESTE : LESTE);
                break;
            case OESTE:
            	controlador.mudarCoordenada(giro.equals(Giro.DIREITA)? NORTE : SUL);
                break;
        }
    }

}
