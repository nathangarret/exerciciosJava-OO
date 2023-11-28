package org.example;

public class Ponto {

    private int x;
    private int y;

    public void definirX(int valorX){
        x = valorX;
    }

    public void definirY(int valorY){
        y = valorY;
    }

    public void exibirCoordenadas(){
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

}
