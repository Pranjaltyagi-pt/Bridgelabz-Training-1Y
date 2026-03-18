class ColourFeature {
    void printColor() {
        System.out.println("Printing in color");
    }
}

class Printer {
    private ColourFeature colourFeature;

    Printer(ColourFeature colourFeature) {
        this.colourFeature = colourFeature;
    }

    void print() {
        System.out.println("Printing document");

        if (colourFeature != null) {
            colourFeature.printColor();  // Delegation
        }
    }
}