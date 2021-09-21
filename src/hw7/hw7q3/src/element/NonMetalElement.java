package element;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(
                "Non Metal:" +
                        "\nSymbol: " + this.getSymbol() +
                        "\tAtomic Number: " + this.getAtomicNumber() +
                        "\tAtomic Weight: " + this.getAtomicWeight() +
                        "\nIn chemistry, a nonmetal is a chemical element that is mechanically weak in its most stable form," +
                        "\nbrittle if solid, and usually gains or shares electrons in chemical reactions. There is no universal" +
                        "\nagreement on which elements are nonmetals; the numbers generally range from fourteen to twenty-three," +
                        "\ndepending on the criterion or criteria of interest. Typical nonmetals lack the shiny appearance of metals;" +
                        "\nhave relatively low melting points, boiling points, and densities; and are poor conductors of heat and" +
                        "\nelectricity. Chemically, they tend to have higher values of ionization energy, electron affinity, and" +
                        "\nelectronegativity; negative or positive oxidation states in compounds (whereas metals nearly always have" +
                        "\npositive oxidation states); and their oxides tend to be acidic. They form many more compounds than do" +
                        "\nmetals. Most or some nonmetals share a range of other properties; a few have properties that are anomalous."
        );
    }
}
