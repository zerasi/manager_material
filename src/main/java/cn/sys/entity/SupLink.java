package cn.sys.entity;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-03-22
 */
public class SupLink {
    private Integer id;

    private String real_name;

    private String sex;

    /**
     * 地区
     */
    private String area_id;

    private String acc_nbr;

    private String bak1;

    private String bak2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id == null ? null : area_id.trim();
    }

    public String getAcc_nbr() {
        return acc_nbr;
    }

    public void setAcc_nbr(String acc_nbr) {
        this.acc_nbr = acc_nbr == null ? null : acc_nbr.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }
}