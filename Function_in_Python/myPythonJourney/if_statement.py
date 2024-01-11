print("Welcome to the rollercoaster!")

height = int(input("what is your height in cm? "))

if height >= 120:
	print("You can ride the rollerCoaster!")
	age = int(input("what is your age? "))
	if age <= 18:
		print("You are to pay 7 dollars")

		if age <= 12:
			print("Your money is 5 dollars")
		elif age <= 15:
			print("Your money is 8 dolllars")
	else: 
		print("Your money is 15 dollars")	
else:
	print("Sorry, You have to grow taller before you can ride.")



