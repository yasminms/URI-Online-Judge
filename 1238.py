n = input()
frase = ""
for i in xrange(n):
    l = raw_input().split()
    a = l[0]
    b = l[1]
    for x in xrange(len(a)+len(b)):
        if (x < len(a)):
            frase = frase+a[x]
        if (x < len(b)):
            frase = frase+b[x]
    print frase
    frase = ""