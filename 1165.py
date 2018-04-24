n = input()
for i in range(0, n, 1):
	primo = True
	teste = input()
	for x in range(2, teste, 1):
		if (teste % x == 0):
			primo = False
	if (primo == True):
		print "%d eh primo"%(teste)
	else:
		print "%d nao eh primo"%(teste)
