def fib(x, y, total, ticker):
	z = x + y
	
	if z <= 4000000:
		
		if ticker:
			z += total
			x = z
			ticker = False
			return fib(x, y, total, ticker)
		
		else:
			z += total
			y = z
			ticker = True
			return fib(x, y, total, ticker)
	
	else: 
		return total + 2

def main():
	answer = fib(x = 1, y = 2, total = 0, ticker = True)
	print(answer)

main()
