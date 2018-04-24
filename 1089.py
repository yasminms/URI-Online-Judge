while True:
	n = input()
	if n == 0:
		break
	cont = 0
	t = [int (i) for i in raw_input().split()]
	for i in range(n):
		s = 0
		d = 0
		valor = t
		if (n != 2):
			if i >= 1 and i <= n-2:
				if (valor[i-1] < valor[i] and valor[i] > valor[i+1]):
					cont += 1
				elif (valor[i-1] > valor[i] and valor[i] < valor[i+1]):
					cont += 1
			elif i == n-1:
				if (valor[n-1] > valor[0] and valor[n-2] < valor[n-1]):
					cont += 1
				elif (valor[n-1] < valor[0] and valor[n-2] > valor[n-1]):
					cont += 1
			elif i == 0:
				if (valor[n-1] > valor[0] and valor[0] < valor[1]):
					cont += 1
				elif (valor[n-1] < valor[0] and valor[0] > valor[1]):
					cont += 1
	if(n == 2):
		if (valor[0] > valor[1]):
			cont += 1
			if (valor[1] < valor[0]):
				cont += 1
		elif (valor[0] < valor[1]):
			cont += 1
			if (valor[1] > valor[0]):
				cont += 1
	print cont


		



