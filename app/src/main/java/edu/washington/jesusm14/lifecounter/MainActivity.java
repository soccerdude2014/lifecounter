package edu.washington.jesusm14.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView playerOneText;
    TextView playerTwoText;
    TextView playerThreeText;
    TextView playerFourText;
    TextView loserPlayer;

    Button firstMinus;
    Button firstPlus;
    Button firstMinusFive;
    Button firstPlusFive;
    Button secondMinus;
    Button secondPlus;
    Button secondMinusFive;
    Button secondPlusFive;
    Button thirdMinus;
    Button thirdPlus;
    Button thirdMinusFive;
    Button thirdPlusFive;
    Button fourthMinus;
    Button fourthPlus;
    Button fourthMinusFive;
    Button fourthPlusFive;

    int[] playerScores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerScores = new int[4];
        playerScores[0] = 20;
        playerScores[1] = 20;
        playerScores[2] = 20;
        playerScores[3] = 20;

        playerOneText = (TextView) findViewById(R.id.playeronepoints);
        playerTwoText = (TextView) findViewById(R.id.playertwopoints);
        playerThreeText = (TextView) findViewById(R.id.playerthreepoints);
        playerFourText = (TextView) findViewById(R.id.playerfourpoints);
        loserPlayer = (TextView) findViewById(R.id.youlose);

        firstMinus = (Button) findViewById(R.id.firstminus);
        firstPlus = (Button) findViewById(R.id.firstplus);
        firstMinusFive = (Button) findViewById(R.id.firstminusfive);
        firstPlusFive = (Button) findViewById(R.id.firstplusfive);
        secondMinus = (Button) findViewById(R.id.secondminus);
        secondPlus = (Button) findViewById(R.id.secondplus);
        secondMinusFive = (Button) findViewById(R.id.secondminusfive);
        secondPlusFive = (Button) findViewById(R.id.secondplusfive);
        thirdMinus = (Button) findViewById(R.id.thirdminus);
        thirdPlus = (Button) findViewById(R.id.thirdplus);
        thirdMinusFive = (Button) findViewById(R.id.thirdminusfive);
        thirdPlusFive = (Button) findViewById(R.id.thirdplusfive);
        fourthMinus = (Button) findViewById(R.id.fourthminus);
        fourthPlus = (Button) findViewById(R.id.fourthplus);
        fourthMinusFive = (Button) findViewById(R.id.fourthminusfive);
        fourthPlusFive = (Button) findViewById(R.id.fourthplusfive);

        firstMinus.setOnClickListener(new myListener(0, -1, playerOneText));
        firstPlus.setOnClickListener(new myListener(0, 1, playerOneText));
        firstMinusFive.setOnClickListener(new myListener(0, -5, playerOneText));
        firstPlusFive.setOnClickListener(new myListener(0, 5, playerOneText));
        secondMinus.setOnClickListener(new myListener(1, -1, playerTwoText));
        secondPlus.setOnClickListener(new myListener(1, 1, playerTwoText));
        secondMinusFive.setOnClickListener(new myListener(1, -5, playerTwoText));
        secondPlusFive.setOnClickListener(new myListener(1, 5, playerTwoText));
        thirdMinus.setOnClickListener(new myListener(2, -1, playerThreeText));
        thirdPlus.setOnClickListener(new myListener(2, 1, playerThreeText));
        thirdMinusFive.setOnClickListener(new myListener(2, -5, playerThreeText));
        thirdPlusFive.setOnClickListener(new myListener(2, -5, playerThreeText));
        fourthMinus.setOnClickListener(new myListener(3, -1, playerFourText));
        fourthPlus.setOnClickListener(new myListener(3, 1, playerFourText));
        fourthMinusFive.setOnClickListener(new myListener(3, -5, playerFourText));
        fourthPlusFive.setOnClickListener(new myListener(3, 5, playerFourText));

    }

    public class myListener implements View.OnClickListener {

        int playerNumber;
        int scoreChange;
        TextView playerView;

        public myListener(int player, int change, TextView playerView) {
            playerNumber = player;
            scoreChange = change;
            this.playerView = playerView;
        }

        @Override
        public void onClick(View v) {
            playerScores[playerNumber] = playerScores[playerNumber] + scoreChange;
            playerView.setText("Points:" + playerScores[playerNumber]);
            if(playerScores[playerNumber] <= 0) {
                loserPlayer.setText("Player " + (playerNumber + 1) + " LOSES!");
            }
        }
    }
}


