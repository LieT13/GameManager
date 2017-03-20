package com.jmalfonso.gamemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class SelectPlayersActivity extends AppCompatActivity {

    public static final int INIT_WEIGHT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_players);
    }

    public void addPlayer(View view) {
        TableLayout table = (TableLayout) findViewById(R.id.select_players);

        EditText newPlayerEdit = new EditText(this);
        newPlayerEdit.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.MATCH_PARENT, INIT_WEIGHT));
        newPlayerEdit.setHint("Enter player name");

        TableRow playerNameRow = new TableRow(this);
        playerNameRow.addView(newPlayerEdit);

        table.addView(playerNameRow, table.getChildCount() - 1);
    }

    public void startGame(View view) {
        // TODO
    }

}
