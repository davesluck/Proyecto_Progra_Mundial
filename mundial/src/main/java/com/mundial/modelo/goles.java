package com.mundial.modelo;

public class goles {
   private int idGol;
   private int idPartido;
   private int idJugador;
   private int minuto;
   
   public goles(){}

   public goles(int idGol, int idPartido, int idJugador, int minuto){
       this.idGol = idGol;
       this.idPartido = idPartido;
       this.idJugador = idJugador;
       this.minuto = minuto;
   }

    public int getIdGol() {
        return idGol;
    }

    public void setIdGol(int idGol) {
        this.idGol = idGol;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
}
