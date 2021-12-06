dictionary = {"Business":54019, "Information Technology":73000,"Biomedical Sciences": 71000,"Biology":73000,"Psychology": 64000,"History": 68000,"Engineering": 87000,"Communications": 63000,"Criminal Justice": 60000,"Computer Science": 87000,"Political Science": 70000,"Economics": 55965,"Social Studies": 63000,"Art": 63000,"Environmental Science": 61000}
key = input("Enter Your Major: ")
if key in dictionary:
	print ("Your Major's Cost:", dictionary[key])
else:
	print("That Major is Not in the Dictionary Yet.")
def NA():
	print("N/A")