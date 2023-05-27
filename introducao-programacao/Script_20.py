quantidade=int(input(" Quantas notas tem o aluno? "))
media=0
for c in range(0,quantidade):
    nota=float(input(" Qual foi a nota? "))
    media+=nota/quantidade
print(" A média do aluno foi {}. ".format(media))
