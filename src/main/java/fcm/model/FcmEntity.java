package fcm.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FC_DATA_OBJECT")
public class FcmEntity extends AbstractPersistable<Long> {

    @Column(name = "IAK", columnDefinition = "VARCHAR2(1 CHAR)")
    private String iak;

    @Column(name = "SAA", columnDefinition = "VARCHAR2(2 CHAR)")
    private String saa;

    @Column(name = "ITQ", columnDefinition = "NUMBER(1,0)")
    private boolean itq;

    @Column(name = "AS2", columnDefinition = "VARCHAR2(2 CHAR)")
    private String as2;

    @Column(name = "TAG", columnDefinition = "VARCHAR2(1 CHAR)")
    private String tag;

    @Column(name = "ITT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date itt;

    @Column(name = "GAZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String gaz;

    @Column(name = "SAL", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sal;

    @Column(name = "POS", columnDefinition = "VARCHAR2(4 CHAR)")
    private String pos;

    @Column(name = "GUG", columnDefinition = "NUMBER(4,0)")
    private int gug;

    @Column(name = "VK1", columnDefinition = "VARCHAR2(1 CHAR)")
    private String vk1;

    @Column(name = "VK2", columnDefinition = "VARCHAR2(1 CHAR)")
    private String vk2;

    @Column(name = "ZOT", columnDefinition = "VARCHAR2(4 CHAR)")
    private String zot;

    @Column(name = "VIP", columnDefinition = "VARCHAR2(20 CHAR)")
    private String vip;

    @Column(name = "VK3", columnDefinition = "VARCHAR2(1 CHAR)")
    private String vk3;

    @Column(name = "VK4", columnDefinition = "VARCHAR2(1 CHAR)")
    private String vk4;

    @Column(name = "RWY", columnDefinition = "VARCHAR2(3 CHAR)")
    private String rwy;

    @Column(name = "ABW", columnDefinition = "VARCHAR2(1 CHAR)")
    private String abw;

    @Column(name = "DGP", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dgp;

    @Column(name = "ZOL", columnDefinition = "VARCHAR2(4 CHAR)")
    private String zol;

    @Column(name = "DPI", columnDefinition = "VARCHAR2(4 CHAR)")
    private String dpi;

    @Column(name = "LUV", columnDefinition = "VARCHAR2(32 CHAR)")
    private String luv;

    @Column(name = "UNT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String unt;

    @Column(name = "KAT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String kat;

    @Column(name = "S48")
    @Temporal(TemporalType.TIMESTAMP)
    private Date s48;

    @Column(name = "DPO", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dpo;

    @Column(name = "TBG", columnDefinition = "VARCHAR2(1 CHAR)")
    private String tbg;

    @Column(name = "BAF", columnDefinition = "VARCHAR2(16 CHAR)")
    private String baf;

    @Column(name = "TBE", columnDefinition = "VARCHAR2(1 CHAR)")
    private String tbe;

    @Column(name = "VK5", columnDefinition = "VARCHAR2(1 CHAR)")
    private String vk5;

    @Column(name = "ETO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eto;

    @Column(name = "NWI", columnDefinition = "NUMBER(3,2)")
    private int nwi;

    @Column(name = "GAT", columnDefinition = "VARCHAR2(3 CHAR)")
    private String gat;

    @Column(name = "SOF", columnDefinition = "NUMBER(4,0)")
    private int sof;

    @Column(name = "ETT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ett;

    @Column(name = "GID", columnDefinition = "VARCHAR2(1 CHAR)")
    private String gid;

    @Column(name = "TYP", columnDefinition = "VARCHAR2(4 CHAR)")
    private String typ;

    @Column(name = "GTD", columnDefinition = "VARCHAR2(2 CHAR)")
    private String gtd;

    @Column(name = "HFN", columnDefinition = "VARCHAR2(8 CHAR)")
    private String hfn;

    @Column(name = "ROE", columnDefinition = "VARCHAR2(4 CHAR)")
    private String roe;

    @Column(name = "INCOMPLETEPARSED")
    private boolean incompleteParsed;

    @Column(name = "HA2", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ha2;

    @Column(name = "HA4", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ha4;

    @Column(name = "HA3", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ha3;

    @Column(name = "DET", columnDefinition = "VARCHAR2(3 CHAR)")
    private String det;

    @Column(name = "HA5", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ha5;

    @Column(name = "MESSAGESOURCE", columnDefinition = "VARCHAR2(255 CHAR)")
    private String messageSource;

    @Column(name = "XFD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xfd;

    @Column(name = "S57")
    @Temporal(TemporalType.TIMESTAMP)
    private Date s57;

    @Column(name = "BSZ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bsz;

    @Column(name = "SIZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String siz;

    @Column(name = "VER", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ver;

    @Column(name = "ST1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date st1;

    @Column(name = "HA0", columnDefinition = "VARCHAR2(4 CHAR)")
    private String ha0;

    @Column(name = "KOR", columnDefinition = "VARCHAR2(8 CHAR)")
    private String kor;

    @Column(name = "FUW", columnDefinition = "VARCHAR2(1 CHAR)")
    private String fuw;

    @Column(name = "MAD", columnDefinition = "VARCHAR2(4 CHAR)")
    private String mad;

    @Column(name = "KOO", columnDefinition = "VARCHAR2(8 CHAR)")
    private String koo;

    @Column(name = "KON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kon;

    @Column(name = "GP2", columnDefinition = "VARCHAR2(2 CHAR)")
    private String gp2;

    @Column(name = "HP2", columnDefinition = "VARCHAR2(16 CHAR)")
    private String hp2;

    @Column(name = "SRE", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sre;

    @Column(name = "HP1", columnDefinition = "VARCHAR2(16 CHAR)")
    private String hp1;

    @Column(name = "FNR", columnDefinition = "VARCHAR2(8 CHAR)")
    private String fnr;

    @Column(name = "SID", columnDefinition = "VARCHAR2(7 CHAR)")
    private String sid;

    @Column(name = "RECEIVEDAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedAt;

    @Column(name = "ZFD", columnDefinition = "NUMBER(4,0)")
    private int zfd;

    @Column(name = "PEB", columnDefinition = "NUMBER(3,0)")
    private byte peb;

    @Column(name = "RMT", columnDefinition = "NUMBER(2,0)")
    private byte rmt;

    @Column(name = "PNR", columnDefinition = "VARCHAR2(5 CHAR)")
    private String pnr;

    @Column(name = "HNA", columnDefinition = "VARCHAR2(10 CHAR)")
    private String hna;

    @Column(name = "DNT", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dnt;

    @Column(name = "GUS", columnDefinition = "NUMBER(3,0)")
    private byte gus;

    @Column(name = "DGA", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dga;

    @Column(name = "ENT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String ent;

    @Column(name = "SIU", columnDefinition = "VARCHAR2(1 CHAR)")
    private String siu;

    @Column(name = "ZES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zes;

    @Column(name = "SIS", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sis;

    @Column(name = "GA2", columnDefinition = "VARCHAR2(3 CHAR)")
    private String ga2;

    @Column(name = "REG", columnDefinition = "VARCHAR2(6 CHAR)")
    private String reg;

    @Column(name = "AGH", columnDefinition = "VARCHAR2(3 CHAR)")
    private String agh;

    @Column(name = "REM", columnDefinition = "VARCHAR2(1 CHAR)")
    private String rem;

    @Column(name = "NFB", columnDefinition = "VARCHAR2(4 CHAR)")
    private String nfb;

    @Column(name = "NFC", columnDefinition = "VARCHAR2(2 CHAR)")
    private String nfc;

    @Column(name = "COA", columnDefinition = "VARCHAR2(1 CHAR)")
    private String coa;

    @Column(name = "AGS", columnDefinition = "NUMBER(3,0)")
    private byte ags;

    @Column(name = "UKZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String ukz;

    @Column(name = "COB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cob;

    @Column(name = "AGT", columnDefinition = "VARCHAR2(3 CHAR)")
    private String agt;

    @Column(name = "NFG", columnDefinition = "VARCHAR2(4 CHAR)")
    private String nfg;

    @Column(name = "AGP", columnDefinition = "VARCHAR2(3 CHAR)")
    private String agp;

    @Column(name = "DFN", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dfn;

    @Column(name = "BOA", columnDefinition = "VARCHAR2(1 CHAR)")
    private String boa;

    @Column(name = "PST")
    private int pst;

    @Column(name = "COM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date com;

    @Column(name = "FKS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fks;

    @Column(name = "DST", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dst;

    @Column(name = "SSK", columnDefinition = "VARCHAR2(1 CHAR)")
    private String ssk;

    @Column(name = "SDB", columnDefinition = "VARCHAR2(2 CHAR)")
    private String sdb;

    @Column(name = "SKZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String skz;

    @Column(name = "EOT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eot;

    @Column(name = "SDD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdd;

    @Column(name = "SDF", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sdf;

    @Column(name = "SSR", columnDefinition = "VARCHAR2(5 CHAR)")
    private String ssr;

    @Column(name = "SDG", columnDefinition = "VARCHAR2(2 CHAR)")
    private String sdg;

    @Column(name = "DTG", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dtg;

    @Column(name = "OTT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ott;

    @Column(name = "HTR", columnDefinition = "VARCHAR2(3 CHAR)")
    private String htr;

    @Column(name = "BVL", columnDefinition = "VARCHAR2(20 CHAR)")
    private String bvl;

    @Column(name = "DTE", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dte;

    @Column(name = "SLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sla;

    @Column(name = "B10", columnDefinition = "VARCHAR2(10 CHAR)")
    private String b10;

    @Column(name = "SLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sle;

    @Column(name = "FLA", columnDefinition = "VARCHAR2(2 CHAR)")
    private String fla;

    @Column(name = "PTT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ptt;

    @Column(name = "XBV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xbv;

    @Column(name = "LSK", columnDefinition = "VARCHAR2(1 CHAR)")
    private String lsk;

    @Column(name = "DTY", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dty;

    @Column(name = "STATUS", columnDefinition = "VARCHAR2(255 CHAR)")
    private String status;

    @Column(name = "NTE", columnDefinition = "VARCHAR2(4 CHAR)")
    private String nte;

    @Column(name = "DTT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtt;

    @Column(name = "CIA", columnDefinition = "VARCHAR2(1 CHAR)")
    private String cia;

    @Column(name = "GPB", columnDefinition = "VARCHAR2(2 CHAR)")
    private String gpb;

    @Column(name = "PKF", columnDefinition = "VARCHAR2(4 CHAR)")
    private String pkf;

    @Column(name = "BO2", columnDefinition = "VARCHAR2(10 CHAR)")
    private String bo2;

    @Column(name = "BO1", columnDefinition = "VARCHAR2(10 CHAR)")
    private String bo1;

    @Column(name = "DAS", columnDefinition = "VARCHAR2(3 CHAR)")
    private String das;

    @Column(name = "EPU", columnDefinition = "VARCHAR2(1 CHAR)")
    private String epu;

    @Column(name = "PKK", columnDefinition = "NUMBER(6,0)")
    private int pkk;

    @Column(name = "KNH", columnDefinition = "NUMBER(6,0)")
    private int knh;

    @Column(name = "STT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stt;

    @Column(name = "PBR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pbr;

    @Column(name = "PKZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String pkz;

    @Column(name = "PKT", columnDefinition = "VARCHAR2(2 CHAR)")
    private String pkt;

    @Column(name = "TER", columnDefinition = "VARCHAR2(1 CHAR)")
    private String ter;

    @Column(name = "KNR", columnDefinition = "NUMBER(6,0) NOT NULL ENABLE")
    private int knr;

    @Column(name = "FID", columnDefinition = "VARCHAR2(6 CHAR)")
    private String fid;

    @Column(name = "MESSAGEGROUPIDENTIFIER", columnDefinition = "VARCHAR2(255 CHAR)")
    private String messagegroupidentifier;

    @Column(name = "ADR", columnDefinition = "VARCHAR2(4 CHAR)")
    private String adr;

    @Column(name = "UAZ", columnDefinition = "NUMBER(2,0)")
    private byte uaz;

    @Column(name = "PBG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pbg;

    @Column(name = "FRA", columnDefinition = "NUMBER(6,0)")
    private int fra;

    @Column(name = "SUG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sug;

    @Column(name = "CAZ", columnDefinition = "NUMBER(2,0)")
    private byte caz;

    @Column(name = "FRG", columnDefinition = "VARCHAR2(2 CHAR)")
    private String frg;

    @Column(name = "AST", columnDefinition = "VARCHAR2(2 CHAR)")
    private String ast;

    @Column(name = "SUK", columnDefinition = "VARCHAR2(1 CHAR)")
    private String suk;

    @Column(name = "CAB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cab;

    @Column(name = "PAQ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String paq;

    @Column(name = "TXR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txr;

    @Column(name = "GT2", columnDefinition = "VARCHAR2(36 CHAR)")
    private String gt2;

    @Column(name = "GT1", columnDefinition = "VARCHAR2(36 CHAR)")
    private String gt1;

    @Column(name = "SUR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sur;

    @Column(name = "ATR", columnDefinition = "VARCHAR2(4 CHAR)")
    private String atr;

    @Column(name = "DRK", columnDefinition = "VARCHAR2(1 CHAR)")
    private String drk;

    @Column(name = "DIT", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dit;

    @Column(name = "KKN", columnDefinition = "NUMBER(6,0)")
    private int kkn;

    @Column(name = "PAZ", columnDefinition = "NUMBER(2,0)")
    private byte paz;

    @Column(name = "ADS", columnDefinition = "VARCHAR2(1 CHAR)")
    private String ads;

    @Column(name = "DRE", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dre;

    @Column(name = "TXG")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txg;

    @Column(name = "HCI", columnDefinition = "VARCHAR2(3 CHAR)")
    private String hci;

    @Column(name = "S20")
    @Temporal(TemporalType.TIMESTAMP)
    private Date s20;

    @Column(name = "DCA", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dca;

    @Column(name = "DRW", columnDefinition = "VARCHAR2(3 CHAR)")
    private String drw;

    @Column(name = "PAB", columnDefinition = "NUMBER(3,0)")
    private byte pab;

    @Column(name = "SDS", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sds;

    @Column(name = "SDT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String sdt;

    @Column(name = "PRT", columnDefinition = "NUMBER(2,0)")
    private byte prt;

    @Column(name = "ATT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date att;

    @Column(name = "NBG", columnDefinition = "VARCHAR2(1 CHAR)")
    private String nbg;

    @Column(name = "AKZ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String akz;

    @Column(name = "FCT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String fct;

    @Column(name = "DCL", columnDefinition = "VARCHAR2(4 CHAR)")
    private String dcl;

    @Column(name = "FRL", columnDefinition = "NUMBER(6,0)")
    private int frl;

    @Column(name = "PIL", columnDefinition = "VARCHAR2(10 CHAR)")
    private String pil;

    @Column(name = "FRQ", columnDefinition = "VARCHAR2(1 CHAR)")
    private String frq;

    @Column(name = "FRP", columnDefinition = "NUMBER(6,0)")
    private int frp;

    @Column(name = "ZAL", columnDefinition = "VARCHAR2(1 CHAR)")
    private String zal;

    @Column(name = "KLN", columnDefinition = "NUMBER(2,0)")
    private byte kln;

    @Column(name = "FRT", columnDefinition = "NUMBER(6,0)")
    private int frt;

    @Column(name = "FRW", columnDefinition = "VARCHAR2(1 CHAR)")
    private String frw;

    @Column(name = "CSN", columnDefinition = "VARCHAR2(7 CHAR)")
    private String csn;

    @Column(name = "DSA", columnDefinition = "VARCHAR2(3 CHAR)")
    private String dsa;

    @Column(name = "BOZ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date boz;

    @Column(name = "ZAT", columnDefinition = "VARCHAR2(1 CHAR)")
    private String zat;

    @Column(name = "SOURCEINFORMATION", columnDefinition = "CLOB")
    private String sourceInformation;

    @Column(name = "TEXT", columnDefinition = "VARCHAR2(255 CHAR)")
    private String text;

    public String getIak() {
        return iak;
    }

    public void setIak(String iak) {
        this.iak = iak;
    }

    public String getSaa() {
        return saa;
    }

    public void setSaa(String saa) {
        this.saa = saa;
    }

    public boolean isItq() {
        return itq;
    }

    public void setItq(boolean itq) {
        this.itq = itq;
    }

    public String getAs2() {
        return as2;
    }

    public void setAs2(String as2) {
        this.as2 = as2;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getItt() {
        return itt;
    }

    public void setItt(Date itt) {
        this.itt = itt;
    }

    public String getGaz() {
        return gaz;
    }

    public void setGaz(String gaz) {
        this.gaz = gaz;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getGug() {
        return gug;
    }

    public void setGug(int gug) {
        this.gug = gug;
    }

    public String getVk1() {
        return vk1;
    }

    public void setVk1(String vk1) {
        this.vk1 = vk1;
    }

    public String getVk2() {
        return vk2;
    }

    public void setVk2(String vk2) {
        this.vk2 = vk2;
    }

    public String getZot() {
        return zot;
    }

    public void setZot(String zot) {
        this.zot = zot;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getVk3() {
        return vk3;
    }

    public void setVk3(String vk3) {
        this.vk3 = vk3;
    }

    public String getVk4() {
        return vk4;
    }

    public void setVk4(String vk4) {
        this.vk4 = vk4;
    }

    public String getRwy() {
        return rwy;
    }

    public void setRwy(String rwy) {
        this.rwy = rwy;
    }

    public String getAbw() {
        return abw;
    }

    public void setAbw(String abw) {
        this.abw = abw;
    }

    public String getDgp() {
        return dgp;
    }

    public void setDgp(String dgp) {
        this.dgp = dgp;
    }

    public String getZol() {
        return zol;
    }

    public void setZol(String zol) {
        this.zol = zol;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getLuv() {
        return luv;
    }

    public void setLuv(String luv) {
        this.luv = luv;
    }

    public String getUnt() {
        return unt;
    }

    public void setUnt(String unt) {
        this.unt = unt;
    }

    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }

    public Date getS48() {
        return s48;
    }

    public void setS48(Date s48) {
        this.s48 = s48;
    }

    public String getDpo() {
        return dpo;
    }

    public void setDpo(String dpo) {
        this.dpo = dpo;
    }

    public String getTbg() {
        return tbg;
    }

    public void setTbg(String tbg) {
        this.tbg = tbg;
    }

    public String getBaf() {
        return baf;
    }

    public void setBaf(String baf) {
        this.baf = baf;
    }

    public String getTbe() {
        return tbe;
    }

    public void setTbe(String tbe) {
        this.tbe = tbe;
    }

    public String getVk5() {
        return vk5;
    }

    public void setVk5(String vk5) {
        this.vk5 = vk5;
    }

    public Date getEto() {
        return eto;
    }

    public void setEto(Date eto) {
        this.eto = eto;
    }

    public int getNwi() {
        return nwi;
    }

    public void setNwi(int nwi) {
        this.nwi = nwi;
    }

    public String getGat() {
        return gat;
    }

    public void setGat(String gat) {
        this.gat = gat;
    }

    public int getSof() {
        return sof;
    }

    public void setSof(int sof) {
        this.sof = sof;
    }

    public Date getEtt() {
        return ett;
    }

    public void setEtt(Date ett) {
        this.ett = ett;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getGtd() {
        return gtd;
    }

    public void setGtd(String gtd) {
        this.gtd = gtd;
    }

    public String getHfn() {
        return hfn;
    }

    public void setHfn(String hfn) {
        this.hfn = hfn;
    }

    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }

    public boolean isIncompleteParsed() {
        return incompleteParsed;
    }

    public void setIncompleteParsed(boolean incompleteParsed) {
        this.incompleteParsed = incompleteParsed;
    }

    public String getHa2() {
        return ha2;
    }

    public void setHa2(String ha2) {
        this.ha2 = ha2;
    }

    public String getHa4() {
        return ha4;
    }

    public void setHa4(String ha4) {
        this.ha4 = ha4;
    }

    public String getHa3() {
        return ha3;
    }

    public void setHa3(String ha3) {
        this.ha3 = ha3;
    }

    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }

    public String getHa5() {
        return ha5;
    }

    public void setHa5(String ha5) {
        this.ha5 = ha5;
    }

    public String getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(String messageSource) {
        this.messageSource = messageSource;
    }

    public Date getXfd() {
        return xfd;
    }

    public void setXfd(Date xfd) {
        this.xfd = xfd;
    }

    public Date getS57() {
        return s57;
    }

    public void setS57(Date s57) {
        this.s57 = s57;
    }

    public Date getBsz() {
        return bsz;
    }

    public void setBsz(Date bsz) {
        this.bsz = bsz;
    }

    public String getSiz() {
        return siz;
    }

    public void setSiz(String siz) {
        this.siz = siz;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Date getSt1() {
        return st1;
    }

    public void setSt1(Date st1) {
        this.st1 = st1;
    }

    public String getHa0() {
        return ha0;
    }

    public void setHa0(String ha0) {
        this.ha0 = ha0;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public String getFuw() {
        return fuw;
    }

    public void setFuw(String fuw) {
        this.fuw = fuw;
    }

    public String getMad() {
        return mad;
    }

    public void setMad(String mad) {
        this.mad = mad;
    }

    public String getKoo() {
        return koo;
    }

    public void setKoo(String koo) {
        this.koo = koo;
    }

    public Date getKon() {
        return kon;
    }

    public void setKon(Date kon) {
        this.kon = kon;
    }

    public String getGp2() {
        return gp2;
    }

    public void setGp2(String gp2) {
        this.gp2 = gp2;
    }

    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }

    public String getSre() {
        return sre;
    }

    public void setSre(String sre) {
        this.sre = sre;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getFnr() {
        return fnr;
    }

    public void setFnr(String fnr) {
        this.fnr = fnr;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
    }

    public int getZfd() {
        return zfd;
    }

    public void setZfd(int zfd) {
        this.zfd = zfd;
    }

    public byte getPeb() {
        return peb;
    }

    public void setPeb(byte peb) {
        this.peb = peb;
    }

    public byte getRmt() {
        return rmt;
    }

    public void setRmt(byte rmt) {
        this.rmt = rmt;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getHna() {
        return hna;
    }

    public void setHna(String hna) {
        this.hna = hna;
    }

    public String getDnt() {
        return dnt;
    }

    public void setDnt(String dnt) {
        this.dnt = dnt;
    }

    public byte getGus() {
        return gus;
    }

    public void setGus(byte gus) {
        this.gus = gus;
    }

    public String getDga() {
        return dga;
    }

    public void setDga(String dga) {
        this.dga = dga;
    }

    public String getEnt() {
        return ent;
    }

    public void setEnt(String ent) {
        this.ent = ent;
    }

    public String getSiu() {
        return siu;
    }

    public void setSiu(String siu) {
        this.siu = siu;
    }

    public Date getZes() {
        return zes;
    }

    public void setZes(Date zes) {
        this.zes = zes;
    }

    public String getSis() {
        return sis;
    }

    public void setSis(String sis) {
        this.sis = sis;
    }

    public String getGa2() {
        return ga2;
    }

    public void setGa2(String ga2) {
        this.ga2 = ga2;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getAgh() {
        return agh;
    }

    public void setAgh(String agh) {
        this.agh = agh;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }

    public String getNfb() {
        return nfb;
    }

    public void setNfb(String nfb) {
        this.nfb = nfb;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getCoa() {
        return coa;
    }

    public void setCoa(String coa) {
        this.coa = coa;
    }

    public byte getAgs() {
        return ags;
    }

    public void setAgs(byte ags) {
        this.ags = ags;
    }

    public String getUkz() {
        return ukz;
    }

    public void setUkz(String ukz) {
        this.ukz = ukz;
    }

    public Date getCob() {
        return cob;
    }

    public void setCob(Date cob) {
        this.cob = cob;
    }

    public String getAgt() {
        return agt;
    }

    public void setAgt(String agt) {
        this.agt = agt;
    }

    public String getNfg() {
        return nfg;
    }

    public void setNfg(String nfg) {
        this.nfg = nfg;
    }

    public String getAgp() {
        return agp;
    }

    public void setAgp(String agp) {
        this.agp = agp;
    }

    public String getDfn() {
        return dfn;
    }

    public void setDfn(String dfn) {
        this.dfn = dfn;
    }

    public String getBoa() {
        return boa;
    }

    public void setBoa(String boa) {
        this.boa = boa;
    }

    public int getPst() {
        return pst;
    }

    public void setPst(int pst) {
        this.pst = pst;
    }

    public Date getCom() {
        return com;
    }

    public void setCom(Date com) {
        this.com = com;
    }

    public Date getFks() {
        return fks;
    }

    public void setFks(Date fks) {
        this.fks = fks;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getSsk() {
        return ssk;
    }

    public void setSsk(String ssk) {
        this.ssk = ssk;
    }

    public String getSdb() {
        return sdb;
    }

    public void setSdb(String sdb) {
        this.sdb = sdb;
    }

    public String getSkz() {
        return skz;
    }

    public void setSkz(String skz) {
        this.skz = skz;
    }

    public Date getEot() {
        return eot;
    }

    public void setEot(Date eot) {
        this.eot = eot;
    }

    public Date getSdd() {
        return sdd;
    }

    public void setSdd(Date sdd) {
        this.sdd = sdd;
    }

    public String getSdf() {
        return sdf;
    }

    public void setSdf(String sdf) {
        this.sdf = sdf;
    }

    public String getSsr() {
        return ssr;
    }

    public void setSsr(String ssr) {
        this.ssr = ssr;
    }

    public String getSdg() {
        return sdg;
    }

    public void setSdg(String sdg) {
        this.sdg = sdg;
    }

    public String getDtg() {
        return dtg;
    }

    public void setDtg(String dtg) {
        this.dtg = dtg;
    }

    public Date getOtt() {
        return ott;
    }

    public void setOtt(Date ott) {
        this.ott = ott;
    }

    public String getHtr() {
        return htr;
    }

    public void setHtr(String htr) {
        this.htr = htr;
    }

    public String getBvl() {
        return bvl;
    }

    public void setBvl(String bvl) {
        this.bvl = bvl;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }

    public Date getSla() {
        return sla;
    }

    public void setSla(Date sla) {
        this.sla = sla;
    }

    public String getB10() {
        return b10;
    }

    public void setB10(String b10) {
        this.b10 = b10;
    }

    public Date getSle() {
        return sle;
    }

    public void setSle(Date sle) {
        this.sle = sle;
    }

    public String getFla() {
        return fla;
    }

    public void setFla(String fla) {
        this.fla = fla;
    }

    public Date getPtt() {
        return ptt;
    }

    public void setPtt(Date ptt) {
        this.ptt = ptt;
    }

    public Date getXbv() {
        return xbv;
    }

    public void setXbv(Date xbv) {
        this.xbv = xbv;
    }

    public String getLsk() {
        return lsk;
    }

    public void setLsk(String lsk) {
        this.lsk = lsk;
    }

    public String getDty() {
        return dty;
    }

    public void setDty(String dty) {
        this.dty = dty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNte() {
        return nte;
    }

    public void setNte(String nte) {
        this.nte = nte;
    }

    public Date getDtt() {
        return dtt;
    }

    public void setDtt(Date dtt) {
        this.dtt = dtt;
    }

    public String getCia() {
        return cia;
    }

    public void setCia(String cia) {
        this.cia = cia;
    }

    public String getGpb() {
        return gpb;
    }

    public void setGpb(String gpb) {
        this.gpb = gpb;
    }

    public String getPkf() {
        return pkf;
    }

    public void setPkf(String pkf) {
        this.pkf = pkf;
    }

    public String getBo2() {
        return bo2;
    }

    public void setBo2(String bo2) {
        this.bo2 = bo2;
    }

    public String getBo1() {
        return bo1;
    }

    public void setBo1(String bo1) {
        this.bo1 = bo1;
    }

    public String getDas() {
        return das;
    }

    public void setDas(String das) {
        this.das = das;
    }

    public String getEpu() {
        return epu;
    }

    public void setEpu(String epu) {
        this.epu = epu;
    }

    public int getPkk() {
        return pkk;
    }

    public void setPkk(int pkk) {
        this.pkk = pkk;
    }

    public int getKnh() {
        return knh;
    }

    public void setKnh(int knh) {
        this.knh = knh;
    }

    public Date getStt() {
        return stt;
    }

    public void setStt(Date stt) {
        this.stt = stt;
    }

    public Date getPbr() {
        return pbr;
    }

    public void setPbr(Date pbr) {
        this.pbr = pbr;
    }

    public String getPkz() {
        return pkz;
    }

    public void setPkz(String pkz) {
        this.pkz = pkz;
    }

    public String getPkt() {
        return pkt;
    }

    public void setPkt(String pkt) {
        this.pkt = pkt;
    }

    public String getTer() {
        return ter;
    }

    public void setTer(String ter) {
        this.ter = ter;
    }

    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getMessagegroupidentifier() {
        return messagegroupidentifier;
    }

    public void setMessagegroupidentifier(String messagegroupidentifier) {
        this.messagegroupidentifier = messagegroupidentifier;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public byte getUaz() {
        return uaz;
    }

    public void setUaz(byte uaz) {
        this.uaz = uaz;
    }

    public Date getPbg() {
        return pbg;
    }

    public void setPbg(Date pbg) {
        this.pbg = pbg;
    }

    public int getFra() {
        return fra;
    }

    public void setFra(int fra) {
        this.fra = fra;
    }

    public Date getSug() {
        return sug;
    }

    public void setSug(Date sug) {
        this.sug = sug;
    }

    public byte getCaz() {
        return caz;
    }

    public void setCaz(byte caz) {
        this.caz = caz;
    }

    public String getFrg() {
        return frg;
    }

    public void setFrg(String frg) {
        this.frg = frg;
    }

    public String getAst() {
        return ast;
    }

    public void setAst(String ast) {
        this.ast = ast;
    }

    public String getSuk() {
        return suk;
    }

    public void setSuk(String suk) {
        this.suk = suk;
    }

    public Date getCab() {
        return cab;
    }

    public void setCab(Date cab) {
        this.cab = cab;
    }

    public String getPaq() {
        return paq;
    }

    public void setPaq(String paq) {
        this.paq = paq;
    }

    public Date getTxr() {
        return txr;
    }

    public void setTxr(Date txr) {
        this.txr = txr;
    }

    public String getGt2() {
        return gt2;
    }

    public void setGt2(String gt2) {
        this.gt2 = gt2;
    }

    public String getGt1() {
        return gt1;
    }

    public void setGt1(String gt1) {
        this.gt1 = gt1;
    }

    public Date getSur() {
        return sur;
    }

    public void setSur(Date sur) {
        this.sur = sur;
    }

    public String getAtr() {
        return atr;
    }

    public void setAtr(String atr) {
        this.atr = atr;
    }

    public String getDrk() {
        return drk;
    }

    public void setDrk(String drk) {
        this.drk = drk;
    }

    public String getDit() {
        return dit;
    }

    public void setDit(String dit) {
        this.dit = dit;
    }

    public int getKkn() {
        return kkn;
    }

    public void setKkn(int kkn) {
        this.kkn = kkn;
    }

    public byte getPaz() {
        return paz;
    }

    public void setPaz(byte paz) {
        this.paz = paz;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getDre() {
        return dre;
    }

    public void setDre(String dre) {
        this.dre = dre;
    }

    public Date getTxg() {
        return txg;
    }

    public void setTxg(Date txg) {
        this.txg = txg;
    }

    public String getHci() {
        return hci;
    }

    public void setHci(String hci) {
        this.hci = hci;
    }

    public Date getS20() {
        return s20;
    }

    public void setS20(Date s20) {
        this.s20 = s20;
    }

    public String getDca() {
        return dca;
    }

    public void setDca(String dca) {
        this.dca = dca;
    }

    public String getDrw() {
        return drw;
    }

    public void setDrw(String drw) {
        this.drw = drw;
    }

    public byte getPab() {
        return pab;
    }

    public void setPab(byte pab) {
        this.pab = pab;
    }

    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public byte getPrt() {
        return prt;
    }

    public void setPrt(byte prt) {
        this.prt = prt;
    }

    public Date getAtt() {
        return att;
    }

    public void setAtt(Date att) {
        this.att = att;
    }

    public String getNbg() {
        return nbg;
    }

    public void setNbg(String nbg) {
        this.nbg = nbg;
    }

    public String getAkz() {
        return akz;
    }

    public void setAkz(String akz) {
        this.akz = akz;
    }

    public String getFct() {
        return fct;
    }

    public void setFct(String fct) {
        this.fct = fct;
    }

    public String getDcl() {
        return dcl;
    }

    public void setDcl(String dcl) {
        this.dcl = dcl;
    }

    public int getFrl() {
        return frl;
    }

    public void setFrl(int frl) {
        this.frl = frl;
    }

    public String getPil() {
        return pil;
    }

    public void setPil(String pil) {
        this.pil = pil;
    }

    public String getFrq() {
        return frq;
    }

    public void setFrq(String frq) {
        this.frq = frq;
    }

    public int getFrp() {
        return frp;
    }

    public void setFrp(int frp) {
        this.frp = frp;
    }

    public String getZal() {
        return zal;
    }

    public void setZal(String zal) {
        this.zal = zal;
    }

    public byte getKln() {
        return kln;
    }

    public void setKln(byte kln) {
        this.kln = kln;
    }

    public int getFrt() {
        return frt;
    }

    public void setFrt(int frt) {
        this.frt = frt;
    }

    public String getFrw() {
        return frw;
    }

    public void setFrw(String frw) {
        this.frw = frw;
    }

    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn;
    }

    public String getDsa() {
        return dsa;
    }

    public void setDsa(String dsa) {
        this.dsa = dsa;
    }

    public Date getBoz() {
        return boz;
    }

    public void setBoz(Date boz) {
        this.boz = boz;
    }

    public String getZat() {
        return zat;
    }

    public void setZat(String zat) {
        this.zat = zat;
    }

    public String getSourceInformation() {
        return sourceInformation;
    }

    public void setSourceInformation(String sourceInformation) {
        this.sourceInformation = sourceInformation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
