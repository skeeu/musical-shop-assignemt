package database;

import instruments.keyboard.acoustic.dynamic.Celesta;
import instruments.keyboard.acoustic.dynamic.Clavichord;
import instruments.keyboard.acoustic.dynamic.Piano;
import instruments.keyboard.acoustic.statik.reed.Bayan;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;
import instruments.keyboard.acoustic.statik.wind.Organ;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;
import instruments.keyboard.digital.electronic.MidiKeyboard;
import instruments.keyboard.digital.electronic.Synthesizer;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import roles.Role;
import roles.User;

import java.util.HashMap;
import java.util.Map;

public class DatabaseHandler {
    private static DatabaseHandler instance;
    private SessionFactory sessionFactory;
    private final Map<String, Class> INSTRUMENTS_TYPES = new HashMap<String, Class>();

    private DatabaseHandler() {
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

    public static DatabaseHandler getInstance() {
        if (instance == null) {
            instance = new DatabaseHandler();
        }
        return instance;
    }

    public Map<String, Class> getInstrumentClasses () {
        return INSTRUMENTS_TYPES;
    }

    public SessionFactory getSession() {
        return sessionFactory;
    }
}
