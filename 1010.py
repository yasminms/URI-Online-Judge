# -*- coding: utf-8 -*-
leitura = raw_input().split()
leitura2 = raw_input().split()
a, b, c= int(leitura[0]), int(leitura[1]), float(leitura[2])
a2, b2, c2 = int(leitura2[0]), int(leitura2[1]), float(leitura2[2])
tot = (b*c) + (b2*c2)
print 'VALOR A PAGAR: R$ %1.2f' % (tot)
