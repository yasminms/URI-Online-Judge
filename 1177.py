t = input()
vet = []
for i in xrange(1000):
	for x in xrange(t):
		vet.append(x)

for i in xrange(1000):
	print "N[%d] = %d"%(i, vet[i])