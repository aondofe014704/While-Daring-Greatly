def check_duplicates(items):

	for item in range(len(items)):

		for item1 in range(item + 1, len(items)):

	if items[item] == items[item1]:

		return f"{items[item]} has a duplicate
	
	return f"no duplicate found"

fruit = ['apple', 'orange', 'banana', 'apple']

print(check_duplicates(fruit))