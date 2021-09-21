package element;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println(
                "Metal:" +
                        "\nSymbol: " + this.getSymbol() +
                        "\tAtomic Number: " + this.getAtomicNumber() +
                        "\tAtomic Weight: " + this.getAtomicWeight() +
                        "\nA metal is a material that, when freshly prepared, polished, or fractured, shows a lustrous appearance," +
                        "\nand conducts electricity and heat relatively well. Metals are typically malleable (they can be hammered" +
                        "\ninto thin sheets) or ductile (can be drawn into wires). A metal may be a chemical element such as iron;" +
                        "\nan alloy such as stainless steel; or a molecular compound such as polymeric sulfur nitride."
        );
    }
}
