"""find the minimum of the three values"""

number1 = int(input('Enter first integer: '))

number2 = int(input('Enter second integer: '))

number3 = int(input('Enter third integer: '))

minimum = number1

if number1 < minimum:
	minimum = number2

if number2 < minimum:
	minimum = number3
print('minimum value is:', minimum)

print('Range:', min(12, 44, 67, 65, 76), ' - ', max(23, 89, 69, 43, 54))