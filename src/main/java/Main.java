import database.DatabaseHandler;
import instruments.keyboard.acoustic.dynamic.Celesta;
import instruments.keyboard.acoustic.dynamic.Clavichord;
import instruments.keyboard.acoustic.dynamic.Piano;
import instruments.keyboard.acoustic.statik.reed.Bayan;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;
import instruments.keyboard.acoustic.statik.wind.Organ;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;
import instruments.keyboard.digital.electronic.MidiKeyboard;
import instruments.keyboard.digital.electronic.Synthesizer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Shop shop = new Shop();
    static DatabaseHandler db = new DatabaseHandler();
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
//        shop.startShop();
//        JSONParser jsonParser = new JSONParser();
//        FileReader reader = new FileReader("src/main/java/organ.json");
//        JSONObject obj = (JSONObject) jsonParser.parse(reader);
//
//        JSONArray bayans = (JSONArray) obj.get("organ");
//        bayans.forEach(in -> parseIn((JSONObject) in));
    }

//    public static void parseIn(JSONObject in) {
//
//        String title = (String) in.get("title");
//        int productionYear = ((Long) in.get("productionYear")).intValue();
//        String productionCountry = (String) in.get("productionCountry");
//        String color = (String) in.get("color");
//        double price = (double) ((Long) in.get("price")).intValue();
//        String keyMaterial = (String) in.get("keyMaterial");
//        String soundGenerationMethod = (String) in.get("soundGenerationMethod");
//        String soundProductionMethod = (String) in.get("soundProductionMethod");
//        String airProductionMechanism = (String) in.get("airProductionMechanism");
//        String specialisation = (String) in.get("specialisation");
//
//        Organ b = new Organ(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airProductionMechanism, specialisation);
//        db.save(b);
//    }
}
