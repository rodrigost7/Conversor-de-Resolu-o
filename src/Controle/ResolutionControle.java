/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import Entidade.Resolution;
/**
 *
 * @author Rodrigo
 */
public class ResolutionControle {
    public boolean CalcularResolution(Resolution r){
        boolean result = false;
        if(r.getAltura()>0 && r.getLargura()>0){
            
            result= true;
        }
        return result;
    }
}
