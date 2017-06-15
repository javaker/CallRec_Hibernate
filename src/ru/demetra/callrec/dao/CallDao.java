package ru.demetra.callrec.dao;

import ru.demetra.callrec.model.Call;

import java.util.List;

/**
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */
public interface CallDao {
     List<Call> listCalls();  //Reserved
     List<Call> listCallsDemetra();
     List<Call> listCallsTrapeza();
}
