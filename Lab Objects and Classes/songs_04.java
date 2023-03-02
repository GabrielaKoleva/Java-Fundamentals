import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs_04 {

    static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
        public String getTypeList() {
            return typeList;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Song> currentSong = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            String[] arrayInput = input.split("_");

            Song song = new Song(arrayInput[0], arrayInput[1], arrayInput[2]);

            currentSong.add(song);
        }

        String command = scan.nextLine();
        if (command.equals("all")) {
            for (Song nameOfSong : currentSong) {
                System.out.println(nameOfSong.getName());
            }
        }else {
            for (Song nameOfSong:currentSong) {
                if (nameOfSong.getTypeList().equals(command)){
                    System.out.println(nameOfSong.getName());
                }

            }
        }
    }
}
