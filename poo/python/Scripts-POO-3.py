nota1=float(input(" Qual é a primeira nota? "))
nota2=float(input(" Qual é a segunda nota? "))
media=((nota1+nota2)/2)

print(" A media das duas notas é {}. ".format(media))

if(media<6):
    print(" Logo o aluno está reprovado. ")
else:
    print(" Logo o aluno está aprovado. ")

