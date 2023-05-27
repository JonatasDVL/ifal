#Nos cursos de nível superior do IFAL, a média para aprovação é 7 e os alunos
#fazem quatro avaliações durante o período letivo. Assim, para automatizar o
#sistema, escreva um programa que leia quatro notas de um aluno e informe se o
#mesmo foi aprovado ou não.
nota1=float(input(" Qual foi a sua nota do primeira avaliação? "))
nota2=float(input(" Qual foi a sua nota do segunda avaliação? "))
nota3=float(input(" Qual foi a sua nota do terceira avaliação? "))
nota4=float(input(" Qual foi a sua nota do quarta avaliação? "))
media=((nota1 + nota2 + nota3 + nota4)/4)
if(media<=10):
    print(" Sua media foi",media,"do primeiro semestre. ")
else:
    print(" ERRO!!! ")
if(10>=media>=7):
    print(" Parabéns você passou! ")
if(7>media>=0):
    print(" Você reprovou, estude mais! ")
