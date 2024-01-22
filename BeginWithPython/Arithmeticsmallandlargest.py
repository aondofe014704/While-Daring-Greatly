"""Arithmetic,small, and largest"""

number1 = int(input('Enter an integer one: '))

number2 = int(input('Enter an integer two: '))

number3 = int(input('Enter an integer three:'))

sum_of_integers = number1 + number2 + number3
print(sum_of_integers)

average_of_integers = number1 + number2 + number3 / 100
print(average_of_integers)

product_of_products = number1 * number2 * number3
print(product_of_products)

if number1 < number2 and number1 < number3:
	print('The Lowest number is:', number1)

if number2 < number3 and number2 < number1:
	print('The Lowest number is:', number2)

if number3 < number2 and number3 < number1:
	print('The Lowest number is:', number3)



if number1 > number2 and number1 > number3:
	print('The Highest number is:', number1)

if number2 > number3 and number2 > number1:
	print('The Highest number is:', number2)

if number3 > number2 and number3 > number1:
	print('The highest number is:', number3)






