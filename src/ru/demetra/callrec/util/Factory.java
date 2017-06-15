package ru.demetra.callrec.util;

import ru.demetra.callrec.dao.CallDao;
import ru.demetra.callrec.dao.CallDaoImpl;

/**
 * Get factory for CallDaoImpl
 *
 * Singleton pattern
 *
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */

public class Factory {

    public static Factory instance = new Factory();
    public CallDao callDao;

    private Factory(){}

    public static Factory getInstance(){
        return Factory.instance;
    }

    public CallDao getCallDao(){
        if (callDao == null) callDao = new CallDaoImpl();
        return callDao;
    }
}
