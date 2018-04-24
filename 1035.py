f = raw_input().split()
a, b, c, d = int(f[0]), int(f[1]), int(f[2]), int(f[3]) 
if (b>c and d>a and (c+d)>(a+b) and c>0 and d>0 and a%2==0):
    print "Valores aceitos"
else:
    print "Valores nao aceitos"
            