n = input()
aux = 0
for x in range(n):
	dif = 999999999
	ganhador = 0
	t = raw_input().split()
	qt, s = int(t[0]), int(t[1])
	teclado = raw_input().split()
	for i in range(qt):
		tec = int(teclado[i])
		if (tec == s and dif > 0):
			ganhador = i + 1
			dif = 0
		elif abs (tec-s) < dif:
			dif = abs (tec-s)
			ganhador = i + 1
	print ganhador





				