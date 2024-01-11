
#*** part One***

weight = int(input("enter your weight in kg: "))

height = float(input("enter your height in m: "))

result = height ** 2


BMI = round(weight / float(result))
BMI_as_int_1 = int(BMI)
if BMI_as_int_1 > 18:
	print(f"Your BMI is {BMI_as_int_1} and you are underweight")
elif BMI_as_int_1 < 25:
	print(f"your BMI is {BMI_as_int_1} and you are normal weight")
elif BMI_as_int_1 < 30:
	print(f"your BMI is {BMI_as_int_1} and you are overweight")
elif BMI_as_int_1 < 35:
	print(f"your BMI is {BMI_as_int_1} and you are obese")
else:
	print(f"your BMI is {BMI_as_int_1} and you are clinically obese")

print (BMI_as_int_1)


#***part Two***

#height_1 = input("Enter your height in m:")

#weight_1 = input("Enter your weight in kg:")


#Bmi = int(weight) / float(height) ** 2

#Bmi_as_int = int(Bmi)
#print(Bmi_as_int)