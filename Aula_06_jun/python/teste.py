soma = 0 

while True:
    entrada = input("Digite um número (ou pressione Enter para encerrar): ")
    if entrada == "":
        break
    try:
        numero = int(entrada)
        soma += numero
    except ValueError:
        print("Entrada inválida! Por favor, digite um número válido.")

print("Soma total:", soma)

#inserido no codigo entrada e saida e laço de repetição while para somar os numeros inteiros digitados pelo usuario