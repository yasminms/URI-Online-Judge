n = input()
for x in range(0, n, 1):
	soma = 0
	teste = input()
	for i in range(1, teste, 1):
		if (teste % i == 0):
			soma = soma + i
	if (soma == teste and teste != 0):
		print "%d eh perfeito"%(teste)
	else:
		print "%d nao eh perfeito"%(teste)
	soma = 0

