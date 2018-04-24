t = [float (i) for i in raw_input().split()]
a, b, c = float(t[0]), float(t[1]), float(t[2])
t.sort()
a = t[2]
b = t[1]
c = t[0]
if (a >= (b + c)):
	print "NAO FORMA TRIANGULO"
else:
	if ((a * a) == (b * b) + (c * c)):
		print "TRIANGULO RETANGULO"
	if ((a * a) > (b * b) + (c * c)):
		print "TRIANGULO OBTUSANGULO"
	if ((a * a) < (b * b) + (c * c)):
		print "TRIANGULO ACUTANGULO"
	if (a == b and a == c):
		print "TRIANGULO EQUILATERO"
	if (a == b and c != a or b == c and a != b or a == c and b != a):
		print "TRIANGULO ISOSCELES"
