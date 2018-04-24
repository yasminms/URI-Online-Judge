x = False
y = False
l = raw_input().split();
a, b = int(l[0]), int(l[1])
if (a>=0 and a<=432):
	x = True
if (b>=0 and b<=468):
	y = True
if (x==True and y==True):
	print "dentro"
else:	
	print "fora"