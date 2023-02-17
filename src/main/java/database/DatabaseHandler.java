package database;

import instruments.Instrument;
import instruments.keyboard.acoustic.dynamic.Celesta;
import instruments.keyboard.acoustic.dynamic.Clavichord;
import instruments.keyboard.acoustic.dynamic.Piano;
import instruments.keyboard.acoustic.statik.reed.Bayan;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;
import instruments.keyboard.acoustic.statik.wind.Organ;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;
import instruments.keyboard.digital.electronic.MidiKeyboard;
import instruments.keyboard.digital.electronic.Synthesizer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import roles.Role;
import roles.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseHandler {
    private static SessionFactory sessionFactory;
    private static final Map<String, Class> INSTRUMENTS_TYPES = new HashMap<String, Class>();

    public Map<String, Class> getInstrumentClasses () {
        return INSTRUMENTS_TYPES;
    }
    public SessionFactory getSession() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

            configuration.addAnnotatedClass(Celesta.class);
            configuration.addAnnotatedClass(Clavichord.class);
            configuration.addAnnotatedClass(Piano.class);

            configuration.addAnnotatedClass(Bayan.class);
            configuration.addAnnotatedClass(PumpOrgan.class);

            configuration.addAnnotatedClass(Organ.class);

            configuration.addAnnotatedClass(DigitalPiano.class);

            configuration.addAnnotatedClass(MidiKeyboard.class);
            configuration.addAnnotatedClass(Synthesizer.class);

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Role.class);

            INSTRUMENTS_TYPES.put(Celesta.class.getSimpleName(), Celesta.class);
            INSTRUMENTS_TYPES.put(Clavichord.class.getSimpleName(), Clavichord.class);
            INSTRUMENTS_TYPES.put(Piano.class.getSimpleName(), Piano.class);

            INSTRUMENTS_TYPES.put(Bayan.class.getSimpleName(), Bayan.class);
            INSTRUMENTS_TYPES.put(PumpOrgan.class.getSimpleName(), PumpOrgan.class);

            INSTRUMENTS_TYPES.put(Organ.class.getSimpleName(), Organ.class);

            INSTRUMENTS_TYPES.put(DigitalPiano.class.getSimpleName(), DigitalPiano.class);

            INSTRUMENTS_TYPES.put(MidiKeyboard.class.getSimpleName(), MidiKeyboard.class);
            INSTRUMENTS_TYPES.put(Synthesizer.class.getSimpleName(), Synthesizer.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    public List<Instrument> findIntrumentsByType(String instrumentType) {
        Session session = getSession().openSession();
        return session.createQuery("FROM " + instrumentType, INSTRUMENTS_TYPES.get(instrumentType)).list();
    }

    public Instrument findInstrumentById(int id, String instrumentType) {
        Session session = getSession().openSession();
        return (Instrument) session.get(INSTRUMENTS_TYPES.get(instrumentType), id);
    }

    public List<Instrument> findAll() {
        Session session = getSession().openSession();
        List<Instrument> instruments = new ArrayList<>();
        for(Map.Entry<String, Class> entry: INSTRUMENTS_TYPES.entrySet()) {
            List<Instrument> classInstruments = session.createQuery("FROM " + entry.getKey(), entry.getValue()).list();
            instruments.addAll(classInstruments);
        }
        return instruments;
    }
}
