package org.example;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;
import com.github.britooo.looca.api.group.rede.Rede;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Looca looca = new Looca();

    System.out.println("Sistema");
    System.out.println("-------------------------------------------------------------------");
    Sistema sistema = new Sistema();
//    System.out.println(sistema.getPermissao());
//    System.out.println(sistema.getFabricante());
    System.out.println(sistema.getArquitetura());
    System.out.println(sistema.getInicializado());
    System.out.println(sistema.getTempoDeAtividade());
    System.out.println(sistema.getSistemaOperacional());
    System.out.println("-------------------------------------------------------------------");
    Memoria memoria = new Memoria();
    System.out.println("Memoria");
    System.out.println("-------------------------------------------------------------------");
    System.out.println(memoria.getDisponivel());
    System.out.println(memoria.getEmUso());
    System.out.println(memoria.getTotal());
    System.out.println("-------------------------------------------------------------------");
    Processador procesador = new Processador();
    System.out.println("Processador");
    System.out.println("-------------------------------------------------------------------");
//    System.out.println(procesador.getFabricante());
    System.out.println(procesador.getFrequencia());
//    System.out.println(procesador.getId());
//    System.out.println(procesador.getIdentificador());
//    System.out.println(procesador.getMicroarquitetura());
    System.out.println(procesador.getNome());
//    System.out.println(procesador.getNumeroCpusFisicas());
//    System.out.println(procesador.getNumeroCpusLogicas());
//    System.out.println(procesador.getNumeroPacotesFisicos());
    System.out.println(procesador.getUso());
    System.out.println("-------------------------------------------------------------------");
    Temperatura temperatura = new Temperatura();
    System.out.println("Temperatura");
    System.out.println("-------------------------------------------------------------------");
    System.out.println(temperatura.getTemperatura());
    System.out.println(temperatura.toString());
    System.out.println("-------------------------------------------------------------------");
    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
    System.out.println("Disco Grupos");
    System.out.println("-------------------------------------------------------------------");
//    System.out.println(grupoDeDiscos.getDiscos());
//    System.out.println(grupoDeDiscos.getQuantidadeDeDiscos());
//    System.out.println(grupoDeDiscos.getQuantidadeDeVolumes());
    System.out.println(grupoDeDiscos.getTamanhoTotal());
//    System.out.println(grupoDeDiscos.getVolumes());
    List<Disco> discos = grupoDeDiscos.getDiscos();
    for (Disco disco : discos) {
      System.out.println(disco.getBytesDeEscritas());
      System.out.println(disco.getBytesDeLeitura());
//      System.out.println(disco.getEscritas());
//      System.out.println(disco.getLeituras());
//      System.out.println(disco.getModelo());
//      System.out.println(disco.getNome());
//      System.out.println(disco.getSerial());
      System.out.println(disco.getTamanho());
//      System.out.println(disco.getTamanhoAtualDaFila());
//      System.out.println(disco.getTamanhoAtualDaFila());
//      System.out.println(disco.getTempoDeTransferencia());
    }
//    System.out.println("-------------------------------------------------------------------");
//    System.out.println("Grupo de serviços");
////    System.out.println(looca.getGrupoDeServicos().getServicos());
//    System.out.println("Todos");
//    System.out.println("Ativos:");
//    System.out.println(looca.getGrupoDeServicos().getServicosAtivos());
//    System.out.println("Inativos:");
//    System.out.println(looca.getGrupoDeServicos().getServicosInativos());
//    System.out.println(looca.getGrupoDeServicos().getTotalServicosAtivos());
//    System.out.println(looca.getGrupoDeServicos().getTotalServicosInativos());
//    System.out.println(looca.getGrupoDeServicos().getTotalDeServicos());
//
//    ProcessoGrupo grupoDeProcessos = new ProcessoGrupo();
//    System.out.println("-------------------------------------------------------------------");
//    System.out.println("Grupo de processos");
//    System.out.println("-------------------------------------------------------------------");
//    System.out.println(grupoDeProcessos.getProcessos());
//    System.out.println("-------------------------------------------------------------------");
//    System.out.println(grupoDeProcessos.getTotalProcessos());
//    System.out.println("-------------------------------------------------------------------");
//    System.out.println(grupoDeProcessos.getTotalThreads());
//    System.out.println("-------------------------------------------------------------------");

    System.out.println("Rede");
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Interfaces");
    System.out.println(looca.getRede().getGrupoDeInterfaces().getInterfaces());
    System.out.println(looca.getRede().getParametros().getHostName());
    System.out.println(looca.getRede().getParametros().getNomeDeDominio());
    System.out.println(looca.getRede().getParametros().getServidoresDns());
  }
}
