n = 1
conta = 0
contb = 0
i = n
while (i!=0):
	n = input()
	i = n
	if (n != 0):
		while (n > 0):
			leitura = raw_input().split()
			a, b = int(leitura[0]), int(leitura[1])
			if (a > b):
				conta+=1
			elif (b > a):
				contb+=1
			n-=1
		print"%d %d"%(conta,contb)
		conta = 0
		contb = 0


