"""How to loop over a list"""
programming_list = ["Java", "Python", "Golang", "Cobol", "Html"]
for index in range(len(programming_list)):

	print("Hello", programming_list[index])



"""NESTED for LOOP IN PYTHON"""
companies = ["Dangote","Google", "Apple", "Julius Berger", "Glovo", "Uber"]
for index in companies:   
	print("we will print each letter of " + index)
	for letter in index:
		print(letter)
