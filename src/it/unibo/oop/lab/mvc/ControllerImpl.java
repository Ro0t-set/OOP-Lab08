package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {

    private final List<String> strings = new ArrayList();

    private int courrentStringIndex;

    /**
     * 
     * 
     * 
     */

    public String getNextString() {
        if (courrentStringIndex <= strings.size()) {
            return strings.get(courrentStringIndex++);
        }
        throw new IllegalStateException();
    }

    public void setNextString(final String s) {
        strings.add(courrentStringIndex, s);

    }

    public List<String> getPrintedStringHistory() {
        final List<String> historyList = new ArrayList<>();
        for (int i = 0; i <= courrentStringIndex; i++) {
            historyList.add(strings.get(i));
        }
        return historyList;
    }

    public void printCurrentString() {
        System.out.println(strings.get(courrentStringIndex));

    }

}
