n = input()
for i in range(0, n, 1):
	leitura = raw_input().split()
	a = int(leitura[0])
	b = int(leitura[1])
	tot = (a * b)/2
	print "%d cm2"%(tot)
