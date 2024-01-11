import java.util.Arrays;

public class FruitConcatenation{

public static void main(String[] args){


String[] fruit = {"Grape", "Mango", "Pawpaw", "Orange"};

String[] place = {"Market", "School", "Church", "Field"};

String[] number = {"2", "4", "6", "8"};

String[] answer = new String[fruit.length + place.length + number.length];

int counter = 0;

for(int i = number.length -1; i >= 0; i-- ){
answer[counter] = number[i];

counter += 3;

}

int count = 1;

for(int o = 0; o <= fruit.length -1; o++){

answer[count] = fruit[o];
count += 3;

}
int counting = 2;
for(int j = 0; j < place.length; j++){
answer[counting] = place[j];
counting += 3;

}
System.out.print(Arrays.toString(answer));

}




}