a = 1
b = 1
c = 1
while (a!=0 and b!=0 and c!=0):
	leitura = raw_input().split()
	a, b, c = int(leitura[0]), int(leitura[1]), int(leitura[2])
	if (a!=0 and b!=0 and c!=0):
		tot = (a*b*c)**(1/3.0)
		print "%d"%(tot)


