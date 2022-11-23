import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[]args) {
        List<Swiftie> swifties = new ArrayList<Swiftie>();
        Scanner input = new Scanner(System.in);
        Character swiftieChoice;
        while(true){
            displaySelect();

            swiftieChoice = input.next().charAt(0);
            swiftieChoice = Character.toUpperCase(swiftieChoice);
            
            switch (swiftieChoice){
                case 'A':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("How many song you want to add in the Playlist:  ");
                    int songNum = input.nextInt();
            
                   
                    if(songNum > 0){
                        for (int songs = 0; songs < songNum; songs++){
                            System.out.println("TS Playlist " + songs);
                            System.out.println("Taylor Swift Song: ");
                            String song = input.next();   
                            System.out.println("Where do you want to store this music?  (Device Code \n Cellphone: 23 \n Laptop: 12 \n Ipad: 34 )");
                            System.out.print("Type the Device Code: ");
                            int play = input.nextInt();
                            System.out.println("====TS Albums====");
                            System.out.println("\n Fearless_TV \n Speak_Now \n Red_TV \n 1989 \n Reputation \n Lover \n Folklore \n Evermore \n Midnights");
                            System.out.print("What album does it belong: ");
                            String album = input.next();
                            
                            Swiftie newSwifties = new Swiftie(song, album,play);
                            swifties.add(newSwifties);


                            
                        }
                    } else{
                        System.out.println("ERROR!");
                       break;
                    }
                    break;
                    
                case 'B':
                try{

                    System.out.print("PLaylist Number you want to remove: ");
                    int removeSong = input.nextInt();
                    swifties.remove(removeSong);
                    System.out.println(
                        "The TS Playlist " + removeSong + " is removed from the Swiftie Playlist"
                    );
                    if(removeSong < 0){
                        throw new OmneException("You cannot input negative number!");
                    }
                    break;
                }catch(OmneException e){
                    System.out.println(e.getMessage());
                }
                case 'C':
                    for (int ts = 0; ts < swifties.size(); ts++){
                        System.out.print("TS Playlist: "+ts + " Song: "+ swifties.get(ts).getSong()+"\t");
                        System.out.print("Device: "+swifties.get(ts).getplayMusic()+"\t");
                        System.out.print("Album: "+swifties.get(ts).getAlbum_era()+"\n");
                    }
                        System.out.println("Reminder! You need to charge your device! Do you want to change device? PLease type (Y/N)");
                        char change = input.next().toUpperCase().charAt(0);
                        if (change == 'Y'){
                        System.out.println("What TS Playlist needs to moved to another device? : ");
                        int playList = input.nextInt();
                        for (int i = 0; i < swifties.size(); i++) {
                            System.out.print("Taylor Swift Song: "+swifties.get(playList).getSong()+"\t");
                            System.out.print("TS Album: "+swifties.get(playList).getAlbum_era()+"\t");
                            System.out.print("Device Code: "+swifties.get(playList).getplayMusic());
                        }
                            System.out.println(" (Device Code \n Cellphone: 23 \n Laptop: 12 \n Ipad: 34 ");
                            System.out.print("What Code Device you will use: ");
                            int device = input.nextInt();
                            if (device < 0) {
                               
                                System.out.println("There are no negative numbers on the Device Code! Read it again!");
                                break;
                            }else{
                                    swifties.get(playList).changePlay(device);
                                    System.out.println(
                                    swifties.get(playList).getSong() + swifties.get(playList).getAlbum_era() + "has been moved to Code Device: " + swifties.get(playList).getChangePlay());
                                }
                        }
                        else{
                            System.out.println("You are still using your current device.");
                        }
                       
                
                break;

                case 'X':
                    System.out.println("The system has ended! Thank you for using Swiftie Playlist");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input! Please read the instruction carefully.");
                    continue;
            }

        }
    }


    public static void displaySelect(){
        System.out.println("||||||||||||||||||||||||||||||");
        System.out.println("=====Welcome to Swiftie Playlist======");
        System.out.println("A. Add Taylor Swift Songs");
        System.out.println("B. Remove Taylor Swift Songs");
        System.out.println("C. Display Taylor Swift Songs");
        System.out.println("X. Exit");
        System.out.println("||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.print("Select your choice: "); 
    }
}
