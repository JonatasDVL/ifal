#Atividade 4

lista=[]
lista_ímpar=[]
lista_par=[]
lista_zero=1
valor=0

for c in range(1,9):
    valor = int(input(" Digite um valor inteiro: "))
    if(valor%2==0 or valor%2==1):
        lista.append(valor)
        if(valor!=0):
            if(valor%2==0):
                lista_par.append(valor)
            else:
                lista_ímpar.append(valor)
        else:
             lista_zero=lista_zero-1

print(" Os oito números que você digitou {}. ".format(lista))
print(" Os números pares que você digitou {}. ".format(lista_par))
print(" Os números ímpares que você digitou {}. ".format(lista_ímpar))
if(lista_zero==0):
    print(" Você digitou o número 0. ")
