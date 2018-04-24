i = 0
x = input()
if (1 <= x and x <= 100):
	for i in range(0, x, 1):
		y = input()
		if (1 <= y and y <= 64):
			z = int ((2**y)/12000.00)
			print "%d kg"%(z)