import math 
def multiple(startNum, factor, sum):
  recurNum = startNum * factor
  
  if recurNum >= 1000:
  	return sum
    
  elif recurNum < 1000:
   sum += recurNum
   return multiple(startNum + 1, factor, sum)
	
def main():
  x = multiple(1, 3, 0) 
  y = multiple(1, 5, 0)
  z = x + y
  print(z)
    
main()
