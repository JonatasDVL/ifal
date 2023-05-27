#Um mercadinho contratou você para automatizar as vendas. Para isso, você
#construirá um software demonstrativo para que o dono do mercado possa avaliar.
#Sua missão é escrever um programa que leia o valor de 3 produtos, leia o valor pago
#pelo cliente e informe se haverá troco ou não.
valor1=float(input(" Qual é o valor o primeiro produto? "))
valor2=float(input(" Qual é o valor o segundo produto? "))
valor3=float(input(" Qual é o valor o terceiro produto? "))
valor_total=(valor1 + valor2+ valor3)
print(" O valor total da compra foi",valor_total)
valor_pago=float(input(" Qual o valor que o cliente pagou? "))

if(valor_total==valor_pago):
    print(" Obrigada pela compra, não haverá troco. ")
elif(valor_total<valor_pago):
    print(" Obrigada pela compra, o valor do troco é de", (valor_pago-valor_total))
else:                 
    print(" Obrigada pela compra, mas está faltando ", (valor_total-valor_pago))                
                
