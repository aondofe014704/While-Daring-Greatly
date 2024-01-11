import random

guess = random.randint(1, 10)

correct_number = int(input("Guess your Number"))

correct_number = 1
while correct_number <= 10:
  if correct_number == 7:
    print("you have won")
  if correct_number != 7:
    print("Try again")
  if correct_number <= 7:
    print("Your time is up")
    print(correct_number)

  correct_number += 1