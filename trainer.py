from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer


ChatBot = ChatBot("ChatFutBot")

trainer = ListTrainer(ChatBot)
trainer.train([

"Oi",
"Oi",
"Tudo bem com você?",
"Tudo e com você?",
"Vou bem",
"Que bom!",

])


