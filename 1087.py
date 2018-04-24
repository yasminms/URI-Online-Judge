while True:
	t = raw_input().split()
	x1 = int(t[0])
	y1 = int(t[1])
	x2 = int(t[2])
	y2 = int(t[3])
	if x1 == 0 and y1 == 0 and x2 == 0 and y2 == 0:
		break
	if (x1 == x2 and y1 == y2):
		mov = 0
	elif (x1 == x2 or y1 == y2 or abs (y1 - y2) == abs (x1 - x2)):
		mov = 1
	else:
		mov = 2
	print mov


