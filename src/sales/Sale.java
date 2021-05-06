package sales;

/**
 * lsy create in 2021/05/05/17:17
 */
public class Sale {
    private String code;
    private String name;
    private String sprice;
    private Integer cum;
    private Double totl;
    private String date;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprice() {
        return sprice;
    }

    public void setSprice(String sprice) {
        this.sprice = sprice;
    }

    public Integer getCum() {
        return cum;
    }

    public void setCum(Integer cum) {
        this.cum = cum;
    }

    public Double getTotl() {
        return totl;
    }

    public void setTotl(Double totl) {
        this.totl = totl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
