package com.londonappbrewery.destini;

public class WhichPath {

    private int mTextOnScreen;
    private int mNextText;
    private int mButtonUpText;
    private int mButtonDownText;

    WhichPath(int text_displayed, int nextText_displayed, int button1,int button2 ){
        mTextOnScreen = text_displayed;
        mNextText = nextText_displayed;
        mButtonUpText = button1;
        mButtonDownText = button2;

    };

    public int getTextOnScreen() {
        return mTextOnScreen;
    }

    public void setTextOnScreen(int textOnScreen) {
        mTextOnScreen = textOnScreen;
    }

    public int getNextText() {
        return mNextText;
    }

    public void setNextText(int nextText) {
        mNextText = nextText;
    }

    public int getButtonUpText() {
        return mButtonUpText;
    }

    public void setButtonUpText(int buttonUpText) {
        mButtonUpText = buttonUpText;
    }

    public int getButtonDownText() {
        return mButtonDownText;
    }

    public void setButtonDownText(int buttonDownText) {
        mButtonDownText = buttonDownText;
    }
}
