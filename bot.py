from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer

chatbot = ChatBot("Chatpot")


exit_conditions = (":q", "quit", "exit", "sair", "Sair")
while True:
    query = input("Digite algo: ")
    resposta = ChatBot.get_response(query)
    if query in exit_conditions and float(query.confidence) > 0.5:
        break
    else:
        print(f"ChatFutBot ⚽: {chatbot.get_response(query)}")