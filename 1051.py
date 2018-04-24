val = input()
a = 0
b = 0
c = 0
if (val >= 0.00 and val <= 2000.00):
	print "Isento"
elif (val >= 2000.01 and val <= 3000.00):
	a = val - 2000.00
elif (val >= 3000.01 and val <= 4500.00):
	a = 1000.00
	b = val - 3000.00
elif (val > 4500.00):
	a = 1000.00
	b = 1500.00
	c = val - 4500.00
tot = ((a*8)/100)+((b*18)/100)+((c*28)/100)
if (tot != 0):
	print "R$ %.2f"%(tot)