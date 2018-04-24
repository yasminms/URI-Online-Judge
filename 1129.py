n = 1
while (n != 0):
	n = input()
	for i in range(0, n, 1):
		t = raw_input().split()
		a, b, c, d, e = int(t[0]), int(t[1]), int(t[2]), int(t[3]), int(t[4])
		if (a <= 127 and b > 127 and c > 127 and d > 127 and e > 127):
			print "A"
		elif (a > 127 and b <= 127 and c > 127 and d > 127 and e > 127):
			print "B"
		elif (a > 127 and b > 127 and c <= 127 and d > 127 and e > 127):
			print "C"
		elif (a > 127 and b > 127 and c > 127 and d <= 127 and e > 127):
			print "D"
		elif (a > 127 and b > 127 and c > 127 and d > 127 and e <= 127):
			print "E"
		else:
			print "*"
