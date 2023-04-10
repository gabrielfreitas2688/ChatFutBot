from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer


ChatBot = ChatBot("ChatFutBot")

trainer = ListTrainer(ChatBot)
trainer.train([

"Quais times participaram do campeonato de 2023?",
"Os seguintes clubes participaram da edicao de 2023: Athletico Paranaense, Operario, Coritiba, Maringa, Cianorte, FC Cascavel, Aruko SB, Sao-Joseense, Azuriz, Londrina, Rio Branco e Foz do Iguaçu",
"Em que posição o Athletico Paranaense ficou em 2023?",
"Na primeira fase ficou em 1 colocado, ja na segunda fase avançou até A final, onde se consagrou campeão",
"Em que posição o Operario ficou em 2023?",
"Na primeira fase ficou em 2 colocado, ja na segunda fase avançou até as semi-finais, onde foi eliminado",
"Em que posição o Coritiba ficou em 2023?",
"Na primeira fase ficou em 3 colocado, ja na segunda fase avançou até  as quartas de final, onde foi eliminado",
"Em que posição o Maringa ficou em 2023?",
"Na primeira fase ficou em 4 colocado, ja na segunda fase avançou até as semi-finais, onde foi eliminado",   
"Em que posição o Cianorte ficou em 2023?",
"Na primeira fase ficou em 5 colocado, ja na segunda fase avançou até  as quartas de final, onde foi eliminado",
"Em que posição o FC Cascavel ficou em 2023?",
"Na primeira fase ficou em 6 colocado, ja na segunda fase avançou até A final, onde foi eliminado",
"Em que posição o Aruko SB ficou em 2023?",
"Na primeira fase ficou em 7 colocado, ja na segunda fase avançou até  as quartas de final, onde foi eliminado",
"Em que posição o Sao-Joseense ficou em 2023?",
"Na primeira fase ficou em 8 colocado, ja na segunda fase avançou até  as quartas de final, onde foi eliminado",
"Em que posição o Azuriz ficou em 2023?",
"Na primeira fase ficou em 9 colocado, então não se classificou para a segunda fase",
"Em que posição o Londrina ficou em 2023?",
"Na primeira fase ficou em 10 colocado, então não se classificou para a segunda fase",
"Em que posição o Rio Branco ficou em 2023?",
"Na primeira fase ficou em 11 colocado, então não se classificou para a segunda fase",
"Em que posição o Foz do Iguaçu ficou em 2023?",
"Na primeira fase ficou em 12 colocado, então não se classificou para a segunda fase",

])


