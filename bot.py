from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer

chatbot = ChatBot("Chatpot")


exit_conditions = (":q", "quit", "exit", "sair", "Sair")
while True:
    query = input("Digite algo: ")
    if query in exit_conditions:
        break
    else:
        print(f"ChatFutBot ⚽: {chatbot.get_response(query)}")