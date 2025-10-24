
package adrianoestudos.desafio.dio.poo;

import java.time.LocalDate;


public class DesafioDioPOO {

    public static void main(String[] args) {
       
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
        
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devAdriano = new Dev();
        devAdriano.setNome("Adriano");
        devAdriano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAdriano.getConteudosInscritos());
        devAdriano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devAdriano.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos" + devAdriano.getConteudosConcluidos());
        System.out.println("XP:" + devAdriano.calcularTotalXp());
        
        System.out.println("-----------------");
        
        Dev devAdriana = new Dev();
        devAdriana.setNome("Adriana");
        devAdriana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devAdriana.getConteudosInscritos());
        devAdriana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devAdriana.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos" + devAdriana .getConteudosConcluidos());
        System.out.println("XP:" + devAdriana.calcularTotalXp());
        
    }
}
