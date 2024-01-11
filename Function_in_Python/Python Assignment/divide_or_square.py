import math

number = int(input("Enter number: "))


def divide_or_square(number):
	if number % 5 == 0:
		return math.sqrt(number)

		print(number)
	else: 
		return number  % 5

divide_or_square(number)

print(divide_or_square(number))