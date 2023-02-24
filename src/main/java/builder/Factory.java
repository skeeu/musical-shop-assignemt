package builder;

import builder.keyboard.*;
import database.InstrumentsDB;
import instruments.keyboard.acoustic.dynamic.Celesta;
import instruments.keyboard.acoustic.dynamic.Clavichord;
import instruments.keyboard.acoustic.dynamic.Piano;
import instruments.keyboard.acoustic.statik.reed.Bayan;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;
import instruments.keyboard.acoustic.statik.wind.Organ;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;
import instruments.keyboard.digital.electronic.MidiKeyboard;
import instruments.keyboard.digital.electronic.Synthesizer;

import java.util.Scanner;

public class Factory {
    private static final InstrumentsDB db = new InstrumentsDB();
    private final Scanner sc;

    public Factory(Scanner sc) {
        this.sc = sc;
    }

    public void createAndSaveInstrument(String type) {
        switch (type) {
            case "Bayan":
                Bayan bayan = new BayanBuilder(sc)
                        .withTitle().withProductionYear().withProductionCountry()
                        .withColor().withPrice().withKeyMaterial().withSoundGenerationMethod()
                        .withSoundProductionMethod().withAirPressureRequirements().withRowsNumber()
                        .build();
                db.saveInstrument(bayan);
                break;
            case "Celesta":
                Celesta celesta = new CelestaBuilder(sc)
                        .withTitle().withColor().withKeyMaterial().withHammerMaterial()
                        .withPrice().withProductionCountry().withProductionYear()
                        .withSoundGenerationMethod().withShape().withOctaveType()
                        .build();
                db.saveInstrument(celesta);
                break;
            case "Clavichord":
                Clavichord clavichord = new ClavichordBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withSoundGenerationMethod().withHammerMaterial().withTableLegs().withShape()
                        .build();
                db.saveInstrument(clavichord);
                break;
            case "Piano":
                Piano piano = new PianoBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withSoundGenerationMethod().withHammerMaterial().withHeight()
                        .withShape()
                        .build();
                db.saveInstrument(piano);
                break;
            case "PumpOrgan":
                PumpOrgan porgan = new PumpOrganBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withAirPressureRequirements().withSoundGenerationMethod()
                        .withSoundProductionMethod()
                        .build();
                db.saveInstrument(porgan);
                break;
            case "Organ":
                Organ organ = new OrganBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withSoundGenerationMethod().withAirProductionMechanism()
                        .withSoundProductionMethod().withSpecialisation()
                        .build();
                db.saveInstrument(organ);
                break;
            case "DigitalPiano":
                DigitalPiano dp = new DigitalPianoBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withKeysType().withRecordingCapabilities().withPedalsAmount()
                        .build();
                db.saveInstrument(dp);
                break;
            case "MidiKeyboard":
                MidiKeyboard mk = new MidiKeyboardBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withRecordingCapabilities().withConnectivityOptions()
                        .withKeyAmount()
                        .build();
                db.saveInstrument(mk);
                break;
            case "Synthesizer":
                Synthesizer synthesizer = new SynthesizerBuilder(sc)
                        .withTitle().withColor().withPrice().withProductionCountry().withProductionYear()
                        .withKeyMaterial().withRecordingCapabilities().withConnectivityOptions().withPolyphony()
                        .build();
                db.saveInstrument(synthesizer);
                break;
            default:
                System.out.println("Type not found");

        }
    }
}
