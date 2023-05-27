nota=float(input(" Qual é foi a sua nota? "))

if(0>nota or nota>10):
    print(" Erro!!! ")
elif(nota>=9):
    print(" Parabéns você ganhará medalha de ouro. ")
elif(nota>=8):
    print(" Parabéns você ganhará medalha de prata. ")
elif(nota>=6):
    print(" Parabéns você ganhará medalha de bronze. ")
else:
    print(" Infelizmente você não tirou a nota o suficiente, estude mais e tente novamente. ")
