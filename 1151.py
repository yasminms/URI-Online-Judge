n0 = 0
n1 = 1
n = input()
tot = "0 1"
while (n > 2):
	n1 = n1 + n0
	n0 = n1 - n0
	n2 = str(n1)
	tot = tot + " " + n2
	n -= 1
print tot