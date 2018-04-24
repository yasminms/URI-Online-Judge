i = 1
leitura = raw_input().split()
a = int(leitura[0])
b = int(leitura[1])
if (a > b):
	while (a * i < b * (i+1)):
		i+=1
elif (b > a):
	while (b * i < a * (i+1)):
		i+=1
print i+1
