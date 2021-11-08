package com.goya.outer;

/**
 * @author goya
 * @create 2021-04-27 20:55
 */
public class Parcel4 {

    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination{

        private String label;

        public PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }

    public static class TestParcel{
        public static void main(String[] args) {
            Parcel4 p = new Parcel4();
            Contents contents = p.contents();
            Destination tasmania = p.destination("Tasmania");
        }
    }
}
