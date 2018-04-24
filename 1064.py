cont=0
soma=0
for i in xrange (0, 6, 1):
    a = input()
    if (a > 0):
        soma = soma + a
        cont = cont+1
tot = soma/cont
print "%d valores positivos"%(cont)
print "%.1f"%(tot)