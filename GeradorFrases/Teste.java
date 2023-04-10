public class Teste {
    public static void main(String[] args) 
    {
        //Times
        Time AthleticoPR = new Time("Athlético Paranaense", "Joaquin Americo Guimaraes(Arena da Baixada)", "Curitiba", 99, 42372, 27, 88);
        Time Azuriz = new Time("Azuriz", "Estadio dos Pioneiros", "Pato Branco", 5, 1500, 0, 2);
        Time Cianorte = new Time("Cianorte", "Olimpico Albino Turbay", "Cianorte", 21, 3000, 0, 18);
        Time Coritiba = new Time("Coritiba", "Major Antonio Couto Pereira", "Curitiba", 113, 40512, 39, 99);
        Time Cascavel = new Time("FC Cascavel", "Olimpico Regional Arnaldo Busatto", "Cascavel", 15, 28125, 0, 9);
        Time Foz = new Time("Foz do Iguaçu", "Estadio do ABC", "Foz do Iguaçu", 27, 6969, 0, 7);
        Time Londrina = new Time("Londrina", "Municipal Jacy Scaff(Estadio do Cafe)", "Londrina", 67, 30000, 5, 49);
        Time Maringa = new Time("Maringa", "Regional Willie Davids", "Maringa", 12, 21000, 0, 8);
        Time Operario = new Time("Operario", "Germano Kruger", "Ponta Grossa", 110, 10362, 1, 51);
        Time RioBranco = new Time("Rio Branco", "Nelson Medrado Dias(Estradinha)", "Paranagua", 109, 4500, 0, 54);
        Time SaoJoseense = new Time("Sao-Joseense", "Municipal Cilmar Pedro Goergen(Estadio do Pinhao)", "Sao Jose dos Pinhais", 7, 4047, 0, 1);
        Time Aruko = new Time("Aruko SB", "Regional Willie Davids", "Maringa", 2, 21000, 0, 1);

        //Paranaense 2023
        Paranaense edicao2023 = new Paranaense();
        edicao2023.ano = 2023;
        //classificação 1 fase
        edicao2023.participantes.add(AthleticoPR);
        edicao2023.participantes.add(Operario);
        edicao2023.participantes.add(Coritiba);
        edicao2023.participantes.add(Maringa);
        edicao2023.participantes.add(Cianorte);
        edicao2023.participantes.add(Cascavel);
        edicao2023.participantes.add(Aruko);
        edicao2023.participantes.add(SaoJoseense);
        edicao2023.participantes.add(Azuriz);
        edicao2023.participantes.add(Londrina);
        edicao2023.participantes.add(RioBranco);
        edicao2023.participantes.add(Foz);
        //rebaixados
        edicao2023.rebaixados.add(RioBranco);
        edicao2023.rebaixados.add(Foz);
        //quartas de final
        edicao2023.quartas.add(AthleticoPR);
        edicao2023.quartas.add(SaoJoseense);
        edicao2023.quartas.add(Maringa);
        edicao2023.quartas.add(Cianorte);
        edicao2023.quartas.add(Operario);
        edicao2023.quartas.add(Aruko);
        edicao2023.quartas.add(Coritiba);
        edicao2023.quartas.add(Cascavel);
        //Semi-Final
        edicao2023.semi.add(AthleticoPR);
        edicao2023.semi.add(Maringa);
        edicao2023.semi.add(Operario);
        edicao2023.semi.add(Cascavel);
        //Final
        edicao2023.finalistas.add(AthleticoPR);
        edicao2023.finalistas.add(Cascavel);
        //Campeao
        edicao2023.campeao = AthleticoPR;
        //Vice-Campeao
        edicao2023.vice = Cascavel;

        Paranaense[] campeonatoParanaense = new Paranaense[1];
        campeonatoParanaense[0] = edicao2023;

        //PERGUNTAS E RESPOSTAS ===================================
        //#1
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("-Quais times participaram do campeonato de " + paranaense.ano + "?");
            System.out.print("-Os seguintes clubes participaram da edicao de " + paranaense.ano + ": ");
            int count = 1;
            for (Time time : paranaense.participantes) 
            {
                System.out.print(time.nome);              
                if(count < 11){System.out.print(", ");}
                if(count == 11){System.out.print(" e ");}
                count++;
            }
            System.out.println("");

        }
        //#2
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (int i = 0; i < paranaense.participantes.size(); i++) 
            {                
                String ate = "";
                Time time = paranaense.participantes.get(i);
                if(paranaense.campeao == time){ate = "A final, onde se consagrou campeão";}
                else if(paranaense.finalistas.contains(time)){ate = "A final, onde foi eliminado";}
                else if(paranaense.semi.contains(time)){ate = "as semi-finais, onde foi eliminado";}
                else if(paranaense.quartas.contains(time)){ate = " as quartas de final, onde foi eliminado";}
                System.out.printf("-Em que posição o %s ficou em %d?%n", time.nome, paranaense.ano);
                if(ate != ""){System.out.printf("-Na primeira fase ficou em %d colocado, ja na segunda fase avançou até %s\n", i+1, ate);}
                else{System.out.printf("-Na primeira fase ficou em %d colocado, então não se classificou para a segunda fase\n", i+1);}

                
            }
            
        }
        //#3
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("-Quem foi campeão em " + paranaense.ano + "?");
            System.out.printf("-O %s levou o titulo no campeonato de %d\n",paranaense.campeao.nome, paranaense.ano);
            
        }
        //#4
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("-Quem foi rebaixado em " + paranaense.ano + "?");
            System.out.printf("-Os clubes %s e %s foram rebaixados na edição de %s ", paranaense.rebaixados.get(0).nome, paranaense.rebaixados.get(1).nome, paranaense.ano);           
        }






    }

}
