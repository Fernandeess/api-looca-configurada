package org.example;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Looca looca = new Looca();

//Exemplos
        System.out.println(looca.);
        System.out.println(looca.getGrupoDeProcessos());
        System.out.println(looca.getProcessador());
        System.out.println(looca.getTemperatura());
        Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

//Obtendo lista de discos a partir do getter
        List<Disco> discos = grupoDeDiscos.getDiscos();
        for (Disco disco : discos) {
            System.out.println(disco);
        }
//        System.out.println(sistema);
//        System.out.println(memoria);
    }
}