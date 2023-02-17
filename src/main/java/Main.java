import database.DatabaseHandler;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.json.simple.parser.ParseException;
import roles.User;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Shop shop = new Shop();
    static DatabaseHandler db = new DatabaseHandler();
    public static void main(String[] args) throws IOException, ParseException {
        shop.startShop();

//        Scanner sc = new Scanner(System.in);
//        String username = sc.next();
//        String password = sc.next();
//        Session session = db.getSession().openSession();
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
//        Root<User> root = criteriaQuery.from(User.class);
//        System.out.println(root);
//        criteriaQuery.select(root).where(criteriaBuilder.and(criteriaBuilder.equal(root.get("username"), username), criteriaBuilder.equal(root.get("password"), password)));
//        List<User> users = session.createQuery(criteriaQuery).getResultList();
//        session.close();
//
//        System.out.println(users);
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
