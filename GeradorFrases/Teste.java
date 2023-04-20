import javax.naming.MalformedLinkException;

public class Teste {
    public static void main(String[] args) 
    {
        //Times
        Time AthleticoPR = new Time("Athletico Paranaense", "Joaquin Américo Guimarães(Arena da Baixada)", "Curitiba", 1924, 0, 42372, 27, 88);
        Time Azuriz = new Time("Azuriz", "Estadio dos Pioneiros", "Pato Branco", 2018, 0, 1500, 0, 2);
        Time Cianorte = new Time("Cianorte", "Olimpico Albino Turbay", "Cianorte", 2002, 0, 3000, 0, 18);
        Time Coritiba = new Time("Coritiba", "Major Antônio Couto Pereira", "Curitiba", 1909, 0, 40512, 39, 99);
        Time Cascavel = new Time("FC Cascavel", "Olimpico Regional Arnaldo Busatto", "Cascavel", 2008, 0, 28125, 0, 9);
        Time Foz = new Time("Foz do Iguaçu", "Estadio do ABC", "Foz do Iguaçu", 1996, 0, 6969, 0, 7);
        Time Londrina = new Time("Londrina", "Municipal Jacy Scaff(Estadio do Cafe)", "Londrina", 1956, 0, 30000, 5, 49);
        Time Maringa = new Time("Maringá", "Regional Willie Davids", "Maringá", 2010, 0, 21000, 0, 8);
        Time Operario = new Time("Operário", "Germano Kruger", "Ponta Grossa", 1912, 0, 10362, 1, 51);
        Time RioBranco = new Time("Rio Branco", "Nelson Medrado Dias(Estradinha)", "Paranaguá", 1913, 0, 4500, 0, 54);
        Time SaoJoseense = new Time("São-Joseense", "Municipal Cilmar Pedro Goergen(Estádio do Pinhao)", "São José dos Pinhais", 2015, 0, 4047, 0, 1);
        Time Aruko = new Time("Aruko SB", "Regional Willie Davids", "Maringá", 2020, 0, 21000, 0, 1);
        Time Parana = new Time("Paraná", "Durival Britto e Silva(Vila Capanema)", "Curitiba", 1989, 0, 20083, 7, 29);
        Time Uniao = new Time("União", "Estádio Anilado", "Francisco Beltrão", 1956, 0, 5438, 0, 4);
        Time Toledo = new Time("Toledo", "Municipal 14 de Dezembro", "Toledo", 2004, 0, 15280, 0, 12);
        Time CascavelCR = new Time("Cascavel CR", "Olimpico Regional Arnaldo Busatto", "Cascavel", 2001, 0, 28125, 0, 9);
        Time PSTC = new Time("PSTC", "Estádio Ubirajara Medeiros", "Cornélio Procópio", 1994, 0, 3500, 0, 3);
        Time Prudentopolis = new Time("Prudentópolis", "Estádio Newton Agibert", "Prudentópolis", 2007, 0, 5000, 0, 5);
        Time Malucelli = new Time("J.Malucelli", "Ecoestádio Janguito Malucelli", "Curitiba", 1994, 2017, 4200, 0, 10);
        Time Nacional = new Time("Nacional AC", "Erich George", "Rolândia", 1947, 0, 2050, 0, 17);
        Time Arapongas = new Time("Arapongas EC", "Estádio dos Pássaros", "Arapongas", 1974, 0, 15000, 0, 7);
        Time Paranavai = new Time("AC Paranavai", "Estádio Municipal Dr. Waldemiro Wagner", "Paranavai", 1946, 0, 25000, 1, 37);
        Time Roma = new Time("Roma Apucarana", "Olímpio Barreto", "Apucarana", 2000, 2019, 10000, 0, 7);
        Time Iraty = new Time("Iraty SC", "	Estádio Coronel Emílio Gomes", "Irati", 1914, 0, 8000, 1, 27);



        //Paranaense 2023
        Paranaense edicao2023 = new Paranaense();
        edicao2023.ano = 2023;
        edicao2023.goleada = "5 a 0 do Athlético sobre o Azuriz";
        edicao2023.golsTotais = 207;
        edicao2023.numeroPartidas = 80;
        //classificação 1 fase em ordem de pontuação
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

        //Paranaense 2022
        Paranaense edicao2022 = new Paranaense();
        edicao2022.ano = 2022;
        edicao2022.goleada = "5 a 0 do Maringá sobre o FC Cascavel";
        edicao2022.golsTotais = 181;
        edicao2022.numeroPartidas = 78;
        //classificação 1 fase
        edicao2022.participantes.add(Operario);
        edicao2022.participantes.add(Coritiba);
        edicao2022.participantes.add(AthleticoPR);
        edicao2022.participantes.add(Maringa);
        edicao2022.participantes.add(Cascavel);
        edicao2022.participantes.add(Londrina);
        edicao2022.participantes.add(Cianorte);
        edicao2022.participantes.add(SaoJoseense);
        edicao2022.participantes.add(RioBranco);
        edicao2022.participantes.add(Azuriz);
        edicao2022.participantes.add(Uniao);
        edicao2022.participantes.add(Parana);
        //rebaixados
        edicao2022.rebaixados.add(Uniao);
        edicao2022.rebaixados.add(Parana);
        //quartas de final
        edicao2022.quartas.add(Operario);
        edicao2022.quartas.add(SaoJoseense);
        edicao2022.quartas.add(Maringa);
        edicao2022.quartas.add(Cascavel);
        edicao2022.quartas.add(Coritiba);
        edicao2022.quartas.add(Cianorte);
        edicao2022.quartas.add(AthleticoPR);
        edicao2022.quartas.add(Londrina);
        //Semi-Final
        edicao2022.semi.add(Operario);
        edicao2022.semi.add(Maringa);
        edicao2022.semi.add(Coritiba);
        edicao2022.semi.add(AthleticoPR);
        //Final
        edicao2022.finalistas.add(Maringa);
        edicao2022.finalistas.add(Coritiba);
        //Campeao
        edicao2022.campeao = Coritiba;
        //Vice-Campeao
        edicao2022.vice = Maringa;

        //Paranaense 2021
        Paranaense edicao2021 = new Paranaense();
        edicao2021.ano = 2022;
        edicao2021.goleada = "9 a 0 do Operário sobre o Cascavel CR";
        edicao2021.golsTotais = 139;
        edicao2021.numeroPartidas = 61;
        //classificação 1 fase
        edicao2021.participantes.add(Operario);
        edicao2021.participantes.add(Cascavel);
        edicao2021.participantes.add(AthleticoPR);
        edicao2021.participantes.add(Cianorte);
        edicao2021.participantes.add(Londrina);
        edicao2021.participantes.add(Parana);
        edicao2021.participantes.add(Maringa);
        edicao2021.participantes.add(Azuriz);
        edicao2021.participantes.add(Coritiba);
        edicao2021.participantes.add(RioBranco);
        edicao2021.participantes.add(Toledo);
        edicao2021.participantes.add(CascavelCR);
        //rebaixados
        edicao2021.rebaixados.add(Toledo);
        edicao2021.rebaixados.add(CascavelCR);
        //quartas de final
        edicao2021.quartas.add(Operario);
        edicao2021.quartas.add(Azuriz);
        edicao2021.quartas.add(Cianorte);
        edicao2021.quartas.add(Londrina);
        edicao2021.quartas.add(Cascavel);
        edicao2021.quartas.add(Maringa);
        edicao2021.quartas.add(AthleticoPR);
        edicao2021.quartas.add(Parana);
        //Semi-Final
        edicao2021.semi.add(Operario);
        edicao2021.semi.add(Londrina);
        edicao2021.semi.add(Cascavel);
        edicao2021.semi.add(AthleticoPR);
        //Final
        edicao2021.finalistas.add(Londrina);
        edicao2021.finalistas.add(Cascavel);
        //Campeao
        edicao2021.campeao = Londrina;
        //Vice-Campeao
        edicao2021.vice = Cascavel;

        //Paranaense 2020
        Paranaense edicao2020 = new Paranaense();
        edicao2020.ano = 2020;
        edicao2020.goleada = "6 a 1 do Coritiba sobre o União";
        edicao2020.golsTotais = 159;
        edicao2020.numeroPartidas = 66;
        //classificação 1 fase
        edicao2020.participantes.add(Coritiba);
        edicao2020.participantes.add(Cascavel);
        edicao2020.participantes.add(AthleticoPR);
        edicao2020.participantes.add(Operario);
        edicao2020.participantes.add(Cianorte);
        edicao2020.participantes.add(Londrina);
        edicao2020.participantes.add(RioBranco);
        edicao2020.participantes.add(Parana);
        edicao2020.participantes.add(CascavelCR);
        edicao2020.participantes.add(Toledo);
        edicao2020.participantes.add(PSTC);
        edicao2020.participantes.add(Uniao);

        //rebaixados
        edicao2020.rebaixados.add(PSTC);
        edicao2020.rebaixados.add(Uniao);
        //quartas de final
        edicao2020.quartas.add(Londrina);
        edicao2020.quartas.add(AthleticoPR);
        edicao2020.quartas.add(RioBranco);
        edicao2020.quartas.add(Cascavel);
        edicao2020.quartas.add(Cianorte);
        edicao2020.quartas.add(Operario);
        edicao2020.quartas.add(Parana);
        edicao2020.quartas.add(Coritiba);
        //Semi-Final
        edicao2020.semi.add(AthleticoPR);
        edicao2020.semi.add(Cascavel);
        edicao2020.semi.add(Cianorte);
        edicao2020.semi.add(Coritiba);
        //Final
        edicao2020.finalistas.add(AthleticoPR);
        edicao2020.finalistas.add(Coritiba);
        //Campeao
        edicao2020.campeao = AthleticoPR;
        //Vice-Campeao
        edicao2020.vice = Coritiba;



        //Paranaense 2019
        Paranaense edicao2019 = new Paranaense();
        edicao2019.ano = 2019;
        edicao2019.goleada = "8 a 2 do Athletico sobre o Toledo";
        edicao2019.golsTotais = 159;
        edicao2019.numeroPartidas = 66;
        //classificação 1 fase
        edicao2019.participantes.add(Toledo);
        edicao2019.participantes.add(Cascavel);
        edicao2019.participantes.add(Operario);
        edicao2019.participantes.add(Coritiba);
        edicao2019.participantes.add(Maringa);
        edicao2019.participantes.add(Parana);  
        edicao2019.participantes.add(Londrina);
        edicao2019.participantes.add(Cianorte);
        edicao2019.participantes.add(AthleticoPR);
        edicao2019.participantes.add(CascavelCR);
        edicao2019.participantes.add(Foz);
        edicao2019.participantes.add(RioBranco);   
        //Taça Barcimio Sicupira
        edicao2019.participantesTaca1A.add(Toledo);
        edicao2019.participantesTaca1B.add(Cascavel);
        edicao2019.participantesTaca1A.add(Operario);
        edicao2019.participantesTaca1B.add(Coritiba);
        edicao2019.participantesTaca1A.add(Maringa);
        edicao2019.participantesTaca1B.add(Parana);  
        edicao2019.participantesTaca1A.add(Londrina);
        edicao2019.participantesTaca1B.add(Cianorte);
        edicao2019.participantesTaca1A.add(AthleticoPR);
        edicao2019.participantesTaca1B.add(CascavelCR);
        edicao2019.participantesTaca1A.add(Foz);
        edicao2019.participantesTaca1B.add(RioBranco);    

        //Taça Dirceu Kruger
        edicao2019.participantesTaca2A.add(AthleticoPR);
        edicao2019.participantesTaca2B.add(Coritiba);
        edicao2019.participantesTaca2A.add(Londrina);
        edicao2019.participantesTaca2B.add(RioBranco);
        edicao2019.participantesTaca2A.add(Operario);
        edicao2019.participantesTaca2B.add(CascavelCR);  
        edicao2019.participantesTaca2A.add(Foz);
        edicao2019.participantesTaca2B.add(Parana);
        edicao2019.participantesTaca2A.add(Maringa);
        edicao2019.participantesTaca2B.add(Cianorte);
        edicao2019.participantesTaca2A.add(Toledo);
        edicao2019.participantesTaca2B.add(Cascavel);    
        //rebaixados
        edicao2019.rebaixados.add(Maringa);
        edicao2019.rebaixados.add(Foz);
        //quartas de final (Dois Grupos)
        //Semi-final da Taça Dirceu Kruger
        edicao2019.quartas.add(Toledo);
        edicao2019.quartas.add(Operario);
        edicao2019.quartas.add(Cascavel);
        edicao2019.quartas.add(Coritiba);
        //Semi-final da Taça Barcimio Sicupira
        edicao2019.quartas.add(AthleticoPR);
        edicao2019.quartas.add(RioBranco);
        edicao2019.quartas.add(Coritiba);
        edicao2019.quartas.add(Londrina);
        //Semi-Final (Dois Grupos)
        //Final da Taça Dirceu Kruger
        edicao2019.semi.add(AthleticoPR);
        edicao2019.semi.add(Coritiba);
        //Final da Taça Barcimio Sicupira
        edicao2019.semi.add(Toledo);
        edicao2019.semi.add(Coritiba);
        //Final do Campeonato(Finalistas das 2 Taças)
        edicao2019.finalistas.add(AthleticoPR);
        edicao2019.finalistas.add(Toledo);
        //Campeao
        edicao2019.campeao = AthleticoPR;
        //Vice-Campeao
        edicao2019.vice = Toledo;


        //Paranaense 2018
        Paranaense edicao2018 = new Paranaense();
        edicao2018.ano = 2018;
        edicao2018.goleada = "7 a 1 do Athletico sobre o Rio Branco";
        edicao2018.golsTotais = 171;
        edicao2018.numeroPartidas = 74;
        //classificação 1 fase
        edicao2018.participantes.add(Foz);
        edicao2018.participantes.add(AthleticoPR);
        edicao2018.participantes.add(Coritiba);
        edicao2018.participantes.add(RioBranco);
        edicao2018.participantes.add(Cascavel);
        edicao2018.participantes.add(Londrina);  
        edicao2018.participantes.add(Cianorte);
        edicao2018.participantes.add(Toledo);
        edicao2018.participantes.add(Maringa);
        edicao2018.participantes.add(Uniao);
        edicao2018.participantes.add(Parana);
        edicao2018.participantes.add(Prudentopolis);    
        //Taça Dionisio Filho
        edicao2018.participantesTaca1A.add(Foz);
        edicao2018.participantesTaca1B.add(AthleticoPR);
        edicao2018.participantesTaca1A.add(Coritiba);
        edicao2018.participantesTaca1B.add(RioBranco);
        edicao2018.participantesTaca1A.add(Cascavel);
        edicao2018.participantesTaca1B.add(Londrina);  
        edicao2018.participantesTaca1A.add(Cianorte);
        edicao2018.participantesTaca1B.add(Toledo);
        edicao2018.participantesTaca1A.add(Maringa);
        edicao2018.participantesTaca1B.add(Uniao);
        edicao2018.participantesTaca1A.add(Parana);
        edicao2018.participantesTaca1B.add(Prudentopolis);    

        //Taça Caio Junior
        edicao2018.participantesTaca2A.add(Parana);
        edicao2018.participantesTaca2B.add(AthleticoPR);
        edicao2018.participantesTaca2A.add(Maringa);
        edicao2018.participantesTaca2B.add(Londrina);
        edicao2018.participantesTaca2A.add(Foz);
        edicao2018.participantesTaca2B.add(Toledo);  
        edicao2018.participantesTaca2A.add(Cianorte);
        edicao2018.participantesTaca2B.add(Uniao);
        edicao2018.participantesTaca2A.add(Cascavel);
        edicao2018.participantesTaca2B.add(Prudentopolis);
        edicao2018.participantesTaca2A.add(Coritiba);
        edicao2018.participantesTaca2B.add(RioBranco);    
        //rebaixados
        edicao2018.rebaixados.add(Uniao);
        edicao2018.rebaixados.add(Prudentopolis);
        //quartas de final (Dois Grupos)
        //Semi-final da Taça Dionisio Filho
        edicao2018.quartas.add(Foz);
        edicao2018.quartas.add(Coritiba);
        edicao2018.quartas.add(AthleticoPR);
        edicao2018.quartas.add(RioBranco);
        //Semi-final da Taça Caio Junior
        edicao2018.quartas.add(AthleticoPR);
        edicao2018.quartas.add(Maringa);
        edicao2018.quartas.add(Parana);
        edicao2018.quartas.add(Londrina);
        //Semi-Final (Dois Grupos)
        //Final da Taça Dionisio Filho
        edicao2018.semi.add(Coritiba);
        edicao2018.semi.add(RioBranco);
        //Final da Taça Caio Junior
        edicao2018.semi.add(AthleticoPR);
        edicao2018.semi.add(Londrina);
        //Final do Campeonato(Finalistas das 2 Taças)
        edicao2018.finalistas.add(AthleticoPR);
        edicao2018.finalistas.add(Coritiba);
        //Campeao
        edicao2018.campeao = AthleticoPR;
        //Vice-Campeao
        edicao2018.vice = Coritiba;
 

        //Paranaense 2017
        Paranaense edicao2017 = new Paranaense();
        edicao2017.ano = 2017;
        edicao2017.goleada = "5 a 0 do Paraná sobre o Foz do Iguaçu";
        edicao2017.golsTotais = 187;
        edicao2017.numeroPartidas = 82;
        //classificação 1 fase
        edicao2017.participantes.add(Parana);
        edicao2017.participantes.add(Coritiba);
        edicao2017.participantes.add(Cianorte);
        edicao2017.participantes.add(Londrina);
        edicao2017.participantes.add(Prudentopolis);
        edicao2017.participantes.add(Cascavel);
        edicao2017.participantes.add(AthleticoPR);
        edicao2017.participantes.add(RioBranco);
        edicao2017.participantes.add(Foz);
        edicao2017.participantes.add(Toledo);
        edicao2017.participantes.add(PSTC);
        edicao2017.participantes.add(Malucelli);

        //rebaixados
        edicao2017.rebaixados.add(PSTC);
        edicao2017.rebaixados.add(Malucelli);
        //quartas de final
        edicao2017.quartas.add(AthleticoPR);
        edicao2017.quartas.add(Parana);
        edicao2017.quartas.add(Coritiba);
        edicao2017.quartas.add(Cascavel);
        edicao2017.quartas.add(Cianorte);
        edicao2017.quartas.add(Prudentopolis);
        edicao2017.quartas.add(Londrina);
        edicao2017.quartas.add(RioBranco);
        //Semi-Final
        edicao2017.semi.add(Coritiba);
        edicao2017.semi.add(Cianorte);
        edicao2017.semi.add(AthleticoPR);
        edicao2017.semi.add(Londrina);
        //Final
        edicao2017.finalistas.add(Coritiba);
        edicao2017.finalistas.add(AthleticoPR);
        //Campeao
        edicao2017.campeao = Coritiba;
        //Vice-Campeao
        edicao2017.vice = AthleticoPR;        

        //Paranaense 2016
        Paranaense edicao2016 = new Paranaense();
        edicao2016.ano = 2016;
        edicao2016.goleada = "5 a 1 do Rio Branco sobre o Operário";
        edicao2016.golsTotais = 184;
        edicao2016.numeroPartidas = 82;
        //classificação 1 fase
        edicao2016.participantes.add(Parana);
        edicao2016.participantes.add(Malucelli);
        edicao2016.participantes.add(Coritiba);
        edicao2016.participantes.add(AthleticoPR);
        edicao2016.participantes.add(Londrina);
        edicao2016.participantes.add(Toledo);
        edicao2016.participantes.add(PSTC);
        edicao2016.participantes.add(Foz);
        edicao2016.participantes.add(Cascavel);
        edicao2016.participantes.add(RioBranco);
        edicao2016.participantes.add(Operario);
        edicao2016.participantes.add(Maringa);

        //rebaixados
        edicao2016.rebaixados.add(Operario);
        edicao2016.rebaixados.add(Maringa);
        //quartas de final
        edicao2016.quartas.add(Parana);
        edicao2016.quartas.add(Foz);
        edicao2016.quartas.add(Malucelli);
        edicao2016.quartas.add(PSTC);
        edicao2016.quartas.add(Coritiba);
        edicao2016.quartas.add(Toledo);
        edicao2016.quartas.add(AthleticoPR);
        edicao2016.quartas.add(Londrina);
        //Semi-Final
        edicao2016.semi.add(Coritiba);
        edicao2016.semi.add(PSTC);
        edicao2016.semi.add(AthleticoPR);
        edicao2016.semi.add(Parana);
        //Final
        edicao2016.finalistas.add(AthleticoPR);
        edicao2016.finalistas.add(Coritiba);
        //Campeao
        edicao2016.campeao = AthleticoPR;
        //Vice-Campeao
        edicao2016.vice = Coritiba;            

        //Paranaense 2015
        Paranaense edicao2015 = new Paranaense();
        edicao2015.ano = 2015;
        edicao2015.goleada = "7 a 0 do Athletico sobre o Nacional";
        edicao2015.golsTotais = 212;
        edicao2015.numeroPartidas = 82;
        //classificação 1 fase
        edicao2015.participantes.add(Coritiba);
        edicao2015.participantes.add(Malucelli);
        edicao2015.participantes.add(Operario);
        edicao2015.participantes.add(Maringa);
        edicao2015.participantes.add(Londrina);
        edicao2015.participantes.add(Parana);
        edicao2015.participantes.add(Foz);
        edicao2015.participantes.add(Cascavel);
        edicao2015.participantes.add(AthleticoPR);
        edicao2015.participantes.add(RioBranco);
        edicao2015.participantes.add(Nacional);
        edicao2015.participantes.add(Prudentopolis);

        //rebaixados
        edicao2015.rebaixados.add(Nacional);
        edicao2015.rebaixados.add(Prudentopolis);
        //quartas de final
        edicao2015.quartas.add(Coritiba);
        edicao2015.quartas.add(Cascavel);
        edicao2015.quartas.add(Foz);
        edicao2015.quartas.add(Malucelli);
        edicao2015.quartas.add(Operario);
        edicao2015.quartas.add(Parana);
        edicao2015.quartas.add(Londrina);
        edicao2015.quartas.add(Maringa);
        //Semi-Final
        edicao2015.semi.add(Operario);
        edicao2015.semi.add(Foz);
        edicao2015.semi.add(Coritiba);
        edicao2015.semi.add(Londrina);
        //Final
        edicao2015.finalistas.add(Operario);
        edicao2015.finalistas.add(Coritiba);
        //Campeao
        edicao2015.campeao = Operario;
        //Vice-Campeao
        edicao2015.vice = Coritiba;   


        //Paranaense 2014
        Paranaense edicao2014 = new Paranaense();
        edicao2014.ano = 2014;
        edicao2014.goleada = "4 a 0 do Parana sobre o Athletico";
        edicao2014.golsTotais = 235;
        edicao2014.numeroPartidas = 89;
        //classificação 1 fase
        edicao2014.participantes.add(Parana);
        edicao2014.participantes.add(Coritiba);
        edicao2014.participantes.add(Maringa);
        edicao2014.participantes.add(Londrina);
        edicao2014.participantes.add(Malucelli);
        edicao2014.participantes.add(Prudentopolis);
        edicao2014.participantes.add(RioBranco);
        edicao2014.participantes.add(AthleticoPR);
        edicao2014.participantes.add(Cianorte);
        edicao2014.participantes.add(Operario);
        edicao2014.participantes.add(Arapongas);
        edicao2014.participantes.add(Toledo);

        //rebaixados
        edicao2014.rebaixados.add(Arapongas);
        edicao2014.rebaixados.add(Toledo);
        //quartas de final
        edicao2014.quartas.add(AthleticoPR);
        edicao2014.quartas.add(Parana);
        edicao2014.quartas.add(Coritiba);
        edicao2014.quartas.add(RioBranco);
        edicao2014.quartas.add(Maringa);
         edicao2014.quartas.add(Malucelli);
        //Semi-Final
        edicao2014.semi.add(Londrina);
        edicao2014.semi.add(AthleticoPR);
        edicao2014.semi.add(Maringa);
        edicao2014.semi.add(Coritiba);
        //Final
        edicao2014.finalistas.add(Londrina);
        edicao2014.finalistas.add(Maringa);
        //Campeao
        edicao2014.campeao = Londrina;
        //Vice-Campeao
        edicao2014.vice = Maringa;    
        
        //Paranaense 2013
        Paranaense edicao2013 = new Paranaense();
        edicao2013.ano = 2013;
        edicao2013.goleada = "7 a 0 do Coritiba sobre o Rio Branco";
        edicao2013.golsTotais = 351;
        edicao2013.numeroPartidas = 136;
        //classificação 1 fase
        edicao2013.participantes.add(Coritiba);
        edicao2013.participantes.add(Londrina);
        edicao2013.participantes.add(Parana);
        edicao2013.participantes.add(Malucelli);
        edicao2013.participantes.add(AthleticoPR);
        edicao2013.participantes.add(Arapongas);
        edicao2013.participantes.add(Paranavai);
        edicao2013.participantes.add(Toledo);
        edicao2013.participantes.add(Operario);
        edicao2013.participantes.add(Cianorte);
        edicao2013.participantes.add(RioBranco);
        edicao2013.participantes.add(Nacional);

        //rebaixados
        edicao2013.rebaixados.add(Paranavai);
        edicao2013.rebaixados.add(Nacional);
        //segundo turno
        edicao2013.segundoTurno.add(AthleticoPR);
        edicao2013.segundoTurno.add(Londrina);
        edicao2013.segundoTurno.add(Coritiba);
        edicao2013.segundoTurno.add(Operario);
        edicao2013.segundoTurno.add(Parana);
        edicao2013.segundoTurno.add(Malucelli);
        edicao2013.segundoTurno.add(Arapongas);
        edicao2013.segundoTurno.add(Toledo);
        edicao2013.segundoTurno.add(RioBranco);
        edicao2013.segundoTurno.add(Cianorte);
        edicao2013.segundoTurno.add(Nacional);
        edicao2013.segundoTurno.add(Paranavai);
        //Final
        edicao2013.finalistas.add(Coritiba);
        edicao2013.finalistas.add(AthleticoPR);
        //Campeao
        edicao2013.campeao = Coritiba;
        //Vice-Campeao
        edicao2013.vice = AthleticoPR;         


        //Paranaense 2012
        Paranaense edicao2012 = new Paranaense();
        edicao2012.ano = 2012;
        edicao2012.goleada = "5 a 0 do Athletico sobre o Operário";
        edicao2012.golsTotais = 374;
        edicao2012.numeroPartidas = 134;
        //classificação 1 fase
        edicao2012.participantes.add(AthleticoPR);
        edicao2012.participantes.add(Coritiba);
        edicao2012.participantes.add(Cianorte);
        edicao2012.participantes.add(Arapongas);
        edicao2012.participantes.add(Toledo);
        edicao2012.participantes.add(RioBranco);
        edicao2012.participantes.add(Londrina);
        edicao2012.participantes.add(Malucelli);
        edicao2012.participantes.add(Roma);
        edicao2012.participantes.add(Operario);
        edicao2012.participantes.add(Paranavai);
        edicao2012.participantes.add(Iraty);

        //rebaixados
        edicao2012.rebaixados.add(Roma);
        edicao2012.rebaixados.add(Iraty);
        //segundo turno
        edicao2012.segundoTurno.add(Coritiba);
        edicao2012.segundoTurno.add(AthleticoPR);
        edicao2012.segundoTurno.add(Operario);
        edicao2012.segundoTurno.add(Arapongas);
        edicao2012.segundoTurno.add(Londrina);
        edicao2012.segundoTurno.add(Paranavai);
        edicao2012.segundoTurno.add(RioBranco);
        edicao2012.segundoTurno.add(Cianorte);
        edicao2012.segundoTurno.add(Toledo);
        edicao2012.segundoTurno.add(Malucelli);
        edicao2012.segundoTurno.add(Iraty);
        edicao2012.segundoTurno.add(Roma);
        //Final
        edicao2012.finalistas.add(Coritiba);
        edicao2012.finalistas.add(AthleticoPR);
        //Campeao
        edicao2012.campeao = Coritiba;
        //Vice-Campeao
        edicao2012.vice = AthleticoPR;         


        //LISTA DE PARANAENSES
        Paranaense[] campeonatoParanaense = new Paranaense[12];
        campeonatoParanaense[0] = edicao2023;
        campeonatoParanaense[1] = edicao2022;
        campeonatoParanaense[2] = edicao2021;
        campeonatoParanaense[3] = edicao2020;
        campeonatoParanaense[4] = edicao2019;
        campeonatoParanaense[5] = edicao2018;
        campeonatoParanaense[6] = edicao2017;
        campeonatoParanaense[7] = edicao2016;
        campeonatoParanaense[8] = edicao2015;
        campeonatoParanaense[9] = edicao2014;
        campeonatoParanaense[10] = edicao2013;
        campeonatoParanaense[11] = edicao2012;

        //PERGUNTAS E RESPOSTAS ===================================
        //#1
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("\"Quais times participaram do campeonato de " + paranaense.ano + "?\",");
            System.out.print("\"Os seguintes clubes participaram da edicao de " + paranaense.ano + ":");
            int count = 1;
            for (Time time : paranaense.participantes) 
            {
                System.out.print(time.nome);              
                if(count < 11){System.out.print(", ");}
                if(count == 11){System.out.print(" e ");}
                count++;
            }
            System.out.println("\",");

        }
        //#2
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            if(paranaense.ano == 2018 || paranaense.ano == 2019)
            {
                for (int i = 0; i < paranaense.participantes.size(); i++) 
                {      
                    Time time = paranaense.participantes.get(i);
                    System.out.printf("\"Em que posição o %s ficou em %d?\",\n", time.nome, paranaense.ano);
                    if(paranaense.participantesTaca1A.contains(time))
                    {
                        System.out.printf("\"Na fase da primeira taça jogou no grupo A, e ficou em %d colocado. ", paranaense.participantesTaca1A.indexOf(time)+1);
                        if((paranaense.participantesTaca1A.indexOf(time)+1) >= 3)
                        {
                            System.out.print("Não se classificando para as fases seguintes\",\n");
                        }
                        else
                        {
                            String ate = "";
                            if(paranaense.campeao == time){ate = "Avançou até a grande final, onde se consagrou campeão\",";}
                            else if(paranaense.finalistas.contains(time)){ate = "Avançou até a grande final, porem ficou com o titulo de vice\",";}
                            else if(paranaense.semi.contains(time)){ate = "Avançou até as semi-finais, onde foi eliminado\",";}
                            else if(paranaense.quartas.contains(time)){ate = " Avançou até as quartas de final, onde foi eliminado\",";}
                            System.out.print(ate + "\n");
                        }
                    }          
                    if(paranaense.participantesTaca1B.contains(time))
                    {
                        System.out.printf("\"Na fase da primeira taça jogou no grupo B, e ficou em %d colocado. ", paranaense.participantesTaca1B.indexOf(time)+1);
                        if((paranaense.participantesTaca1B.indexOf(time)+1) >= 3)
                        {
                            System.out.print("Não se classificando para as fases seguintes\",\n");
                        }
                        else
                        {
                            String ate = "";
                            if(paranaense.campeao == time){ate = "Avançou até a grande final, onde se consagrou campeão\",";}
                            else if(paranaense.finalistas.contains(time)){ate = "Avançou até a grande final, porem ficou com o titulo de vice\",";}
                            else if(paranaense.semi.contains(time)){ate = "Avançou até as semi-finais, onde foi eliminado\",";}
                            else if(paranaense.quartas.contains(time)){ate = " Avançou até as quartas de final, onde foi eliminado\",";}
                            System.out.print(ate + "\n");
                        }
                    } 
       
                }
            }
            else
            {
                for (int i = 0; i < paranaense.participantes.size(); i++) 
                {                
                    String ate = "";
                    Time time = paranaense.participantes.get(i);
                    if(paranaense.campeao == time){ate = "A final, onde se consagrou campeão";}
                    else if(paranaense.finalistas.contains(time)){ate = "A final, onde foi eliminado";}
                    else if(paranaense.semi.contains(time)){ate = "as semi-finais, onde foi eliminado";}
                    else if(paranaense.quartas.contains(time)){ate = " as quartas de final, onde foi eliminado";}
                    System.out.printf("\"Em que posição o %s ficou em %d?\",%n", time.nome, paranaense.ano);
                    if(ate != ""){System.out.printf("\"Na primeira fase ficou em %d colocado, ja na segunda fase avançou até %s\",\n", i+1, ate);}
                    else{System.out.printf("\"Na primeira fase ficou em %d colocado, então não se classificou para a segunda fase\",\n", i+1);}           
                }
            }


            
        }
        //#3
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("\"Quem foi campeão em " + paranaense.ano + "?\",");
            System.out.printf("\"O %s levou o titulo no campeonato de %d\",\n",paranaense.campeao.nome, paranaense.ano);
            
        }
        //#4
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            System.out.println("\"Quem foi rebaixado em " + paranaense.ano + "?\",");
            System.out.printf("\"Os clubes %s e %s foram rebaixados na edição de %s \",\n", paranaense.rebaixados.get(0).nome, paranaense.rebaixados.get(1).nome, paranaense.ano);           
        }
        //#5
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (Time time : paranaense.participantes) 
            {
                System.out.printf("\"Quantos titulos o %s tem?\",\n", time.nome);
                if(time.numeroTitulos > 1){System.out.printf("\"Atualmente o %s acumula %d titulos de campeão paranaense\",\n", time.nome, time.numeroTitulos); }
                else if(time.numeroTitulos == 1){System.out.printf("\"O %s possui apenas 1 titulo de campeão paranaense\",\n", time.nome); }
                else{System.out.printf("\"O %s ainda não ganhou nenhuma edição do campeonato paranaense\",\n", time.nome); }
                   
            }
                       
        }
        //#6
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (Time time : paranaense.participantes) 
            {
                System.out.printf("\"Qual é o estádio do %s?\",\n", time.nome);
                System.out.printf("\"O %s cedia seus jogos como mandante no %s, que tem uma capacidade de publico de %d\",\n", time.nome, time.estadio, time.capacidadeEstadio);                  
            }
                       
        }
        //#7
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (Time time : paranaense.participantes) 
            {
                System.out.printf("\"De qual cidade é o %s?\",\n", time.nome);
                System.out.printf("\"O %s tem como casa a cidade de %s\",\n", time.nome, time.cidade);                  
            }
                       
        }
        //#8
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            
            System.out.printf("\"Qual foi o maior placar de %d?\",\n", paranaense.ano);
            System.out.printf("\"O maior placar foi de %s\",\n", paranaense.goleada);                  
            
                       
        }
        //#9
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (Time time : paranaense.participantes) 
            {
                System.out.printf("\"Quantos anos tem o %s?\",\n", time.nome);
                System.out.printf("\"O %s foi fundado em %d, e tem %d anos de idade\",\n", time.nome, time.anoFundacao, (-time.anoFundacao + 2023));                  
            }
                       
        }
        //#10
        for (Paranaense paranaense : campeonatoParanaense) 
        {
            for (Time time : paranaense.participantes) 
            {
                System.out.printf("\"Quantas vezes o %s participou do paranaense?\",\n", time.nome);
                System.out.printf("\"O %s ja participou de %d edições do campeonato paranaense\",\n", time.nome, time.numeroPaticipacoes);                  
            }
                       
        }



    }

}
