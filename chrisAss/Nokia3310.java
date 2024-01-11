import java.util.Scanner;

public class Nokia3310{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 1 to 13 to Access Menu Options");
System.out.print("1. Phone book\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. Sim services\n");

int menu = scanner.nextInt();
switch(menu){
case 1:
System.out.println("Phone book");
System.out.print("1. Search\n2. Service Nos.\n3. Add name\n4. Erase\n5. Edit\n6.  Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
System.out.println("Enter 1 to 10 to Access Phone book");
int phoneBook = scanner.nextInt();
switch(phoneBook){
case 1: System.out.println("Search");
break;
case 2: System.out.println("Service Nos.");
break;
case 3: System.out.println("Add name");
break;
case 4: System.out.println("Erase");
break;
case 5: System.out.println("Edit");
break;
case 6: System.out.println("Assign tone");
break;
case 7: System.out.println("Send b'card");
break;
case 8: System.out.println("Options");
		System.out.println("1. Type of view\n2. Memory status");
		System.out.println("Enter 1 or 2 to access Options");
		int options = scanner.nextInt();
		switch(options){
			case 1: System.out.println("Type of view");
			break;
			case 2: System.out.println("Memory status");
			break;
}
			
}
break;
case 9: System.out.println("Speed dials");
break;
case 10: System.out.println("voice tags");
break;
}
case 2:
System.out.println("Messages");
System.out.print("1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor ");
System.out.println("Input numbers from 1 to 10 to access the message menu\n");
int messageMenu = scanner.nextInt();
switch(messageMenu){
case 1: System.out.println("Write messages");
break;
case 2: System.out.println("Inbox");
break;
case 3: System.out.println("Outbox");
break;
case 4: System.out.println("Picture message");
break;
case 5: System.out.println("Templates");
break;
case 6: System.out.println("Smileys");
break;
case 7: System.out.print("Message settings");
break;
case 8: System.out.println("Info service");
break;
case 9: System.out.println("Voice mailbox number");
break;
case 10: System.out.println("Service command editor\n");
break;
}
case 3:
System.out.println("Chat");
int chatMenu = scanner.nextInt();
switch(chatMenu){
}
case 4:
System.out.println("Call register");
int callMenu = scanner.nextInt();
System.out.println("1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call lists\n5. Show call duration");
switch(callMenu){
case 1: 
System.out.println("Missed calls");
break;
case 2: System.out.println("Received calls");
break;
case 3: System.out.println("Dialled numbers");
break;
case 4: System.out.print("Show call duration");
break;
}
case 5:
System.out.println("Tones");
int callTones = scanner.nextInt();
System.out.println("1. Ringing tone\n2. ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game tones\n8. Vibrating alert\n9. Screen saver");
switch(callTones){
case 1: System.out.println("Ringing tone");
case 2: System.out.println("Ringing volume");
case 3: System.out.println("Incoming call alert");
case 4: System.out.println("Composer");
case 5: System.out.println("Message alert tone");
case 6: System.out.println("Warning and game tones");
case 7: System.out.print("Warning and game tones");
case 8: System.out.println("Vibrating alert");
case 9: System.out.println("Screen saver");
}
case 6:
System.out.println("Settings");
int callSettings = scanner.nextInt();
System.out.println("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
switch(callSettings){
case 1: System.out.println("Call settings");
case 2: System.out.println("Phone settings");
case 3: System.out.println("security settings");
case 4: System.out.println("Restore factory settings");
}
case 7:
System.out.println("Call divert");
int calllMenu = scanner.nextInt();
switch(calllMenu){
}
case 8:
System.out.println("Games");
int gameMenu = scanner.nextInt();
switch(gameMenu){
}
case 9:
System.out.println("Calculator");
int calMenu = scanner.nextInt();
switch(calMenu){
}
case 10:
System.out.println("Reminders");
int remMenu = scanner.nextInt();
switch(remMenu){
}
case 11:
System.out.println("Clock");
int cloMenu = scanner.nextInt();
switch(cloMenu){
}
case 12:
System.out.println("Profiles");
int proMenu = scanner.nextInt();
switch(proMenu){
}
case 13:
System.out.println("SIM services");
int simMenu = scanner.nextInt();
switch(simMenu){
}
}
}
}