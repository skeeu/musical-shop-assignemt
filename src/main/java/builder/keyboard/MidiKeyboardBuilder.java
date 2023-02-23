package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electronic.MidiKeyboard;

public class MidiKeyboardBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String connectivityOptions;
    private String keyAmount;

    public MidiKeyboardBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public MidiKeyboardBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public MidiKeyboardBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public MidiKeyboardBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public MidiKeyboardBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public MidiKeyboardBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public MidiKeyboardBuilder withRecordingCapabilities(String recordingCapabilities) {
        this.recordingCapabilities = recordingCapabilities;
        return this;
    }

    public MidiKeyboardBuilder withConnectivityOptions(String connectivityOptions) {
        this.connectivityOptions = connectivityOptions;
        return this;
    }

    public MidiKeyboardBuilder withKeyAmount(String keyAmount) {
        this.keyAmount = keyAmount;
        return this;
    }

    public MidiKeyboard build() {
        return new MidiKeyboard(title, productionYear, productionCountry,
                color, price, keyMaterial, recordingCapabilities,
                connectivityOptions, keyAmount);
    }
}
