n = 1
soma = 0
while (n != 0):
	n = input()
	if (n != 0):
		for i in range(n, n+10, 1):
			if (i % 2 == 0):
				soma += i;
		print soma	
		soma = 0
	