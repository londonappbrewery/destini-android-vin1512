package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button upButton;
    Button downButton;
    int mIndex;
    int mTextPointer;

    private WhichPath[] storyTree = new WhichPath[]{
            new WhichPath(R.string.T1_Story,R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new WhichPath(R.string.T1_Story,R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new WhichPath(R.string.T3_Story,R.string.T6_End,0,0),
            new WhichPath(R.string.T3_Story,R.string.T5_End,0,0),
            new WhichPath(R.string.T2_Story,R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new WhichPath(R.string.T2_Story,R.string.T4_End,0,0),
    } ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = (TextView) findViewById(R.id.storyTextView);
        upButton = (Button) findViewById(R.id.buttonTop);
        downButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextScene(1);
                if(mIndex==0){
                    mIndex=2;
                }else if(mIndex==1){
                    mIndex=2;
                }
            }
        });

         // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextScene(2);
                if(mIndex==0){
                    mIndex=1;
                }else if(mIndex==1){
                    mIndex=3;
                }
            }
        });

    }
    public void nextScene(int number){
        if(number==1 && mIndex==0){
            storyText.setText(storyTree[0].getNextText());
            upButton.setText(storyTree[0].getButtonUpText());
            downButton.setText(storyTree[0].getButtonDownText());
        }if(number==1 && mIndex==2){
            storyText.setText(storyTree[2].getNextText());
            upButton.setVisibility(View.GONE);
            downButton.setVisibility(View.GONE);
        }if(number==2 && mIndex==0){
            storyText.setText(storyTree[1].getNextText());
            upButton.setText(storyTree[1].getButtonUpText());
            downButton.setText(storyTree[1].getButtonDownText());
        }if(number==2 && mIndex==1){
            storyText.setText(storyTree[5].getNextText());
            upButton.setVisibility(View.GONE);
            downButton.setVisibility(View.GONE);
        }if(number==2 && mIndex==3){
            storyText.setText(storyTree[3].getNextText());
            upButton.setVisibility(View.GONE);
            downButton.setVisibility(View.GONE);
        }if(number==2 && mIndex ==2){
            storyText.setText(storyTree[3].getNextText());
            upButton.setVisibility(View.GONE);
            downButton.setVisibility(View.GONE);
        }if(number==1 && mIndex==1){
            storyText.setText(storyTree[0].getNextText());
            upButton.setText(storyTree[0].getButtonUpText());
            downButton.setText(storyTree[0].getButtonDownText());
        }

    }

}
