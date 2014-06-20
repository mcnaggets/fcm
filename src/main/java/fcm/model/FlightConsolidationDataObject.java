package fcm.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

//@Entity
@Table(name = "FLIGHTCONSOLIDATIONDATAOBJECT")
class FlightConsolidationDataObject extends AbstractPersistable<Long> {

    private String iak;
    private String saa;
    private BigInteger itq;
    private String as2;
    private String tag;
    private Date itt;
    private String gaz;
    private String sal;
    private String pos;
    private Integer gug;
    private String vk1;
    private String vk2;
    private String zot;
    private String vip;
    private String vk3;
    private String vk4;
    private String rwy;
    private String abw;
    private String dgp;
    private String zol;
    private String dpi;
    private String luv;
    private String unt;
    private String kat;
    private Date s48;
    private String dpo;
    private String tbg;
    private String baf;
    private String tbe;
    private String vk5;
    private Date eto;
    private BigDecimal nwi;
    private String gat;
    private Integer sof;
    private Date ett;
    private String gid;
    private String typ;
    private String gtd;
    private String hfn;
    private String roe;
    private BigInteger incompleteparsed;
    private String ha2;
    private String ha4;
    private String ha3;
    private String det;
    private String ha5;
    private String messagesource;
    private Date xfd;
    private Date s57;
    private Date bsz;
    private String siz;
    private String ver;
    private Date st1;
    private String ha0;
    private String kor;
    private String fuw;
    private String mad;
    private String koo;
    private Date kon;
    private String gp2;
    private String hp2;
    private String sre;
    private String hp1;
    private String fnr;
    private String sid;
    private Date receivedat;
    private Integer zfd;
    private Integer peb;
    private BigInteger rmt;
    private String pnr;
    private String hna;
    private String dnt;
    private Integer gus;
    private String dga;
    private String ent;
    private String siu;
    private Date zes;
    private String sis;
    private String ga2;
    private String reg;
    private String agh;
    private String rem;
    private String nfb;
    private String nfc;
    private String coa;
    private Integer ags;
    private String ukz;
    private Date cob;
    private String agt;
    private String nfg;
    private String agp;
    private String dfn;
    private String boa;
    private Integer pst;
    private Date com;
    private Date fks;
    private String dst;
    private String ssk;
    private String sdb;
    private String skz;
    private Date eot;
    private Date sdd;
    private String sdf;
    private String ssr;
    private String sdg;
    private String dtg;
    private Date ott;
    private String htr;
    private String bvl;
    private String dte;
    private Date sla;
    private String b10;
    private Date sle;
    private String fla;
    private Date ptt;
    private Date xbv;
    private String lsk;
    private String dty;
    private String status;
    private String nte;
    private Date dtt;
    private String cia;
    private String gpb;
    private String pkf;
    private String bo2;
    private String bo1;
    private String das;
    private String epu;
    private Integer pkk;
    private Integer knh;
    private Date stt;
    private Date pbr;
    private String pkz;
    private String pkt;
    private String ter;
    private int knr;
    private String fid;
    private String messagegroupidentifier;
    private String adr;
    private BigInteger uaz;
    private Date pbg;
    private Integer fra;
    private Date sug;
    private BigInteger caz;
    private String frg;
    private String ast;
    private String suk;
    private Date cab;
    private String paq;
    private Date txr;
    private String gt2;
    private String gt1;
    private Date sur;
    private String atr;
    private String drk;
    private String dit;
    private Integer kkn;
    private BigInteger paz;
    private String ads;
    private String dre;
    private Date txg;
    private String hci;
    private Date s20;
    private String dca;
    private String drw;
    private Integer pab;
    private String sds;
    private String sdt;
    private BigInteger prt;
    private Date att;
    private String nbg;
    private String akz;
    private String fct;
    private String dcl;
    private Integer frl;
    private String pil;
    private String frq;
    private Integer frp;
    private String zal;
    private BigInteger kln;
    private Integer frt;
    private String frw;
    private String csn;
    private String dsa;
    private Date boz;
    private String zat;
    private String sourceinformation;
    private String text;


    @Column(name = "ABW")
    public String getAbw() {
        return abw;
    }

    public void setAbw(String abw) {
        this.abw = abw;
    }


