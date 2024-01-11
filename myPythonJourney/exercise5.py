name = input("Please Enter Your name:")

age = int(input("Enter your current Age: "))

age_as_int = int(age)

years_remaining = 90 - age_as_int

days_remaining = years_remaining * 365

weeks_remaining = years_remaining * 52

months_remaining = years_remaining * 12

message = (f"Hello {name}, You have {days_remaining} days, {weeks_remaining} weeks and {months_remaining} months left")

print(message)





