from chatterbot import ChatBot
from chatterbot.trainers import ChatterBotCorpusTrainer

ChatBot = ChatBot("ChatFutBot")
trainer = ChatterBotCorpusTrainer(ChatBot)

trainer.train("chatterbot.corpus.portuguese")


