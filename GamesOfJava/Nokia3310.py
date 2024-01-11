print("List of menu functions")
print("1.  Phone book")
print("2.  Messages")
print("3.  Chat")
print("4.  Call register")
print("5.  Tones")
print("6.  Settings")
print("7.  Call divert")
print("8.  Games")
print("9.  Calculator")
print("10. Remainders")
print("11. clock")
print("12. Profiles")
print("13. SIM services")



functions = int(input("Enter number 1 to 13 to access the menu : "))
while functions >= 1 or functions <= 13:  
	match functions:
		case 1: 
			print("1. Search")
			print("2. Service Nos.")
			print("3. Add name")
			print("4. Erase")
			print("5. Edit")
			print("6. Assign tone")
			print("7. Send b'card")
			print("8. Options")
			print("9. Speed dials")
			print("10.Voice tags")
			
			phonebook1 = int(input("select from options 1-10 :"))
			match phonebook1:
				case 1: 
					print("Search")
				case 2: 
					print("Service Nos.")
				case 3:
					print("Add name")
				case 4:
					print("Erase")
				case 5:
					print("Edit")
				case 6: 
					print("Assign tone")
				case 7: 
					print("Send b'card")
				case 8: 
					print("Options")
				case 9:
					print("Speed dials")
				case 10:
					print("Voice Tags")
				
		
				
		case 2:
			print("Messages")
			print("1. Write messages")
			print("2. Inbox")
			print("3. Outbox")
			print("4. Picture Messages")
			print("5. Templates")
			print("6. Smileys")
			print("7. Message settings")
			print("9. Info service")
			print("10.Voice mailbox number")
			print("11.Service command editor")


			Message1 = int(input("Select from options 1 t0 10 : "))
			match message1: 
				case 1:
					print("Write messages")
				case 2: 
					print("Inbox")
				case 3:
					print("Outbox")
				case 4:
					print("Picture messages")
				case 5:
					print("Templates")
				case 6:
					print("Smileys")
				case 7:
					print("Message settings\n1.Set 1\n2. Common")
			
		case 3:
			print("Chat")
				

		case 4:
			
			print("Call register")
			print("Missed calls")
			print("Received calls")
			print("Dialled numbers")
			print("Erase recent call lists")
			print("Show call duration")

			call_register_one = int(input("select from options 1 to 6 to access call register : "))
			match call_register_one:
				case 1:
					print("Call register")
				case 2:
					print("Missed calls")
				case 3:
					print("Received calls")
				case 4: 
					print("Dialled numbers")
				case 5:
					print("Erase recent call lists")
				case 6:
					print("Show call duration")
						


				
		case 5:
			print("Tones")
			print("1. Ringing tone")
			print("2. Ringing volume")
			print("3. Incoming call alert")
			print("4. Composer")
			print("5. Message alert tone")
			print("6. Keypad tones")
			print("7. Warning and Game tones")
			print("8. Vibrating alert")
			print("9. Screen saver")


			nokia_tones = int(input("select from options 1 to 9 to access tones : "))
			match nokia_tones:		
				case 1:
					print("Ringing tone")
				case 2:
					print("Ringing volume")
				case 3:
					print("Incoming call alert")
				case 4:	
					print("Composer")
				case 5:
					print("Message alert tone")
				case 6: 
					print("Keypad tones")
				case 7:
					print("Warning and Game tones")
				case 8:
					print("Vibrating alert")
				case 9:
					print("Screen saver")
				
		case 6:
			print("Settings")
			print("Call settings")
			print("Phone settings")
			print("Security settings")
			print("Restore factory settings")



			nokia_settings = int(input("select from options 1 to 4 to access"))
				
			match nokia_settings:
				case 1:
					print("Call settings")
					print("1. Automatic redial")
					print("2. Speed dialling")
					print("3. Call waiting options")
					print("4. Own numbers sending")
					print("5. Phone line in use")
					print("6. Automatic answer")
					nokia_call_settings = int(input("Select from options 1 to 6 to access call settings"))
					
					match nokia_call_settings:
						case 1:
							print("Automatic redial")
						case 2:
							print("Speed dialling")
						case 3:
							print("Call waiting options")
						case 4:
							print("Own numbers sending")
						case 5:
							print("Phone line in use")
						case 6:
							print("Automatic answer")
			
				case 2:
					print("Phone settings")
					print("1. Language")
					print("2. Cell info display")
					print("3. Welcome note")
					print("4. Network selection")
					print("5. lights")
					print("6. Confirm SIM service actions")
				
					nokia_print_options = int(input("Select from options 1 to 6 to access phone settings"))

					match nokia_print_options:
						case 1: 
							print("Language")
						case 2:
							print("Cell info display")
						case 3:
							print("Welcome note")
						case 4:
							print("Network selection")
						case 5:
							print("lights")
						case 6:
							print("Confirm SIM service actions")

				case 3:
					print("Security settings")
					print("1. PIN code request")
					print("2. Call barring service")
					print("3. Fixed Dialling")
					print("4. Closed user group")
					print("5. Phone security")
				case 4:
					print("Restore factory settings")
				
				
		case 7: 
			print("Call divert")
		case 8:
			print("Games")
		case 9: 
			print("Reminders")
		case 10:
			print("Calculator")
		case 11: 
			print("Clock")
		case 12:
			print("Profiles")
		case 13:
			print("SIM services")

	
	
