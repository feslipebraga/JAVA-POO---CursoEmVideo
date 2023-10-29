package com.mycompany.aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    // Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("----- MENU -----");
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i=0; i < this.getVolume(); i = i + 10){
                System.out.print(" |");
            } System.out.println();
        } else {
            System.out.println("TV Desligada. Não é possível mostrar o menu");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando o menu...");
        } else {
            System.out.println("Menu não foi aberto para ser fechado");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("Não foi possível ligar o mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        } else {
            System.out.println("Não foi possível desligar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else{
            System.out.println("Não consegui pausar");
        }
    }

    @Override
    public String toString() {
        return "ControleRemoto{" + "volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + '}';
    }
}

