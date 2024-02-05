"""How to use the range Function in for loop"""

for i in range(1, 10):
	print(i)

"""How to use a step in a Range function"""
 
for i in range(0, 10, 2):

	print("Display values with a step size of 2: 0", i)

"""Program that print table of a given number"""

number = int(input("Enter your number :  "))

for index in range(1, 11):

	multiply = number * index

	print(number,"*",index, "=", multiply )
	