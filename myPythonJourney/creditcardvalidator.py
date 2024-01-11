sum_odd_digits = 0

sum_even_digits = 0

total_sum_of_numbers = 0


card_number = input("Hello, Kindly Enter Card details to verify:\n")

card_number = card_number.replace("-", "")
card_number = card_number.replace(" ", "")

card_number = card_number[:: -1]

for card_validity in card_number[::2]:

	sum_odd_digits += int(card_validity)

	#print(sum_odd_digits)


for card_validity in card_number[1::2]:
	
	card_validity = int(card_validity) * 2
	
	if card_validity >= 10:
		sum_even_digits += (1 + (card_validity % 10))
	else:
		sum_even_digits += card_validity


total_sum_of_numbers = sum_odd_digits + sum_even_digits

print(total_sum_of_numbers)

if total_sum_of_numbers % 10 == 0:
	
	print("VALID")

else:
	print("INVALID")


	#print(sum_even_digits)
		

#print(card_number)