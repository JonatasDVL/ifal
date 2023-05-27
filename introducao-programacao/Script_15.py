idade=float(input(" Quantos anos você tem? "))

if idade<0:
    print(" Erro!!! ")
elif(idade<=10):
    print(" Você pertence a faixa etária das crianças. ")
elif(idade<=17):
    print(" Você pertence a faixa etária dos adolescentes. ")
elif(idade<=23):
    print(" Você pertence a faixa etária dos jovens. ")
elif(idade<=55):
    print(" Você pertence a faixa etária dos adultos. ")
else:
    print(" Você pertence a faixa etária dos idosos. ")
