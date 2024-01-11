year = int(input("which year do you want to check:"))

if year % 4 == 0:
	print("Leap year")

	if year % 100 == 0:
		
		print("Not a leap year")

		if year % 400 == 0:
			print("leap year")
else:
	print("Not a leap year")
