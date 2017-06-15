package ru.demetra.callrec.dao;

import org.hibernate.Session;
import ru.demetra.callrec.model.Call;
import ru.demetra.callrec.util.HibernateUtil;

import java.util.List;

/**
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */

public class CallDaoImpl implements CallDao {
    @Override
    public List<Call> listCalls() {

        List<Call> calls = null;

        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            calls = session.createCriteria(Call.class).list();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();

        }
        return calls;
    }

    @Override
    public List<Call> listCallsDemetra() {

        List<Call> callsDemetra = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            callsDemetra = (List<Call>) session.createQuery("from Call where src='6606' or src='6602'").list(); //Extensions 6606/6602 ENT Department
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return callsDemetra;
    }

    @Override
    public List<Call> listCallsTrapeza() {
        List<Call> callsTrapeza = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            callsTrapeza = (List<Call>) session.createQuery("from Call where src!='6606' or src!='6602'").list();   //Extensions 6606/6602 ENT Department
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return callsTrapeza;
    }
}
