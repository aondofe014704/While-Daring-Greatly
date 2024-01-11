public class PrimitiveTypes{


public static void main(String[] args){

int myValue = 10000;
int myMinIntValue = Integer.MIN_VALUE;
int myMaxIntValue = Integer.MAX_VALUE;

System.out.println("Integer Minimum Value = " + myMinIntValue);

System.out.println("Integer Maximum Value = " + myMaxIntValue);

byte myMinByteValue = Byte.MIN_VALUE;
byte myMaxByteValue = Byte.MAX_VALUE;

short myMinShortValue = Short.MIN_VALUE;
short MyMaxShortValue = Short.MAX_VALUE;

long myLongValue = 100L;

long myMinLongValue = Long.MIN_VALUE;
long myMaxLongValue = Long.MAX_VALUE;

System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

int myMaxIntTest = 2_147_483_647;

System.out.println("Byte minimum Value = " + myMinByteValue);

System.out.println("Byte maximum Value = " + myMaxByteValue);

System.out.println("Short minimum value = " + myMinShortValue);

System.out.println("Short maximum value = " + MyMaxShortValue);

System.out.println("Long minimum value = " + myMinLongValue);
System.out.println("Long maximum value = " + myMaxLongValue);
System.out.println(myMaxIntTest);



}

}