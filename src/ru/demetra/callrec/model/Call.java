package ru.demetra.callrec.model;

import javax.persistence.*;

/**
 * JavaBean domain object that represents a Call
 *
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */

@Entity
@Table(name = "cdr")  //Table on s-voip01
public class Call {
    @Id
    @Column(name = "uniqueid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "calldate")
    private String callDate;
    @Column(name = "src")
    private String src;
    @Column(name = "dst")
    private String dst;
    @Column(name = "billsec")
    private int billsec;
    @Column(name = "recordingfile")
    private String recordingfile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCallDate() {
        return callDate;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public int getBillsec() {
        return billsec;
    }

    public void setBillsec(int billsec) {
        this.billsec = billsec;
    }

    public String getRecordingfile() {
        return recordingfile;
    }

    public void setRecordingfile(String recordingfile) {
        this.recordingfile = recordingfile;
    }


}
