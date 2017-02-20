package com.webtree.baumgartner.storyapp.model;

/**
 * Created by Lukas on 20.02.2017.
 */

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice (String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
