/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;

/**
 *
 * @author Rodrigo
 */
public class Resolution {
    private int largura;
    private int altura;
    private String proporcao;

    public Resolution(int largura, int altura, String proporcao) {
        this.largura = largura;
        this.altura = altura;
        this.proporcao = proporcao;
    }

    
    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public String getProporcao() {
        return proporcao;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setProporcao(String proporcao) {
        this.proporcao = proporcao;
    }
    
    
}