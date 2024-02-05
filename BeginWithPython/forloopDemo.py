"""for loop Demo"""

school_name = 'Semicolon'

for index in school_name:

	print(index)


"""printing with the end =" ** " key word"""

school_name2 = 'Semicolon'

for index in school_name2:
	print(index, end = "*")

"""How to use for loop in a list"""

programming = ["\nJava", "Python", "Ruby", "JavaScript", "Golang", "C++", "Scala"]

for iterator in programming:
	print(iterator)


"""Finding the average of a list of numbers"""
list_numbers = [20, 25, 10, 50, 45]

sum = 0
for i in list_numbers:
	sum = sum + i
	print("sum = ", sum)
	print("Average = ", sum/len(list_numbers))
	

"""Finding the average of a list of numbers"""
list_numbers2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

sum = 0
for i in list_numbers2:
	sum = sum + i
	print("sum = ", sum)
	print("Average = ", sum/len(list_numbers2))

"""for loop using a tuple"""

my_nums = (30, 45, 60, 70)
sum = 0
for index in my_nums:
	sum = sum + index
	print(sum)
	








