"""Determine if an input from a user is odd or even Using the if statement"""


even_number =  int(input("Enter an integer to determine if its an odd or even number: "))

if even_number % 2 == 0:
	print('The integer', even_number, 'is an even integer')

if even_number % 2 != 0:
	print('The integer', even_number, 'is not an even integer')


