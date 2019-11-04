package com.goolge.ketang.ketang1;

public class Dictionary extends Book {
    private int definitions = 5000;
    public double computerRtio(){
        return definitions/pages;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }
}
