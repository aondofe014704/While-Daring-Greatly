scores = float(input("Enter number of Students:"))
passMark=0
failMark=0
count=0


while (scores != -1 and scores <=100):
	if (scores >= 45):
		passMark +=1
		count+=1
		
	if (scores < 45):
		failMark +=1
		count+=1
	scores = float(input("Enter number of Students:"))
print(passMark)
print(failMark)

