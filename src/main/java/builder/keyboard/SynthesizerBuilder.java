package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electronic.Synthesizer;

public class SynthesizerBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String connectivityOptions;
    private int polyphony;

    public SynthesizerBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public SynthesizerBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public SynthesizerBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public SynthesizerBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public SynthesizerBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public SynthesizerBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public SynthesizerBuilder withRecordingCapabilities(String recordingCapabilities) {
        this.recordingCapabilities = recordingCapabilities;
        return this;
    }

    public SynthesizerBuilder withConnectivityOptions(String connectivityOptions) {
        this.connectivityOptions = connectivityOptions;
        return this;
    }

    public SynthesizerBuilder withPolyphony(int polyphony) {
        this.polyphony = polyphony;
        return this;
    }

    public Synthesizer build() {
        return new Synthesizer(title, productionYear, productionCountry, color, price, keyMaterial,
                recordingCapabilities, connectivityOptions, polyphony);
    }
}
