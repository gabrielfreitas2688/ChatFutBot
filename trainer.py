from chatterbot import ChatBot
from chatterbot.trainers import ListTrainer


ChatBot = ChatBot("ChatFutBot")

trainer = ListTrainer(ChatBot)
trainer.train([

"Oi",
"Oi",
"Tudo bem?",
"Tudo bem e com você?",
"Tudo bem com você?",
"Tudo bem e com você?",
"Que bom!",
"Tchau",
"Até mais!",
])


