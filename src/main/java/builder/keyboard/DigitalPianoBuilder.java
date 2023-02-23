package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;

public class DigitalPianoBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String pedalsAmount;
    private String keysType;

    public DigitalPianoBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public DigitalPianoBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public DigitalPianoBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public DigitalPianoBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public DigitalPianoBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public DigitalPianoBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public DigitalPianoBuilder withRecordingCapabilities(String recordingCapabilities) {
        this.recordingCapabilities = recordingCapabilities;
        return this;
    }

    public DigitalPianoBuilder withPedalsAmount(String pedalsAmount) {
        this.pedalsAmount = pedalsAmount;
        return this;
    }

    public DigitalPianoBuilder withKeysType(String keysType) {
        this.keysType = keysType;
        return this;
    }

    public DigitalPiano build() {
        DigitalPiano piano = new DigitalPiano(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities, pedalsAmount, keysType);
        return piano;
    }
}
