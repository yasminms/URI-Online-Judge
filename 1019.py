# -*- coding: utf-8 -*-
a = input()
if(a >3600):
	min = a/60
	sec = a%60
	hr = min/60
	min = min%60
	print '%d:%d:%d' % (hr, min, sec)
else:
	min = a/60
	sec = a%60
	print '%d:%d:%d' % (0, min, sec)


