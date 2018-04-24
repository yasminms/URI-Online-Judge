soma = 0
n = input()
for i in range(0, n, 1):
	t = raw_input().split()
	x, y = int(t[0]), int(t[1])
	if (x > y):
		for i in range(y+1, x, 1):
			if (i % 2 != 0):
				soma = soma + i
		print soma
		soma = 0
	elif (x < y):
		for i in range(x+1, y, 1):
			if (i % 2 != 0):
				soma = soma + i
		print soma 
		soma = 0
	else:
		print "0"
