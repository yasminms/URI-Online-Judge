cont = 0
n = input()
for i in range(0, n, 1):
	comida = input()
	while (comida > 1.0):
		comida = comida/2.0
		cont+=1
	print "%d dias"%(cont)
	cont=0