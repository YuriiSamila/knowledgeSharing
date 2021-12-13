package main.patterns.structural.facade;

public enum ToyBoxes {

    SMALL {
        @Override
        public String toString() {
            return "Small";
        }
    },
    MEDIUM {
        @Override
        public String toString() {
            return "Medium";
        }
    },
    BIG {
        @Override
        public String toString() {
            return "Big";
        }
    }


}
