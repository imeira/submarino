package com.imeira.submarino;

import com.imeira.submarino.bean.Submarino;

/**
 * 
 * METODO MAIN PRINCIPAL
 * 
 * @author igormeira  - meira.igor@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String comando = "LMRDDMMUU";
        System.out.println( "executando comando submarino: "+ comando );
        System.out.println("Resultado= " + new Submarino().executarComando(comando));
        comando = "RMMLMMMDDLL";
        System.out.println( "executando comando submarino: "+ comando );
        System.out.println("Resultado= " + new Submarino().executarComando(comando));
        
        
    }
}
