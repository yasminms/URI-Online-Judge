while True:
	n = input()
	if n == 0:
		break
	maior = n
	while (n > 1):
		if (n % 2 == 0):
			n = n/2
		elif (n % 2 != 0):
			n = 3*n+1
		if (n > maior):
			maior=n
	print maior
				