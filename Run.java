import java.io.*;
public class Run {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // The BufferedReader used throughout
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Ask whether to play a card game or a die game
            System.out.print("Card (c) or Die (d) game? ");
            String ans = br.readLine();


            GameFactory gameFactory = mainFactory.chooseGame(ans);
            Game game = gameFactory.Start();
            game.Play();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

}