    @Column(name = "ADR")
    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }


    @Column(name = "ADS")
    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }


    @Column(name = "AGH")
    public String getAgh() {
        return agh;
    }

    public void setAgh(String agh) {
        this.agh = agh;
    }


    @Column(name = "AGP")
    public String getAgp() {
        return agp;
    }

    public void setAgp(String agp) {
        this.agp = agp;
    }


    @Column(name = "AGS")
    public Integer getAgs() {
        return ags;
    }

    public void setAgs(Integer ags) {
        this.ags = ags;
    }


    @Column(name = "AGT")
    public String getAgt() {
        return agt;
    }

    public void setAgt(String agt) {
        this.agt = agt;
    }


    @Column(name = "AKZ")
    public String getAkz() {
        return akz;
    }

    public void setAkz(String akz) {
        this.akz = akz;
    }


    @Column(name = "AS2")
    public String getAs2() {
        return as2;
    }

    public void setAs2(String as2) {
        this.as2 = as2;
    }


    @Column(name = "AST")
    public String getAst() {
        return ast;
    }

    public void setAst(String ast) {
        this.ast = ast;
    }


    @Column(name = "ATR")
    public String getAtr() {
        return atr;
    }

    public void setAtr(String atr) {
        this.atr = atr;
    }


    @Column(name = "ATT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAtt() {
        return att;
    }

    public void setAtt(Date att) {
        this.att = att;
    }


    @Column(name = "B10")
    public String getB10() {
        return b10;
    }

    public void setB10(String b10) {
        this.b10 = b10;
    }


    @Column(name = "BAF")
    public String getBaf() {
        return baf;
    }

    public void setBaf(String baf) {
        this.baf = baf;
    }


    @Column(name = "BO1")
    public String getBo1() {
        return bo1;
    }

    public void setBo1(String bo1) {
        this.bo1 = bo1;
    }


    @Column(name = "BO2")
    public String getBo2() {
        return bo2;
    }

    public void setBo2(String bo2) {
        this.bo2 = bo2;
    }


    @Column(name = "BOA")
    public String getBoa() {
        return boa;
    }

    public void setBoa(String boa) {
        this.boa = boa;
    }


    @Column(name = "BOZ")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBoz() {
        return boz;
    }

    public void setBoz(Date boz) {
        this.boz = boz;
    }


    @Column(name = "BSZ")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBsz() {
        return bsz;
    }

    public void setBsz(Date bsz) {
        this.bsz = bsz;
    }


    @Column(name = "BVL")
    public String getBvl() {
        return bvl;
    }

    public void setBvl(String bvl) {
        this.bvl = bvl;
    }


    @Column(name = "CAB")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCab() {
        return cab;
    }

    public void setCab(Date cab) {
        this.cab = cab;
    }


    @Column(name = "CAZ")
    public BigInteger getCaz() {
        return caz;
    }

    public void setCaz(BigInteger caz) {
        this.caz = caz;
    }


    @Column(name = "CIA")
    public String getCia() {
        return cia;
    }

    public void setCia(String cia) {
        this.cia = cia;
    }


    @Column(name = "COA")
    public String getCoa() {
        return coa;
    }

    public void setCoa(String coa) {
        this.coa = coa;
    }


    @Column(name = "COB")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCob() {
        return cob;
    }

    public void setCob(Date cob) {
        this.cob = cob;
    }


    @Column(name = "COM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCom() {
        return com;
    }

    public void setCom(Date com) {
        this.com = com;
    }


    @Column(name = "CSN")
    public String getCsn() {
        return csn;
    }

    public void setCsn(String csn) {
        this.csn = csn;
    }


    @Column(name = "DAS")
    public String getDas() {
        return das;
    }

    public void setDas(String das) {
        this.das = das;
    }


    @Column(name = "DCA")
    public String getDca() {
        return dca;
    }

    public void setDca(String dca) {
        this.dca = dca;
    }


    @Column(name = "DCL")
    public String getDcl() {
        return dcl;
    }

    public void setDcl(String dcl) {
        this.dcl = dcl;
    }


    @Column(name = "DET")
    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }


    @Column(name = "DFN")
    public String getDfn() {
        return dfn;
    }

    public void setDfn(String dfn) {
        this.dfn = dfn;
    }


    @Column(name = "DGA")
    public String getDga() {
        return dga;
    }

    public void setDga(String dga) {
        this.dga = dga;
    }


    @Column(name = "DGP")
    public String getDgp() {
        return dgp;
    }

    public void setDgp(String dgp) {
        this.dgp = dgp;
    }


    @Column(name = "DIT")
    public String getDit() {
        return dit;
    }

    public void setDit(String dit) {
        this.dit = dit;
    }


    @Column(name = "DNT")
    public String getDnt() {
        return dnt;
    }

    public void setDnt(String dnt) {
        this.dnt = dnt;
    }


    @Column(name = "DPI")
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }


    @Column(name = "DPO")
    public String getDpo() {
        return dpo;
    }

    public void setDpo(String dpo) {
        this.dpo = dpo;
    }


    @Column(name = "DRE")
    public String getDre() {
        return dre;
    }

    public void setDre(String dre) {
        this.dre = dre;
    }


    @Column(name = "DRK")
    public String getDrk() {
        return drk;
    }

    public void setDrk(String drk) {
        this.drk = drk;
    }


    @Column(name = "DRW")
    public String getDrw() {
        return drw;
    }

    public void setDrw(String drw) {
        this.drw = drw;
    }


    @Column(name = "DSA")
    public String getDsa() {
        return dsa;
    }

    public void setDsa(String dsa) {
        this.dsa = dsa;
    }


    @Column(name = "DST")
    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }


    @Column(name = "DTE")
    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }


    @Column(name = "DTG")
    public String getDtg() {
        return dtg;
    }

    public void setDtg(String dtg) {
        this.dtg = dtg;
    }


    @Column(name = "DTT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDtt() {
        return dtt;
    }

    public void setDtt(Date dtt) {
        this.dtt = dtt;
    }


    @Column(name = "DTY")
    public String getDty() {
        return dty;
    }

    public void setDty(String dty) {
        this.dty = dty;
    }


    @Column(name = "ENT")
    public String getEnt() {
        return ent;
    }

    public void setEnt(String ent) {
        this.ent = ent;
    }


    @Column(name = "EOT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEot() {
        return eot;
    }

    public void setEot(Date eot) {
        this.eot = eot;
    }


    @Column(name = "EPU")
    public String getEpu() {
        return epu;
    }

    public void setEpu(String epu) {
        this.epu = epu;
    }


    @Column(name = "ETO")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEto() {
        return eto;
    }

    public void setEto(Date eto) {
        this.eto = eto;
    }


    @Column(name = "ETT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEtt() {
        return ett;
    }

    public void setEtt(Date ett) {
        this.ett = ett;
    }


    @Column(name = "FCT")
    public String getFct() {
        return fct;
    }

    public void setFct(String fct) {
        this.fct = fct;
    }


    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }


    @Column(name = "FKS")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFks() {
        return fks;
    }

    public void setFks(Date fks) {
        this.fks = fks;
    }


    @Column(name = "FLA")
    public String getFla() {
        return fla;
    }

    public void setFla(String fla) {
        this.fla = fla;
    }


    @Column(name = "FNR")
    public String getFnr() {
        return fnr;
    }

    public void setFnr(String fnr) {
        this.fnr = fnr;
    }


    @Column(name = "FRA")
    public Integer getFra() {
        return fra;
    }

    public void setFra(Integer fra) {
        this.fra = fra;
    }


    @Column(name = "FRG")
    public String getFrg() {
        return frg;
    }

    public void setFrg(String frg) {
        this.frg = frg;
    }


    @Column(name = "FRL")
    public Integer getFrl() {
        return frl;
    }

    public void setFrl(Integer frl) {
        this.frl = frl;
    }


    @Column(name = "FRP")
    public Integer getFrp() {
        return frp;
    }

    public void setFrp(Integer frp) {
        this.frp = frp;
    }


    @Column(name = "FRQ")
    public String getFrq() {
        return frq;
    }

    public void setFrq(String frq) {
        this.frq = frq;
    }


    @Column(name = "FRT")
    public Integer getFrt() {
        return frt;
    }

    public void setFrt(Integer frt) {
        this.frt = frt;
    }


    @Column(name = "FRW")
    public String getFrw() {
        return frw;
    }

    public void setFrw(String frw) {
        this.frw = frw;
    }


    @Column(name = "FUW")
    public String getFuw() {
        return fuw;
    }

    public void setFuw(String fuw) {
        this.fuw = fuw;
    }


    @Column(name = "GA2")
    public String getGa2() {
        return ga2;
    }

    public void setGa2(String ga2) {
        this.ga2 = ga2;
    }


    @Column(name = "GAT")
    public String getGat() {
        return gat;
    }

    public void setGat(String gat) {
        this.gat = gat;
    }


    @Column(name = "GAZ")
    public String getGaz() {
        return gaz;
    }

    public void setGaz(String gaz) {
        this.gaz = gaz;
    }


    @Column(name = "GID")
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }


    @Column(name = "GP2")
    public String getGp2() {
        return gp2;
    }

    public void setGp2(String gp2) {
        this.gp2 = gp2;
    }


    @Column(name = "GPB")
    public String getGpb() {
        return gpb;
    }

    public void setGpb(String gpb) {
        this.gpb = gpb;
    }


    @Column(name = "GT1")
    public String getGt1() {
        return gt1;
    }

    public void setGt1(String gt1) {
        this.gt1 = gt1;
    }


    @Column(name = "GT2")
    public String getGt2() {
        return gt2;
    }

    public void setGt2(String gt2) {
        this.gt2 = gt2;
    }


    @Column(name = "GTD")
    public String getGtd() {
        return gtd;
    }

    public void setGtd(String gtd) {
        this.gtd = gtd;
    }


    @Column(name = "GUG")
    public Integer getGug() {
        return gug;
    }

    public void setGug(Integer gug) {
        this.gug = gug;
    }


    @Column(name = "GUS")
    public Integer getGus() {
        return gus;
    }

    public void setGus(Integer gus) {
        this.gus = gus;
    }


    @Column(name = "HA0")
    public String getHa0() {
        return ha0;
    }

    public void setHa0(String ha0) {
        this.ha0 = ha0;
    }


    @Column(name = "HA2")
    public String getHa2() {
        return ha2;
    }

    public void setHa2(String ha2) {
        this.ha2 = ha2;
    }


    @Column(name = "HA3")
    public String getHa3() {
        return ha3;
    }

    public void setHa3(String ha3) {
        this.ha3 = ha3;
    }


    @Column(name = "HA4")
    public String getHa4() {
        return ha4;
    }

    public void setHa4(String ha4) {
        this.ha4 = ha4;
    }


    @Column(name = "HA5")
    public String getHa5() {
        return ha5;
    }

    public void setHa5(String ha5) {
        this.ha5 = ha5;
    }


    @Column(name = "HCI")
    public String getHci() {
        return hci;
    }

    public void setHci(String hci) {
        this.hci = hci;
    }


    @Column(name = "HFN")
    public String getHfn() {
        return hfn;
    }

    public void setHfn(String hfn) {
        this.hfn = hfn;
    }


    @Column(name = "HNA")
    public String getHna() {
        return hna;
    }

    public void setHna(String hna) {
        this.hna = hna;
    }


    @Column(name = "HP1")
    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }


    @Column(name = "HP2")
    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }


    @Column(name = "HTR")
    public String getHtr() {
        return htr;
    }

    public void setHtr(String htr) {
        this.htr = htr;
    }


    @Column(name = "IAK")
    public String getIak() {
        return iak;
    }

    public void setIak(String iak) {
        this.iak = iak;
    }


    @Column(name = "INCOMPLETEPARSED")
    public BigInteger getIncompleteparsed() {
        return incompleteparsed;
    }

    public void setIncompleteparsed(BigInteger incompleteparsed) {
        this.incompleteparsed = incompleteparsed;
    }


    @Column(name = "ITQ")
    public BigInteger getItq() {
        return itq;
    }

    public void setItq(BigInteger itq) {
        this.itq = itq;
    }


    @Column(name = "ITT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getItt() {
        return itt;
    }

    public void setItt(Date itt) {
        this.itt = itt;
    }


    @Column(name = "KAT")
    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }


    @Column(name = "KKN")
    public Integer getKkn() {
        return kkn;
    }

    public void setKkn(Integer kkn) {
        this.kkn = kkn;
    }


    @Column(name = "KLN")
    public BigInteger getKln() {
        return kln;
    }

    public void setKln(BigInteger kln) {
        this.kln = kln;
    }


    @Column(name = "KNH")
    public Integer getKnh() {
        return knh;
    }

    public void setKnh(Integer knh) {
        this.knh = knh;
    }


    @Column(name = "KNR")
    public int getKnr() {
        return knr;
    }

    public void setKnr(int knr) {
        this.knr = knr;
    }


    @Column(name = "KON")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getKon() {
        return kon;
    }

    public void setKon(Date kon) {
        this.kon = kon;
    }


    @Column(name = "KOO")
    public String getKoo() {
        return koo;
    }

    public void setKoo(String koo) {
        this.koo = koo;
    }


    @Column(name = "KOR")
    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }


    @Column(name = "LSK")
    public String getLsk() {
        return lsk;
    }

    public void setLsk(String lsk) {
        this.lsk = lsk;
    }


    @Column(name = "LUV")
    public String getLuv() {
        return luv;
    }

    public void setLuv(String luv) {
        this.luv = luv;
    }


    @Column(name = "MAD")
    public String getMad() {
        return mad;
    }

    public void setMad(String mad) {
        this.mad = mad;
    }


    @Column(name = "MESSAGEGROUPIDENTIFIER")
    public String getMessagegroupidentifier() {
        return messagegroupidentifier;
    }

    public void setMessagegroupidentifier(String messagegroupidentifier) {
        this.messagegroupidentifier = messagegroupidentifier;
    }


    @Column(name = "MESSAGESOURCE")
    public String getMessagesource() {
        return messagesource;
    }

    public void setMessagesource(String messagesource) {
        this.messagesource = messagesource;
    }


    @Column(name = "NBG")
    public String getNbg() {
        return nbg;
    }

    public void setNbg(String nbg) {
        this.nbg = nbg;
    }


    @Column(name = "NFB")
    public String getNfb() {
        return nfb;
    }

    public void setNfb(String nfb) {
        this.nfb = nfb;
    }


    @Column(name = "NFC")
    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }


    @Column(name = "NFG")
    public String getNfg() {
        return nfg;
    }

    public void setNfg(String nfg) {
        this.nfg = nfg;
    }


    @Column(name = "NTE")
    public String getNte() {
        return nte;
    }

    public void setNte(String nte) {
        this.nte = nte;
    }


    @Column(name = "NWI")
    public BigDecimal getNwi() {
        return nwi;
    }

    public void setNwi(BigDecimal nwi) {
        this.nwi = nwi;
    }


    @Column(name = "OTT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getOtt() {
        return ott;
    }

    public void setOtt(Date ott) {
        this.ott = ott;
    }


    @Column(name = "PAB")
    public Integer getPab() {
        return pab;
    }

    public void setPab(Integer pab) {
        this.pab = pab;
    }


    @Column(name = "PAQ")
    public String getPaq() {
        return paq;
    }

    public void setPaq(String paq) {
        this.paq = paq;
    }


    @Column(name = "PAZ")
    public BigInteger getPaz() {
        return paz;
    }

    public void setPaz(BigInteger paz) {
        this.paz = paz;
    }


    @Column(name = "PBG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getPbg() {
        return pbg;
    }

    public void setPbg(Date pbg) {
        this.pbg = pbg;
    }


    @Column(name = "PBR")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getPbr() {
        return pbr;
    }

    public void setPbr(Date pbr) {
        this.pbr = pbr;
    }


    @Column(name = "PEB")
    public Integer getPeb() {
        return peb;
    }

    public void setPeb(Integer peb) {
        this.peb = peb;
    }


    @Column(name = "PIL")
    public String getPil() {
        return pil;
    }

    public void setPil(String pil) {
        this.pil = pil;
    }


    @Column(name = "PKF")
    public String getPkf() {
        return pkf;
    }

    public void setPkf(String pkf) {
        this.pkf = pkf;
    }


    @Column(name = "PKK")
    public Integer getPkk() {
        return pkk;
    }

    public void setPkk(Integer pkk) {
        this.pkk = pkk;
    }


    @Column(name = "PKT")
    public String getPkt() {
        return pkt;
    }

    public void setPkt(String pkt) {
        this.pkt = pkt;
    }


    @Column(name = "PKZ")
    public String getPkz() {
        return pkz;
    }

    public void setPkz(String pkz) {
        this.pkz = pkz;
    }


    @Column(name = "PNR")
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }


    @Column(name = "POS")
    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }


    @Column(name = "PRT")
    public BigInteger getPrt() {
        return prt;
    }

    public void setPrt(BigInteger prt) {
        this.prt = prt;
    }


    @Column(name = "PST")
    public Integer getPst() {
        return pst;
    }

    public void setPst(Integer pst) {
        this.pst = pst;
    }


    @Column(name = "PTT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getPtt() {
        return ptt;
    }

    public void setPtt(Date ptt) {
        this.ptt = ptt;
    }


    @Column(name = "RECEIVEDAT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getReceivedat() {
        return receivedat;
    }

    public void setReceivedat(Date receivedat) {
        this.receivedat = receivedat;
    }


    @Column(name = "REG")
    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }


    @Column(name = "REM")
    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem;
    }


    @Column(name = "RMT")
    public BigInteger getRmt() {
        return rmt;
    }

    public void setRmt(BigInteger rmt) {
        this.rmt = rmt;
    }


    @Column(name = "ROE")
    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }


    @Column(name = "RWY")
    public String getRwy() {
        return rwy;
    }

    public void setRwy(String rwy) {
        this.rwy = rwy;
    }


    @Column(name = "S20")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getS20() {
        return s20;
    }

    public void setS20(Date s20) {
        this.s20 = s20;
    }


    @Column(name = "S48")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getS48() {
        return s48;
    }

    public void setS48(Date s48) {
        this.s48 = s48;
    }


    @Column(name = "S57")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getS57() {
        return s57;
    }

    public void setS57(Date s57) {
        this.s57 = s57;
    }


    @Column(name = "SAA")
    public String getSaa() {
        return saa;
    }

    public void setSaa(String saa) {
        this.saa = saa;
    }


    @Column(name = "SAL")
    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }


    @Column(name = "SDB")
    public String getSdb() {
        return sdb;
    }

    public void setSdb(String sdb) {
        this.sdb = sdb;
    }


    @Column(name = "SDD")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSdd() {
        return sdd;
    }

    public void setSdd(Date sdd) {
        this.sdd = sdd;
    }


    @Column(name = "SDF")
    public String getSdf() {
        return sdf;
    }

    public void setSdf(String sdf) {
        this.sdf = sdf;
    }


    @Column(name = "SDG")
    public String getSdg() {
        return sdg;
    }

    public void setSdg(String sdg) {
        this.sdg = sdg;
    }


    @Column(name = "SDS")
    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
    }


    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


    @Column(name = "SID")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }


    @Column(name = "SIS")
    public String getSis() {
        return sis;
    }

    public void setSis(String sis) {
        this.sis = sis;
    }


    @Column(name = "SIU")
    public String getSiu() {
        return siu;
    }

    public void setSiu(String siu) {
        this.siu = siu;
    }


    @Column(name = "SIZ")
    public String getSiz() {
        return siz;
    }

    public void setSiz(String siz) {
        this.siz = siz;
    }


    @Column(name = "SKZ")
    public String getSkz() {
        return skz;
    }

    public void setSkz(String skz) {
        this.skz = skz;
    }


    @Column(name = "SLA")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSla() {
        return sla;
    }

    public void setSla(Date sla) {
        this.sla = sla;
    }


    @Column(name = "SLE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSle() {
        return sle;
    }

    public void setSle(Date sle) {
        this.sle = sle;
    }


    @Column(name = "SOF")
    public Integer getSof() {
        return sof;
    }

    public void setSof(Integer sof) {
        this.sof = sof;
    }


    @Column(name = "SOURCEINFORMATION")
    public String getSourceinformation() {
        return sourceinformation;
    }

    public void setSourceinformation(String sourceinformation) {
        this.sourceinformation = sourceinformation;
    }


    @Column(name = "SRE")
    public String getSre() {
        return sre;
    }

    public void setSre(String sre) {
        this.sre = sre;
    }


    @Column(name = "SSK")
    public String getSsk() {
        return ssk;
    }

    public void setSsk(String ssk) {
        this.ssk = ssk;
    }


    @Column(name = "SSR")
    public String getSsr() {
        return ssr;
    }

    public void setSsr(String ssr) {
        this.ssr = ssr;
    }


    @Column(name = "ST1")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSt1() {
        return st1;
    }

    public void setSt1(Date st1) {
        this.st1 = st1;
    }


    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Column(name = "STT")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStt() {
        return stt;
    }

    public void setStt(Date stt) {
        this.stt = stt;
    }


    @Column(name = "SUG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSug() {
        return sug;
    }

    public void setSug(Date sug) {
        this.sug = sug;
    }


    @Column(name = "SUK")
    public String getSuk() {
        return suk;
    }

    public void setSuk(String suk) {
        this.suk = suk;
    }


    @Column(name = "SUR")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getSur() {
        return sur;
    }

    public void setSur(Date sur) {
        this.sur = sur;
    }


    @Column(name = "TAG")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Column(name = "TBE")
    public String getTbe() {
        return tbe;
    }

    public void setTbe(String tbe) {
        this.tbe = tbe;
    }


    @Column(name = "TBG")
    public String getTbg() {
        return tbg;
    }

    public void setTbg(String tbg) {
        this.tbg = tbg;
    }


    @Column(name = "TER")
    public String getTer() {
        return ter;
    }

    public void setTer(String ter) {
        this.ter = ter;
    }


    @Column(name = "TEXT")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Column(name = "TXG")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTxg() {
        return txg;
    }

    public void setTxg(Date txg) {
        this.txg = txg;
    }


    @Column(name = "TXR")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTxr() {
        return txr;
    }

    public void setTxr(Date txr) {
        this.txr = txr;
    }


    @Column(name = "TYP")
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }


    @Column(name = "UAZ")
    public BigInteger getUaz() {
        return uaz;
    }

    public void setUaz(BigInteger uaz) {
        this.uaz = uaz;
    }


    @Column(name = "UKZ")
    public String getUkz() {
        return ukz;
    }

    public void setUkz(String ukz) {
        this.ukz = ukz;
    }


    @Column(name = "UNT")
    public String getUnt() {
        return unt;
    }

    public void setUnt(String unt) {
        this.unt = unt;
    }


    @Column(name = "VER")
    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }


    @Column(name = "VIP")
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }


    @Column(name = "VK1")
    public String getVk1() {
        return vk1;
    }

    public void setVk1(String vk1) {
        this.vk1 = vk1;
    }


    @Column(name = "VK2")
    public String getVk2() {
        return vk2;
    }

    public void setVk2(String vk2) {
        this.vk2 = vk2;
    }


    @Column(name = "VK3")
    public String getVk3() {
        return vk3;
    }

    public void setVk3(String vk3) {
        this.vk3 = vk3;
    }


    @Column(name = "VK4")
    public String getVk4() {
        return vk4;
    }

    public void setVk4(String vk4) {
        this.vk4 = vk4;
    }


    @Column(name = "VK5")
    public String getVk5() {
        return vk5;
    }

    public void setVk5(String vk5) {
        this.vk5 = vk5;
    }


    @Column(name = "XBV")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getXbv() {
        return xbv;
    }

    public void setXbv(Date xbv) {
        this.xbv = xbv;
    }


    @Column(name = "XFD")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getXfd() {
        return xfd;
    }

    public void setXfd(Date xfd) {
        this.xfd = xfd;
    }


    @Column(name = "ZAL")
    public String getZal() {
        return zal;
    }

    public void setZal(String zal) {
        this.zal = zal;
    }


    @Column(name = "ZAT")
    public String getZat() {
        return zat;
    }

    public void setZat(String zat) {
        this.zat = zat;
    }


    @Column(name = "ZES")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getZes() {
        return zes;
    }

    public void setZes(Date zes) {
        this.zes = zes;
    }


    @Column(name = "ZFD")
    public Integer getZfd() {
        return zfd;
    }

    public void setZfd(Integer zfd) {
        this.zfd = zfd;
    }


    @Column(name = "ZOL")
    public String getZol() {
        return zol;
    }

    public void setZol(String zol) {
        this.zol = zol;
    }


    @Column(name = "ZOT")
    public String getZot() {
        return zot;
    }

    public void setZot(String zot) {
        this.zot = zot;
    }
}
