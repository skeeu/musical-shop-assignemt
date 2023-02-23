package database;

import instruments.Instrument;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InstrumentsDB {
    private static final DatabaseHandler db = DatabaseHandler.getInstance();
    public static final Map<String, Class> instrumentClasses = db.getInstrumentClasses();

    public List<Instrument> findIntrumentsByType(String instrumentType) {
        Session session = db.getSession().openSession();
        return session.createQuery("FROM " + instrumentType, instrumentClasses.get(instrumentType)).list();
    }

    public List<Instrument> findAll() {
        Session session = db.getSession().openSession();
        List<Instrument> instruments = new ArrayList<>();
        for(Map.Entry<String, Class> entry: instrumentClasses.entrySet()) {
            List<Instrument> classInstruments = session.createQuery("FROM " + entry.getKey(), entry.getValue()).list();
            instruments.addAll(classInstruments);
        }
        return instruments;
    }

    public void saveInstrument(Instrument instrument) {
        Session session = db.getSession().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(instrument);
        transaction.commit();
        session.close();
        System.out.println("You saved instrument to database");
    }
}
