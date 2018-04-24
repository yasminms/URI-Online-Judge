k = 1
while (k != 0):
	k = input()
	if (k != 0):
		tec = raw_input().split()
		n, m = int(tec[0]), int(tec[1])
		for i in range(0, k, 1):
			t = raw_input().split()
			x = int(t[0])
			y = int(t[1])
			if (x == n or y == m):
				print "divisa"
			elif (x > n and y > m):
				print "NE"
			elif (x < n and y > m):
				print "NO"
			elif (x < n and y < m):
				print "SO"
			elif (x > n and y < m):
				print "SE"
