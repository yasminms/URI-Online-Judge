a = 1
b = 1
while (a!=0 and b!=0):
	leitura = raw_input().split()
	a, b = int(leitura[0]), int(leitura[1])
	tot = a+b
	if (a!=0 and b!=0):
		print "%d"%(tot)