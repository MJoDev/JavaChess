package com.chess;

import com.chess.gui.Table;
//Metodo principal Main que se encarga de ejecutar todo el juego
public class JavaChess {

    public static void main(final String[] args) throws Exception {
        //Llamamos a la GUI para que se muestre en pantalla
        Table.get().show();
    }
}
